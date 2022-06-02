package com.jacob.got_summary

import com.jacob.got_summary.formatters.JsonFormatter
import com.jacob.got_summary.scrappers.chapter_links.GetChapterLinks
import com.jacob.got_summary.scrappers.chapter_links.GetSavedChapterLinks
import com.jacob.got_summary.scrappers.chapter_summary.GetChapterSummary
import com.jacob.got_summary.scrappers.chapter_summary.ScrapeChapterSummary
import com.jacob.got_summary.writer.FileWriter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking

fun main() {
	Main(
		getChapterLinks = GetSavedChapterLinks(),
		getChapterSummary = ScrapeChapterSummary(),
		fileWriter = FileWriter("Sample", formatter = JsonFormatter()),
	).createSummaries()
}

class Main(
	private val getChapterLinks: GetChapterLinks,
	private val getChapterSummary: GetChapterSummary,
	val fileWriter: FileWriter,
) {
	fun createSummaries() {
		val links = getChapterLinks.getLinks()

		val booksWithLinks = links.groupBy(
			::extractBookName,
		) { ChapterLink("${Constants.BASE_URL}$it") }

		runBlocking(Dispatchers.IO) {
			booksWithLinks.values.first()
					.take(6)
					.mapIndexedParallel(getChapterSummary::getChapterSummary)
					.let(fileWriter::writeDataToFile)
		}

//		val chapterSummary = (getChapterSummary as GetSavedChapterSummary).getChapterSummary()
//		fileWriter.writeDataToFile(chapterSummary)
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
