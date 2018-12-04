import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day1Test {

    @Test
    fun puzzle1() {
        assertEquals(3, Day1.puzzle1("+1, +1, +1".split(", ")))
        assertEquals(0, Day1.puzzle1("+1, +1, -2".split(", ")))
        assertEquals(-6, Day1.puzzle1("-1, -2, -3".split(", ")))
    }

    @Test
    fun puzzle2() {
        assertEquals(0, Day1.puzzle2("+1, -1".split(", ")))
        assertEquals(10, Day1.puzzle2("+3, +3, +4, -2, -4".split(", ")))
        assertEquals(5, Day1.puzzle2("-6, +3, +8, +5, -6".split(", ")))
        assertEquals(14, Day1.puzzle2("+7, +7, -2, -7, -4".split(", ")))
    }
}