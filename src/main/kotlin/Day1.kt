object Day1 {

    fun puzzle1(input: List<String>) = input.map(String::toInt).sum()

    fun puzzle2(input: List<String>): Int {
        val frequencies = mutableSetOf<Int>()
        val newInput = input.map(String::toInt)

        var sum = 0

        while (true) {
            newInput.forEach {
                if (!frequencies.add(sum)) return sum
                sum += it
            }
        }
    }
}

private fun main() {

    val input = Day1.javaClass.getResource("Day1Input.txt").readText().split("\n")

    // Puzzle 1
    val puzzle1Result = Day1.puzzle1(input)
    println("Puzzle 1: $puzzle1Result")

    // Puzzle 2
    val puzzle2Result = Day1.puzzle2(input)
    println("Puzzle 2: $puzzle2Result")
}