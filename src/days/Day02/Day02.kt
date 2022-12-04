package days.Day02

import readInput

//Part1
//A - Rock     - X : 1 Point
//B - Paper    - Y : 2 Points
//C - Scissors - Z : 3 Points

//W = 6
//D = 3
//L = 0

//Part2
//W = 6 Z
//D = 3 Y
//L = 0 X

fun main() {
    // test if implementation meets criteria from the description, like:
    val inputPart1 = readInput("Day02")
    println(part1(inputPart1))

    val inputPart2 = readInput("Day02")
    println(part2(inputPart2))
}

fun part1(input: String): Int {
    return getTotalScore(input)
}

private fun getTotalScore(rounds: String): Int {
    return rounds
        .split("\n")
        .sumOf {
            val signs = it.split(" ")
            getResult(signs[0], signs[1]) + getSignValue(signs[1])
        }
}

private fun getResult(opponentSign: String, yourSign: String): Int {
    return when (opponentSign) {
        "A" -> when (yourSign) {
            "X" -> 3
            "Y" -> 6
            else -> 0
        }
        "B" -> when (yourSign) {
            "X" -> 0
            "Y" -> 3
            else -> 6
        }
        "C" -> when (yourSign) {
            "X" -> 6
            "Y" -> 0
            else -> 3
        }
        else -> 0
    }
}

private fun getSignValue(sign: String): Int {
    return when (sign) {
        "X" -> 1
        "Y" -> 2
        "Z" -> 3
        else -> 0
    }
}


fun part2(input: String): Int {
    return getTotalScorePart2(input)
}

private fun getTotalScorePart2(rounds: String): Int {
    return rounds
        .split("\n")
        .sumOf {
            val values = it.split(" ")
            getResultPart2(values[0], values[1])
        }
}

private fun getResultPart2(opponentSign: String, condition: String): Int {
    return when (opponentSign) {
        "A" -> when (condition) {
            "X" -> 3
            "Y" -> 4
            else -> 8
        }
        "B" -> when (condition) {
            "X" -> 1
            "Y" -> 5
            else -> 9
        }
        "C" -> when (condition) {
            "X" -> 2
            "Y" -> 6
            else -> 7
        }
        else -> 0
    }
}



