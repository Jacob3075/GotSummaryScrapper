package com.jacob.got_summary.formatters

import com.jacob.got_summary.Constants.json
import com.jacob.got_summary.models.Book
import kotlinx.serialization.encodeToString


class JsonFormatter : Formatter {
	override val fileExtension: String
		get() = "json"

	override fun formatData(data: Book): String =
		json.encodeToString(data)
}
