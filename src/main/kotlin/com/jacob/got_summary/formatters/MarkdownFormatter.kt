package com.jacob.got_summary.formatters

import com.jacob.got_summary.models.Book
import com.jacob.got_summary.models.Chapter
import com.jacob.got_summary.models.Chapter.Content
import org.intellij.lang.annotations.Language

class MarkdownFormatter : Formatter {
	override val fileExtension: String
		get() = "md"

	override fun formatData(data: Chapter) = buildString {
		append(title2("${data.index}. ${data.title.name}"))
		data.content.joinToString(separator = "\n\n", transform = ::getContentText)
				.let(::body)
				.let<String, StringBuilder>(::append)
		append(divider())
	}

	override fun formatData(data: Book): String =
		title1(data.title) + data.chapters.joinToString(separator = "", transform = ::formatData)

	@Language("Markdown")
	private fun getContentText(content: Content): CharSequence = when (content) {
		is Content.Text -> content.text
		is Content.Image -> imageWithCaption(content.link, content.caption)
		is Content.Quote -> "> ${content.text}"
	}

	@Language("Markdown")
	private fun title1(text: String) = "# $text\n\n"

	@Language("Markdown")
	private fun title2(text: String) = "## $text\n\n"

	@Language("Markdown")
	private fun body(text: String) = "$text\n\n"

	@Language("Markdown")
	private fun divider() = "---\n\n"

	@Language("Markdown")
	private fun imageWithCaption(imageLink: String, caption: String) = """
		<figure>
		<img src="$imageLink" alt="" style="width:50%">
		<figcaption><b>$caption</b></figcaption>
		</figure>
		
		""".trimIndent()
}
