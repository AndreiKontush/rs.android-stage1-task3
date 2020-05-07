package subtask1

import java.lang.StringBuilder
import kotlin.math.abs

class PolynomialConverter {

    fun convertToStringFrom(numbers: Array<Int>): String? {
        if (numbers.isEmpty()) return null

        val length = numbers.size
        val result = StringBuilder()
        var pre = ""
        var num = ""
        var x = ""

        for ((i, a) in numbers.withIndex()) {
            x = when {
                length - i == 2 -> "x"
                length - i == 1 -> ""
                else -> "x^${length - i - 1}"
            }

            pre = if (a == 0) continue
            else if ((i == 0) && (a > 0)) ""
            else if ((i == 0) && (a < 0)) "-"
            else if (a > 0) " + "
            else " - "

            num = if (abs(a) == 1) ""
            else abs(a).toString()

            result.append("$pre$num$x")
        }

        return result.toString()
    }
}
