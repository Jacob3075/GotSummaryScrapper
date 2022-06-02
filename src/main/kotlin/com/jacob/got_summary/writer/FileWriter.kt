package com.jacob.got_summary.writer

import com.jacob.got_summary.formatters.Formatter
import com.jacob.got_summary.models.Chapter
import java.io.File

class FileWriter(
	private val directoryPath: String = "output/",
	private val formatter: Formatter,
) {
	private lateinit var file: File

	fun appendDataToFile(data: Chapter) = file.appendText(formatter.formatData(data))

	fun writeDataToFile(data: List<Chapter>) = file.writeText(formatter.formatData(data))

	fun newFile(fileName: String) {
		file = File("$directoryPath$fileName.${formatter.fileExtension}")
	}
}
