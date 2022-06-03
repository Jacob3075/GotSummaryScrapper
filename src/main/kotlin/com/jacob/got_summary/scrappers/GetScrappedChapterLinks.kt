package com.jacob.got_summary.scrappers

import com.jacob.got_summary.Constants.BASE_URL
import it.skrape.core.htmlDocument
import it.skrape.fetcher.HttpFetcher
import it.skrape.fetcher.response
import it.skrape.fetcher.skrape
import it.skrape.selects.eachHref
import it.skrape.selects.html5.a
import it.skrape.selects.html5.div
import it.skrape.selects.html5.li
import it.skrape.selects.html5.ol

class GetScrappedChapterLinks {
	fun getLinks(): List<String> = skrape(HttpFetcher) {
		request {
			url = "$BASE_URL/index.php/Chapters#A_Game_of_Thrones"
		}

		response {
			htmlDocument {
				div {
					withAttribute =
						"style" to "background:#F2EEE6;color:#333;border:6px double white;margin:-3px -3px 2px -3px;padding:8px 12px;"

					findAll {
						ol {
							findAll {
								li {
									a {
										findAll {
											eachHref
										}
									}
								}
							}
						}

					}
				}
			}
		}
	}
}
