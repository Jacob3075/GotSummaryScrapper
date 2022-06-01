package com.jacob.got_summary

import kotlinx.serialization.json.Json

object Constants {
	const val BASE_URL = "https://awoiaf.westeros.org"

	val json = Json { prettyPrint = true }
}
