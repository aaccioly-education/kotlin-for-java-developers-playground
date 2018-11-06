package com.coursera.kotlinforjavadevelopers.playground.week3

fun main(args: Array<String>) {
    val s = "abc"
    println(s as? Int)    // null
    println(s as Int?)    // exception
}