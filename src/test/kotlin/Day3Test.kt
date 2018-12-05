import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day3Test {

    @Test
    fun puzzle1() {
        val input = listOf("#1 @ 1,3: 4x4", "#2 @ 3,1: 4x4", "#3 @ 5,5: 2x2")

        val result = Day3.puzzle1(input)

        assertEquals(4, result)
    }

    @Test
    fun puzzle2() {
        val input = listOf("#1 @ 1,3: 4x4", "#2 @ 3,1: 4x4", "#3 @ 5,5: 2x2")

        val result = Day3.puzzle2(input)

        assertEquals(3, result)
    }
}