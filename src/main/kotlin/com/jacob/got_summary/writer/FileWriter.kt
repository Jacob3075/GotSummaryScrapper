package com.jacob.got_summary.writer

import com.jacob.got_summary.formatters.Formatter
import com.jacob.got_summary.models.Chapter
import java.io.File

class FileWriter(
    fileName: String,
    directoryPath: String = "output/",
    private val formatter: Formatter,
) {
    private val file = File("$directoryPath$fileName")

    fun appendDataToFile(data: Chapter) = file.appendText(formatter.formatData(data))
}
