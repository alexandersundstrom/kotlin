fun <T, U, V> compose(f: (U) -> V, g: (T) -> U): (T) -> V = { f(g(it)) }

//Not polymorphic
fun compose2(f: (Int) -> Int, g: (Int) -> Int): (Int) -> Int = { f(g(it)) }

fun square(n: Int): Int {
    println("Square")
    return n * n
}

fun triple(n: Int): Int {
    println("Tripple")
    return n * 3
}

fun main() {
    val squareAndTripple = compose(::triple, ::square)
    println(squareAndTripple(5))
}

