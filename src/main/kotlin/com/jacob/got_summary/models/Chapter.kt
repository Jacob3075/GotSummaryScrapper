package com.jacob.got_summary.models

data class Chapter(
    val index: Int,
    val title: Title,
    val content: Content,
    val place: PlaceName,
    val pov: Character,
) {
    data class Content(val text: String, val imageLinks: List<String>)

    @JvmInline
    value class Title(val name: String)

    @JvmInline
    value class Character(val name: String)

    @JvmInline
    value class PlaceName(val name: String)
}
