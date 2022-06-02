package com.jacob.got_summary.scrappers.chapter_summary

import com.jacob.got_summary.ChapterLink
import com.jacob.got_summary.Constants.BASE_URL
import com.jacob.got_summary.models.Chapter
import it.skrape.core.htmlDocument
import it.skrape.fetcher.HttpFetcher
import it.skrape.fetcher.response
import it.skrape.fetcher.skrape
import it.skrape.selects.CssSelector
import it.skrape.selects.DocElement
import it.skrape.selects.eachSrc
import it.skrape.selects.html5.*
import it.skrape.selects.text

class ScrapeChapterSummary : GetChapterSummary {
	override fun getChapterSummary(index: Int, chapterLink: ChapterLink): Chapter =
		skrape(HttpFetcher) {
			println("START $index")
			request {
				url = chapterLink.link
			}

			lateinit var title: String
			lateinit var contentText: String
			lateinit var imageLinks: List<String>
			lateinit var placeName: String
			lateinit var pov: String

			response {
				htmlDocument {
					val chapterSummaryTable = table {
						withClass = "infobox"
						findFirst { tbody { this } }
					}

					chapterSummaryTable.tr {
						findAll {
							title = first().text

							val allTableRows = th { findAll { this } }

							pov = getValueFromRowWithName(allTableRows, "POV")
							placeName = getValueFromRowWithName(allTableRows, "Place")
						}
					}

					div {
						withClass = "mw-parser-output"
						findFirst {
							contentText = getContentTextFromParaTag()
							imageLinks = getImagesFromSummary()
						}
					}
				}
			}

			Chapter(
				index = index,
				title = Chapter.Title(title),
				content = Chapter.Content(contentText, imageLinks),
				place = Chapter.PlaceName(placeName),
				pov = Chapter.Character(pov)
			)
		}

	private fun DocElement.getContentTextFromParaTag() = p {
		findAll {
			takeWhile { "Appearing" !in it.text }.joinToString(separator = "\n") {
				Regex("\\[N \\d+]").replace(it.text, "") // works }
			}
		}
	}

	private fun DocElement.getImagesFromSummary() = img {
		findAll {
			eachSrc.map { "$BASE_URL$it" }
		}
	}

	private fun CssSelector.getValueFromRowWithName(
		docElements: List<DocElement>,
		rowName: String,
	) = docElements.first { it.text.contains(rowName) }
			.let {
				it.siblings {
					td {
						text
					}
				}
			}
}
