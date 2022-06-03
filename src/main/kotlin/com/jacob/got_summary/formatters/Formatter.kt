package com.jacob.got_summary.formatters

import com.jacob.got_summary.models.Book

interface Formatter {
	val fileExtension: String
	fun formatData(data: Book): String
}
