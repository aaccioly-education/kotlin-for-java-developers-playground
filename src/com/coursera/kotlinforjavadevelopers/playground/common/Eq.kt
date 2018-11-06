package com.coursera.kotlinforjavadevelopers.playground.common

infix fun <T> T.eq(other: T) {
    if (this == other) println("OK!")
    else println("Error: $this != $other")
}