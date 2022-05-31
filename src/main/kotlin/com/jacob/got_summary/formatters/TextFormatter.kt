package com.jacob.got_summary.formatters

import com.jacob.got_summary.models.Chapter

class TextFormatter : Formatter {
    override fun formatData(data: Chapter): String = """
        |${data.index}. ${data.title.name} 
        |${data.pov.name} at ${data.place.name} 
        |
        |${data.content.text}
        |${"-".repeat(100)}
        |
        """.trimMargin()
}