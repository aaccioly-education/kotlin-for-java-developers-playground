package com.coursera.kotlinforjavadevelopers.playground.week3

import com.coursera.kotlinforjavadevelopers.playground.common.eq

fun main(args: Array<String>) {

    val s1: String? = null
    val s2: String? = ""
    s1.isEmptyOrNull() eq true
    s2.isEmptyOrNull() eq true

    val s3 = "   "
    s3.isEmptyOrNull() eq false
}

                            // or this == null || this.isEmpty()
fun String?.isEmptyOrNull() = this?.isEmpty() ?: true