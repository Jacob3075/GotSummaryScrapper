package com.jacob.got_summary

import com.jacob.got_summary.formatters.MarkdownFormatter
import com.jacob.got_summary.models.Book
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
		fileWriter = FileWriter(formatter = MarkdownFormatter()),
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
			booksWithLinks.forEach { (bookName, chapterLinks) ->
				chapterLinks.dropLast(1)
						.mapIndexedParallelChunked(6, getChapterSummary::getChapterSummary)
						.let { Book(bookName.name, it) }
						.let {
							fileWriter.newFile(it.title)
							fileWriter.writeDataToFile(it)
						}
			}
		}
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
