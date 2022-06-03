package com.jacob.got_summary.formatters

import com.jacob.got_summary.models.Book
import com.jacob.got_summary.models.Chapter
import com.jacob.got_summary.models.Chapter.Content
import org.intellij.lang.annotations.Language

class MarkdownFormatter : Formatter {
	override val fileExtension: String
		get() = "md"

	override fun formatData(data: Chapter) = """
		|${chapterTitle(data)}
		|${
		data.content.joinToString(separator = "\n\n", transform = ::getContentText)
				.let(::body)
	}
		|${divider()}
		|""".trimIndent()
			.trimMargin()

	override fun formatData(data: Book): String =
		title(data.title) + tableOfContents(data.chapters) + data.chapters.joinToString(
			separator = "",
			transform = ::formatData
		)

	@Language("Markdown")
	private fun getContentText(content: Content) = when (content) {
		is Content.Text -> content.text
		is Content.Image -> imageWithCaption(content.link, content.caption)
		is Content.Quote -> "> ${content.text}"
	}

	@Language("Markdown")
	private fun title(text: String) = "# $text\n\n"

	@Language("Markdown")
	private fun chapterTitle(chapter: Chapter) = """
		|<div id="${chapter.title.linkName}"> </div>
		|
		|## ${chapter.index}. ${chapter.title.name}
		|""".trimIndent()
			.trimMargin()

	@Language("Markdown")
	private fun body(text: String) = "$text\n"

	@Language("HTML")
	private fun imageWithCaption(imageLink: String, caption: String) = """
		<figure>
		<img src="$imageLink" alt="" style="width:50%">
		<figcaption><b>$caption</b></figcaption>
		</figure>
		""".trimIndent()

	@Language("Markdown")
	private fun tableOfContents(chapters: List<Chapter>): String = """
		|${divider()}
		|## Table of Contents
		|
		|${chapters.joinToString("\n", transform = ::createListItem)}	
		|${divider()}
		|""".trimIndent()
			.trimMargin()

	@Language("Markdown")
	private fun createListItem(chapter: Chapter): String = """
		|${chapter.index}. [${chapter.title.name}](#${chapter.title.linkName})
		|""".trimIndent()
			.trimMargin()

	@Language("Markdown")
	private fun divider() = "---\n"

	private val Chapter.Title.linkName: String
		get() = name.lowercase()
				.replace(" ", "_")
}
