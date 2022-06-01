package com.jacob.got_summary.models

import kotlinx.serialization.Serializable

@Serializable
data class Chapter(
	val index: Int,
	val title: Title,
	val content: Content,
	val place: PlaceName,
	val pov: Character,
) {
	@Serializable
	data class Content(val text: String, val imageLinks: List<String>)

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
