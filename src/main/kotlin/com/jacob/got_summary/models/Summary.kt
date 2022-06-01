package com.jacob.got_summary.models

data class Summary(
	val books: List<Book>,
	val characters: List<CharacterSummary>,
	val places: List<Place>,
)
