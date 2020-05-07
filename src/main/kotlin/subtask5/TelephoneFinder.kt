package subtask5

import kotlin.reflect.KClass

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if (number.startsWith('-')) return null

        val map = hashMapOf(
            '0' to "8", '1' to "24", '2' to "135", '3' to "26", '4' to "157",
            '5' to "2468", '6' to "359", '7' to "48", '8' to "5790", '9' to "68"
        )
        val result = mutableListOf<String>()
        var base: CharArray
        for ((index, c) in number.withIndex()) {
            base = number.toCharArray()
            for (d in map.getValue(c)) {
                base[index] = d
                result.add(base.joinToString(""))
            }
        }

        return result.toTypedArray()
    }
}
