package com.jacob.got_summary.formatters

import com.jacob.got_summary.models.Chapter

interface Formatter {
	val fileExtension: String
	fun formatData(data: Chapter): String

	fun formatData(data: List<Chapter>): String
}
