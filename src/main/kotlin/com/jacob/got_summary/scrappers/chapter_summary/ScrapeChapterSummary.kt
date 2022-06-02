package com.jacob.got_summary.scrappers.chapter_summary

import com.jacob.got_summary.ChapterLink
import com.jacob.got_summary.models.Chapter
import com.jacob.got_summary.models.Chapter.Content
import it.skrape.core.htmlDocument
import it.skrape.fetcher.HttpFetcher
import it.skrape.fetcher.response
import it.skrape.fetcher.skrape
import it.skrape.selects.CssSelector
import it.skrape.selects.DocElement
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
			lateinit var placeName: String
			lateinit var contents: List<Content>
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

							contents =
								children { this }.drop(1)
										.takeWhile { "table" !in it.tagName }
										.mapNotNull {
											when (it.tagName) {
												"p" -> Content.Text(it.text)
												"div" -> it.getImageDetailsFromElement()
												"blockquote" -> Content.Quote(it.text)
												else -> null
											}
										}
						}
					}
				}
			}

			Chapter(
				index = index,
				title = Chapter.Title(title),
				content = contents,
				place = Chapter.PlaceName(placeName),
				pov = Chapter.Character(pov)
			)
		}


	private fun DocElement.getImageDetailsFromElement(): Content.Image? = when {
		eachImage.values.isEmpty() -> null
		else -> Content.Image(
			caption = text,
			link = eachImage.values.first(),
		)
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
