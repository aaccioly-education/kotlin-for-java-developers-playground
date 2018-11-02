package com.coursera.kotlinforjavadevelopers.playground.week2

infix fun <T> T.eq(other: T) {
    if (this == other) println("OK!")
    else println("Error: $this != $other")
}