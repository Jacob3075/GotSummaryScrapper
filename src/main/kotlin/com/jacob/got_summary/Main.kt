package com.jacob.got_summary

fun main() {
    val links = getSavedLinks()

    val booksWithLinks = links.groupBy(
        { it.split("/").last().split("-").first().replace("_", " ").let(::BookName) },
        { ChapterLink("$BASE_URL$it") },
    )

    println("booksWithLinks = $booksWithLinks")
}

@JvmInline
value class ChapterLink(val link: String)

@JvmInline
value class BookName(val name: String)
