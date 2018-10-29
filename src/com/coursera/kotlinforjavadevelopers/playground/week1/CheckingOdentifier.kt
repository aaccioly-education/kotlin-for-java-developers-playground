package com.coursera.kotlinforjavadevelopers.playground.week1

fun isValidIdentifier(s: String): Boolean {
    var isValid = s.isNotEmpty() && (s[0].isLetter() || s[0].equals('_'))
    for (i in 1 until s.length) {
        if (!isValid) {
            break
        }
        isValid = isValid && s[i].isLetterOrDigit()
    }
    return isValid
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}