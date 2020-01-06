fun addera(a: Int, b: Int): Int = a + b

fun main() {
    println("Result returned was ${outerFunction(3.5)}")
}
//Closure, function in function
fun outerFunction(point: Double): Double {
    fun divide(value: Double): Double {
        println("Dividing $value by 2")
        return value / 2
    }

    println("Function called with $point as value")

    val result = divide(point) * 4.5
    println("Returning the result $result")
    return result
}