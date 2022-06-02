package com.jacob.got_summary

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

suspend fun <T, R> Iterable<T>.mapIndexedParallel(transform: (Int, T) -> R): List<R> =
	coroutineScope {
		mapIndexed { index, item -> async { transform(index, item) } }.map { it.await() }
	}
