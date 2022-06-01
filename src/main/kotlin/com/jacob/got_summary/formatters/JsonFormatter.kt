package com.jacob.got_summary.formatters

import com.jacob.got_summary.Constants.json
import com.jacob.got_summary.models.Chapter
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json


class JsonFormatter : Formatter {
	override val fileExtension: String
		get() = "json"

	override fun formatData(data: Chapter): String = Json.encodeToString(data)

	override fun formatData(data: List<Chapter>): String =
		json.encodeToString(data)
}
