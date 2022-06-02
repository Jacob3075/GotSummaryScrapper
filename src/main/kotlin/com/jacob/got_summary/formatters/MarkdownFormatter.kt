package com.jacob.got_summary.formatters

import com.jacob.got_summary.models.Chapter

class MarkdownFormatter : Formatter {
	override val fileExtension: String
		get() = "md"

	override fun formatData(data: Chapter) = buildString {
		append(title1("${data.index}. ${data.title.name}"))
		append("\n")
		append(body(data.content.text.joinToString("\n")))
		append(divider())
	}

	override fun formatData(data: List<Chapter>): String =
		data.joinToString(separator = "", transform = ::formatData)

	private fun title1(text: String) = """<h1 style="text-align: center;">$text</h1>"""

	private fun title2(text: String) = """<h2 style="text-align: center;">$text</h2>"""

	private fun body(text: String) = text

	private fun divider() = "\n\n---\n\n"
}
