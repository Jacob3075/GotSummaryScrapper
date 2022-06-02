package com.jacob.got_summary.formatters

import com.jacob.got_summary.models.Book
import com.jacob.got_summary.models.Chapter

class TextFormatter : Formatter {
	override val fileExtension: String
		get() = "txt"

	override fun formatData(data: Chapter): String = """
        |${data.index}. ${data.title.name} 
        |${data.pov.name} at ${data.place.name} 
        |
        |${data.content.text.joinToString("\n")}
        |${"-".repeat(100)}
        |
        """.trimMargin()

	override fun formatData(data: Book): String =
		data.chapters.joinToString(transform = ::formatData)
}
