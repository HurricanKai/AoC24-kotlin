import kotlin.test.Test

class Day3Test {
    @Test
    fun samplePart1() {
        val result = Day3().part1("xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))")
        kotlin.test.assertEquals(161, result)
    }
    @Test
    fun samplePart2() {
        val result = Day3().part2("xmul(2,4)&mul[3,7]!^don't()_mul(5,5)+mul(32,64](mul(11,8)undo()?mul(8,5))")
        kotlin.test.assertEquals(48, result)
    }
}