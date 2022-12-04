package days.Day01

import readInput

fun main() {
    // test if implementation meets criteria from the description, like:
    val inputPart1 = readInput("Day01")
    println(part1(inputPart1))

    val inputPart2 = readInput("Day01")
    println(part2(inputPart2))
}

fun part1(input: String): Int {
    return getMaxCalories(input)
}

fun getMaxCalories(values: String): Int {
    return values
        .split("\n\n")
        .map { elfValues ->
            elfValues
                .split("\n")
                .sumOf { it.toInt() }
        }
        .max()
}

fun part2(input: String): Int {
    return getMaxCaloriesOfTheTopN(input, 3)
}

fun getMaxCaloriesOfTheTopN(values: String, n: Int): Int {
    return values
        .split("\n\n")
        .map { elfValues ->
            elfValues
                .split("\n")
                .sumOf { it.toInt() }
        }
        .sortedDescending()
        .take(n)
        .sum()
}
