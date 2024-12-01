import kotlin.test.Test

class Day1Test {
    @Test
    fun samplePart1() {
        val result = Day1().part1("3   4\n" +
                "4   3\n" +
                "2   5\n" +
                "1   3\n" +
                "3   9\n" +
                "3   3")
        kotlin.test.assertEquals(11, result)
    }
    @Test
    fun samplePart2() {
        val result = Day1().part2("3   4\n" +
                "4   3\n" +
                "2   5\n" +
                "1   3\n" +
                "3   9\n" +
                "3   3")
        kotlin.test.assertEquals(31, result)
    }
}