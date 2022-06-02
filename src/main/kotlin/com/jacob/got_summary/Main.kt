package com.jacob.got_summary

import com.jacob.got_summary.formatters.MarkdownFormatter
import com.jacob.got_summary.scrappers.chapter_links.GetChapterLinks
import com.jacob.got_summary.scrappers.chapter_links.GetSavedChapterLinks
import com.jacob.got_summary.scrappers.chapter_summary.GetChapterSummary
import com.jacob.got_summary.scrappers.chapter_summary.GetSavedChapterSummary
import com.jacob.got_summary.writer.FileWriter

fun main() {
	Main(
		getChapterLinks = GetSavedChapterLinks(),
		getChapterSummary = GetSavedChapterSummary(),
		fileWriter = FileWriter("Sample", formatter = MarkdownFormatter()),
	).createSummaries()
}

class Main(
	private val getChapterLinks: GetChapterLinks,
	private val getChapterSummary: GetChapterSummary,
	val fileWriter: FileWriter,
) {
	fun createSummaries() {
//		val links = getChapterLinks.getLinks()
//
//		val booksWithLinks = links.groupBy(
//			::extractBookName,
//		) { ChapterLink("${Constants.BASE_URL}$it") }
//
//		booksWithLinks.values.first()
//				.take(6)
//				.asSequence()
//				.mapIndexed(getChapterSummary::getChapterSummary)
//				.toList()
//				.let(fileWriter::writeDataToFile)

		val chapterSummary = (getChapterSummary as GetSavedChapterSummary).getChapterSummary()
		fileWriter.writeDataToFile(chapterSummary)
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
