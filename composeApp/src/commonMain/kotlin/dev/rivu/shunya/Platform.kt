package dev.rivu.shunya

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform