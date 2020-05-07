package subtask4

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        if (number <= 0) return null

        val list = mutableListOf<Int>()
        var target = number * number
        var n = number - 1
        var sqrt = 0

        while (n > 0) {
            list.add(n)
            target -= n * n

            if (target == 0) return list.reversed().toTypedArray()

            if (n != 1) {
                sqrt = kotlin.math.sqrt(target.toFloat()).toInt()
                n = if (n <= sqrt) n - 1 else sqrt
            } else {
                if (list.size < 2) break
                target += list[list.size - 1] * list[list.size - 1]
                list.removeAt(list.size - 1)
                n = list[list.size - 1] - 1
                target += list[list.size - 1] * list[list.size - 1]
                list.removeAt(list.size - 1)
            }
        }

        return null
    }
}
