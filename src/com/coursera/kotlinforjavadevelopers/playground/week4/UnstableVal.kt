package com.coursera.kotlinforjavadevelopers.playground.week4

import kotlin.random.Random

private var counter = 0
val foo: Int
    get() =
        if (Random.nextBoolean())
            counter++
        else
            Random.nextInt()

fun main(args: Array<String>) {
    // The values should be different:
    println(foo)
    println(foo)
    println(foo)
}