val anyValue: Any = "My string"

fun main() {
    //smart cast, as String in if statement
    if (anyValue is String) {
        println(anyValue.length)
    }

    when (anyValue) {
        is Int -> println("Its an Int")
        is String -> println("It's an string with length ${anyValue.length}")
        else -> println("Is something else")
    }

    //Will cast ClassCatchException if not of the right type
    val string = anyValue as String

    //Will be null if not the right type
    val int = anyValue as? Int
    println(int)
}