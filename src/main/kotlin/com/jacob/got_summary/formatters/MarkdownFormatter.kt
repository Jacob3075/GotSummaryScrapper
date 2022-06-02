package com.jacob.got_summary.formatters

import com.jacob.got_summary.models.Book
import com.jacob.got_summary.models.Chapter
import org.intellij.lang.annotations.Language

class MarkdownFormatter : Formatter {
	override val fileExtension: String
		get() = "md"

	override fun formatData(data: Chapter) = buildString {
		append(title2("${data.index}. ${data.title.name}"))
		append(body(data.content.text.joinToString(separator = "\n\n")))
		append(divider())
	}

	override fun formatData(data: Book): String =
		title1(data.title) + data.chapters.joinToString(separator = "", transform = ::formatData)

	@Language("Markdown")
	private fun title1(text: String) = "# $text\n\n"

	@Language("Markdown")
	private fun title2(text: String) = "## $text\n\n"

	private fun body(text: String) = "$text\n\n"

	private fun divider() = "---\n\n"
}
