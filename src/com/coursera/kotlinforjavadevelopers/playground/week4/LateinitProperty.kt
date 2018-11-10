package com.coursera.kotlinforjavadevelopers.playground.week4

class A {
    private lateinit var prop: String

    fun setUp() {
        prop = "value"
    }

    fun display() {
        println(prop)
    }
}

fun main(args: Array<String>) {
    val a = A()
    a.setUp()
    a.display() // throws UninitializedPropertyAccessException if setUp() was not called

}