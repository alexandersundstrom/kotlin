typealias DoubleToDouble = (Double, Double) -> Double


val intFunctions: (Double, List<DoubleToDouble>) -> Double = { double, list ->
    var sum = double
    list.forEachIndexed() { index, it ->
        sum = it.invoke(sum, index.toDouble() + 1)
    }
    sum
}

val multiply: (Double, Double) -> Double = { a, b ->
    println("$a * $b: ${a * b}")
    a * b
}

val divide: (Double, Double) -> Double = { a, b ->
    println("$a / $b: ${a / b}")
    a / b
}

val multipleCompose: (Int) -> (Int) -> (Int) -> Int = { a -> { b -> {c -> (a + b) / c } } }

fun main() {
    val list: List<DoubleToDouble> = listOf(
        multiply,
        divide,
        divide,
        multiply,
        multiply,
        multiply
    )
    println(multipleCompose(4)(6)(2))
    println("The result of functions is ${intFunctions(0.5, list)}")
}