package com.coursera.kotlinforjavadevelopers.playground.week2

import com.coursera.kotlinforjavadevelopers.playground.common.eq

data class Evaluation(val positions: Int, val letters: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    val positions = secret.zip(guess).count { (a, b) -> a == b }
    val commonLetters = "ABCDEF".sumBy { ch ->
        Math.min(secret.count { sCh -> sCh == ch }, guess.count { gCh -> gCh == ch })
    }
    return Evaluation(positions, commonLetters - positions)
}

fun main(args: Array<String>) {
    val result = Evaluation(positions = 1, letters = 1)
    evaluateGuess("BCDF", "ACEB") eq result
    evaluateGuess("AAAF", "ABCA") eq result
    evaluateGuess("ABCA", "AAAF") eq result
}