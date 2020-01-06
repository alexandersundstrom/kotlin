fun main() {
    println(sum)
    println(sum)

    val parakeet = Parakeet("Birdie")
    val cat = Cat("Molly")

    val animals: List<Animal> = listOf(parakeet, cat)

    //Class is not a data class, can't be destructured
    for (animal in animals ) {
        animal.sound()
        animal.step()
        animal.move()
    }

    //destructured data objects
    val tests: List<Test> = listOf(Test("Test1", "Name 1"), Test("Test 2", "Name 2"))
    //order of variables, not by name
    for ((test, name) in tests) {
        println("Test is $test and name is $name")
    }

    println("Companion object (static), the value is ${Class.amount}")

}

//val is immutable
val value: Double = 34.5

//var is mutable
var mutable: String = """This is some text
    |it should represent 
    |the rows I give to it, that is amazing :)
""".trimMargin()

//String concatenation
val accessVariable = "The value is ${value}"

fun add(a: Int = 10, b: Int = 5): Int {
    println("I was called")
    return a + b
}

data class Person(var firstname: String, var lastname: String)

//Can be null
var maybeSet: String? = null

//by lazy, only called once when set
val sum: Int by lazy { add() }

