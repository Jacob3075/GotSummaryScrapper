package com.jacob.got_summary

import com.jacob.got_summary.formatters.TextFormatter
import com.jacob.got_summary.writer.FileWriter

fun main() {
    val links = getSavedLinks()

    val booksWithLinks = links.groupBy(
        { it.split("/").last().split("-").first().replace("_", " ").let(::BookName) },
        { ChapterLink("$BASE_URL$it") },
    )

    val fileWriter = FileWriter("Sample.txt", formatter = TextFormatter())

    booksWithLinks.values.first().take(3).asSequence().mapIndexed(::parseChapterSummary)
        .forEach(fileWriter::appendDataToFile)
}

@JvmInline
value class ChapterLink(val link: String)

@JvmInline
value class BookName(val name: String)
