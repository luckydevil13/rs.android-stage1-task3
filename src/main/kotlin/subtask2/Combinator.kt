package subtask2

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val a = array.first()
        val b = array.last()
        if (a == b) return 1
        var N:Long = 1
        var K:Long = 1
        var NK:Long = 1

        for (i in 1..b) N *= i
        for (i in 1..b / 2) K *= i
        for (i in 1..b - b / 2) NK *= i

        val x:Int = (N / (NK * K)).toInt()
        return if (x==a) b / 2
        else null
    }
}
