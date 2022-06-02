package com.jacob.got_summary

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

/**
 *  Performs map transformation on the iterable using coroutines.
 *
 *  [Source](https://github.com/cvb941/kotlin-parallel-operations)
 */
suspend inline fun <T, R> Iterable<T>.mapIndexedParallel(crossinline transform: (Int, T) -> R): List<R> =
	coroutineScope {
		mapIndexed { index, item -> async { transform(index, item) } }.map { it.await() }
	}

/**
 *  Performs map transformation on the iterable using coroutines.
 *  The chunkSize parameter is used to run multiple transformations on a single coroutine.
 *
 *  [Source](https://github.com/cvb941/kotlin-parallel-operations)
 *
 *  @param chunkSize Size of each sub-collection that will be reduced in each coroutine.
 */
suspend inline fun <T, R> Iterable<T>.mapIndexedParallelChunked(
	chunkSize: Int,
	crossinline transform: suspend (index: Int, T) -> R,
): List<R> = coroutineScope {
	withIndex().chunked(chunkSize)
			.map { subChunk ->
				async {
					subChunk.map { transform(it.index, it.value) }
				}
			}
			.flatMap { it.await() }
}
