package subtask4

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        val square = number * number
        return decomppose(square, number - 1)
    }


    private fun decomppose(value: Int, start: Int): Array<Int>? {
        for( i in start downTo 1 ) {
            val square = i * i
            val reminder = value - square

            if(0 == reminder) {
                return arrayOf(i)
            }

            if(0 > reminder ) {
                return null
            }

            var sqrt = Math.floor( Math.sqrt(reminder.toDouble()) ).toInt()
            if(sqrt >= i) {
                sqrt = i - 1
            }

            val decomposed = decomppose(reminder, sqrt)
            if(decomposed !== null) {
                return decomposed + arrayOf(i)
            }
        }
        return null;
    }
}