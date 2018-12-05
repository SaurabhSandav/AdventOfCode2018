object Day2 {

    fun puzzle1(input: List<String>): Int {
        return input.map { str ->
            val groups = str.groupBy { it }

            val twos = groups.any { it.value.size == 2 }
            val threes = groups.any { it.value.size == 3 }

            Pair(twos, threes)
        }.unzip().run { first.count { it } * second.count { it } }
    }

    fun puzzle2(input: List<String>): String {

        input.forEach { first ->
            input.forEach { second ->

                val zipped = first.zip(second)
                val firstIndex = zipped.indexOfFirst { it.first != it.second }

                if (firstIndex != -1 && firstIndex == zipped.indexOfLast { it.first != it.second })
                    return first.removeRange(firstIndex..firstIndex)
            }
        }

        throw IllegalStateException()
    }
}

private fun main() {

    val input = Day2.javaClass.getResource("Day2Input.txt").readText().split("\n")

    // Puzzle 1
    val puzzle1Result = Day2.puzzle1(input)
    println("Puzzle 1: $puzzle1Result")

    // Puzzle 2
    val puzzle2Result = Day2.puzzle2(input)
    println("Puzzle 2: $puzzle2Result")
}