package com.jacob.got_summary.models

sealed class Title {
    data class ViewpointCharacter(val name: String, val number: Int) : Title()

    object Epilogue : Title()

    object Prolog : Title()
}
