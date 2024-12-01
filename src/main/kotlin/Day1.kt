class Day1 {
    fun part1(input: String): Long = input
        .lines()
        .map {
            it
                .split(' ')
                .filter(String::isNotBlank)
                .map(String::toLong)
        }
        .filter(List<Long>::isNotEmpty)
        .map { it[0] to it[1] }
        .unzip()
        .let { (l, r) -> l.sorted().zip(r.sorted()) }
        .map { (l, r) -> l - r }
        .map(Math::abs)
        .sum()
}