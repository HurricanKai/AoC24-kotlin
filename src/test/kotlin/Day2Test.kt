import kotlin.test.Test

class Day2Test {
    @Test
    fun samplePart1() {
        val result = Day2().part1("7 6 4 2 1\n" +
                "1 2 7 8 9\n" +
                "9 7 6 2 1\n" +
                "1 3 2 4 5\n" +
                "8 6 4 4 1\n" +
                "1 3 6 7 9")
        kotlin.test.assertEquals(2, result)
    }
    @Test
    fun samplePart2() {
        val result = Day2().part2("7 6 4 2 1\n" +
                "1 2 7 8 9\n" +
                "9 7 6 2 1\n" +
                "1 3 2 4 5\n" +
                "8 6 4 4 1\n" +
                "1 3 6 7 9")
        kotlin.test.assertEquals(4, result)
    }
}