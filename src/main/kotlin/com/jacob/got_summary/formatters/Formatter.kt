package com.jacob.got_summary.formatters

import com.jacob.got_summary.models.Chapter

interface Formatter {
    fun formatData(data: Chapter): String
}
