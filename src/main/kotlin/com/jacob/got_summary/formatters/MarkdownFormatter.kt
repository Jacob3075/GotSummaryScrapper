package com.jacob.got_summary.formatters

import com.jacob.got_summary.models.Chapter

class MarkdownFormatter : Formatter {
	override val fileExtension: String
		get() = "md"

	override fun formatData(data: Chapter): String {
		TODO("Not yet implemented")
	}

	override fun formatData(data: List<Chapter>): String {
		TODO("Not yet implemented")
	}
}
