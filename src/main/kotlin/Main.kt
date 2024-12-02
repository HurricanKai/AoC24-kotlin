import java.io.File

fun main() {

    println("Day 1 Part 1: ${Day1().part1(File("./inputs/day1").readText())}")
    println("Day 1 Part 2: ${Day1().part2(File("./inputs/day1").readText())}")

    println("Day 2 Part 1: ${Day2().part1(File("./inputs/day2").readText())}")
    println("Day 2 Part 2: ${Day2().part2(File("./inputs/day2").readText())}")
}

