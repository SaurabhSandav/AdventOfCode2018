object Day3 {

    private const val PATTERN = """^#(\d+) @ (\d+),(\d+): (\d+)x(\d+)${'$'}"""

    private data class Claim(val id: Int, val cells: List<Cell>) {

        companion object {

            fun fromString(input: String): Claim? {

                val matchResult = Regex(PATTERN).matchEntire(input) ?: return null

                fun MatchResult.getInt(position: Int) = groups[position]!!.value.toInt()

                val id = matchResult.getInt(1)

                val leftStart = matchResult.getInt(2)
                val topStart = matchResult.getInt(3)
                val wide = matchResult.getInt(4) + leftStart
                val tall = matchResult.getInt(5) + topStart

                val cells = mutableListOf<Cell>()

                (leftStart until wide).forEach { h ->
                    (topStart until tall).mapTo(cells) { v -> Cell(h, v) }
                }

                return Claim(id, cells)
            }
        }
    }

    private data class Cell(val h: Int, val v: Int)

    fun puzzle1(input: List<String>): Int {
        val claims = input.mapNotNull(Claim.Companion::fromString)

        val flattenedClaims = claims.map { it.cells }.flatten()

        return flattenedClaims.groupingBy { Pair(it.h, it.v) }.eachCount().filter { it.value >= 2 }.count()
    }

    fun puzzle2(input: List<String>): Int {
        val claims = input.mapNotNull(Claim.Companion::fromString)

        val frequencyMap = claims.map { it.cells }.flatten().groupingBy { it }.eachCount()

        return claims.first { claim ->
            claim.cells.all { cell -> frequencyMap[cell] == 1 }
        }.id
    }
}

private fun main() {

    val input = Day3.javaClass.getResource("Day3Input.txt").readText().split("\n")

    // Puzzle 1
    val puzzle1Result = Day3.puzzle1(input)
    println("Puzzle 1: $puzzle1Result")

    // Puzzle 2
    val puzzle2Result = Day3.puzzle2(input)
    println("Puzzle 2: $puzzle2Result")
}