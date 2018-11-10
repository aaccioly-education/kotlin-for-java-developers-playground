package com.coursera.kotlinforjavadevelopers.playground.week4

open class Parent(open val value: String) {
    init {
        println(value.length)
    }
}

class Child(override val value: String) : Parent(value)

fun main(args: Array<String>) {
    Child("a") /*
                      * Throws NPE since Child is overriding value.
                      * During parent initialization, Child.value has not yet been initialized.
                      * Referencing open fields from constructors in Kotlin results in a constructor warning.
                      * You can fix the problems by removing "override val", i.e., value is just a constructor field
                      */
}