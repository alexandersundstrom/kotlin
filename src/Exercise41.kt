//As loop
//fun add(a: Int, b: Int): Int {
//
//    var x = a
//    var y = b
//
//    while (y != 0) {
//        x = inc(x)
//        y = dec(y)
//    }
//    return x
//}


//Tailrec will return as loop by itself
tailrec fun addT(a: Int, b: Int): Int {
    fun inc(n: Int) = n + 1
    fun dec(n: Int) = n - 1

    return if (b == 0) a else addT(inc(a), dec(b))
}

fun main() {
    val sumT = addT(5, 2)
    println(sumT)
}