package com.jacob.got_summary

import com.jacob.got_summary.formatters.Formatter
import com.jacob.got_summary.formatters.JsonFormatter
import com.jacob.got_summary.scrappers.chapter_links.GetChapterLinks
import com.jacob.got_summary.scrappers.chapter_links.GetSavedChapterLinks
import com.jacob.got_summary.scrappers.chapter_summary.GetChapterSummary
import com.jacob.got_summary.scrappers.chapter_summary.ScrapeChapterSummary
import com.jacob.got_summary.writer.FileWriter

fun main() {
	Main(
		getChapterLinks = GetSavedChapterLinks(),
		getChapterSummary = ScrapeChapterSummary(),
		formatter = JsonFormatter(),
	).createSummaries()
}

class Main(
	private val getChapterLinks: GetChapterLinks,
	private val getChapterSummary: GetChapterSummary,
	private val formatter: Formatter,
) {
	fun createSummaries() {
		val links = getChapterLinks.getLinks()

		val booksWithLinks = links.groupBy(
			::extractBookName,
		) { ChapterLink("${Constants.BASE_URL}$it") }

		val fileWriter = FileWriter("Sample", formatter = formatter)

		booksWithLinks.values.first()
				.take(3)
				.asSequence()
				.mapIndexed(getChapterSummary::getChapterSummary)
				.toList()
				.let(fileWriter::writeDataToFile)
	}

	private fun extractBookName(it: String) = it.split("/")
			.last()
			.split("-")
			.first()
			.replace("_", " ")
			.let(::BookName)
}

@JvmInline
value class ChapterLink(val link: String)

@JvmInline
value class BookName(val name: String)
