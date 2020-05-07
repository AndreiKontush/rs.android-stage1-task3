package subtask2

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]

        for (i in 1..n) {
            if (combinationsNumber(n, i) == m) return i
        }

        return null
    }

    private fun combinationsNumber(n: Int, k: Int): Int {
        var numerator: Long = 1
        var denominator: Long = 1
        for (i in (k + 1)..n) numerator *= i
        for (i in 2..(n - k)) denominator *= i
        return (numerator / denominator).toInt()
    }
}
