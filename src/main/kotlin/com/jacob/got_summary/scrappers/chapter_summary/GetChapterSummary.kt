package com.jacob.got_summary.scrappers.chapter_summary

import com.jacob.got_summary.ChapterLink
import com.jacob.got_summary.models.Chapter

interface GetChapterSummary {
    fun getChapterSummary(index: Int, chapterLink: ChapterLink): Chapter
}
