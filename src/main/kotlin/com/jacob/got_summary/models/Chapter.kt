package com.jacob.got_summary.models

import kotlinx.serialization.Serializable

@Serializable
data class Chapter(
	val index: Int,
	val title: Title,
	val content: List<Content>,
	val place: PlaceName,
	val pov: Character,
) {
	@Serializable
	sealed class Content {
		data class Text(val text: String) : Content()
		data class Image(val caption: String, val link: String) : Content()
		data class Quote(val text: String) : Content()
	}

	@Serializable
	@JvmInline
	value class Title(val name: String)

	@Serializable
	@JvmInline
	value class Character(val name: String)

	@Serializable
	@JvmInline
	value class PlaceName(val name: String)
}
