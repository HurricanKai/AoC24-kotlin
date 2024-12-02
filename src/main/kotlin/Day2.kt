import kotlin.math.abs

class Day2 {
    fun part1(input: String): Int = input
        .lines()
        .map {
            it
                .split(' ')
                .filter(String::isNotBlank)
                .map(String::toLong)
        }
        .filter(List<Long>::isNotEmpty)
        .filter { list -> list
            .zipWithNext { l, r -> l - r }
            .map { d -> ((d <= 3) and (d >= 1)) to ((d >= -3) and (d <= -1)) }
            .fold(true to true) { acc, x -> (acc.first and x.first) to (acc.second and x.second) }
            .let { it.first or it.second }
        }
        .count()

    fun part2(input: String): Int = input
        .lines()
        .map {
            it
                .split(' ')
                .filter(String::isNotBlank)
                .map(String::toLong)
        }
        .filter(List<Long>::isNotEmpty)
        .filter { outer -> outer
            .map(::abs)
            .run { List(size) { i -> this.filterIndexed { i2, _ -> i2 != i } } }
            .any { list -> list
                .zipWithNext { l, r -> l - r }
                .map { d -> ((d <= 3) and (d >= 1)) to ((d >= -3) and (d <= -1)) }
                .fold(true to true) { acc, x -> (acc.first and x.first) to (acc.second and x.second) }
                .let { it.first or it.second }
            }
        }
        .count()
}