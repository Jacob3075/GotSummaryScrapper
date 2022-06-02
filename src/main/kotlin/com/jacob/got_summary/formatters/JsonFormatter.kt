package com.jacob.got_summary.formatters

import com.jacob.got_summary.Constants.json
import com.jacob.got_summary.models.Book
import com.jacob.got_summary.models.Chapter
import kotlinx.serialization.encodeToString


class JsonFormatter : Formatter {
	override val fileExtension: String
		get() = "json"

	override fun formatData(data: Chapter): String = json.encodeToString(data)

	override fun formatData(data: Book): String =
		json.encodeToString(data)
}
