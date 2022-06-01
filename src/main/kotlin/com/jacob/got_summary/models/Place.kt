package com.jacob.got_summary.models

data class Place(
	val location: String,
	val ruler: List<String>,
	val religion: String,
	val founded: String,
	val notablePlace: List<NotablePlace>,
	val history: String,
	val recentEvents: List<RecentEvent>,
) {
	data class NotablePlace(val history: String, val recentEvents: List<RecentEvent>)

	data class RecentEvent(val bookName: String, val text: String)
}
