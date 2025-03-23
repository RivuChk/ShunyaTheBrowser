package dev.rivu.shunya

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Shunya The Browser",
    ) {
        App()
    }
}