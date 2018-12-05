import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day2Test {

    @Test
    fun puzzle1() {
        val input = listOf("abcdef", "bababc", "abbcde", "abcccd", "aabcdd", "abcdee", "ababab")

        val checksum = Day2.puzzle1(input)

        assertEquals(12, checksum)
    }

    @Test
    fun puzzle2() {
        val input = listOf("abcde", "fghij", "klmno", "pqrst", "fguij", "axcye", "wvxyz")

        val commonLetters = Day2.puzzle2(input)

        assertEquals("fgij", commonLetters)
    }
}