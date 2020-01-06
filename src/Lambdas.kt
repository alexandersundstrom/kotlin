fun double(list: List<Double>): List<Double> = list.map {
    println("Tripling $it")
    it * 3 //the value returned is the expression of the last line, return is optional
}

fun main() {
    println(double(listOf(4.5, 5.6)))
}