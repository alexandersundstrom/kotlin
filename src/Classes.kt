import kotlin.random.Random

class Money constructor(amount: Double) {
    val amount: Double

    init {
        this.amount = amount
    }
}

//extension functions extending other classes with new functions
fun Money.transfer(): String = "Transfering ${this.amount}"

fun Double.random(max: Double): Double = Random.nextDouble(this, max)


fun main() {
    println(Money(45.34).transfer())
    print(5.45.random(100.0))
}

//can be condensed, and data adds hashCode and equals, and toString, and copy
data class Test(val test: String, val name: String)

//Companion object
class Class(name: String) {
    companion object {
        const val amount: Int = 45
    }
}

//Interface
interface Interaction {
    fun sound()
    fun step()
    fun move()
}

open abstract class Animal(val name: String) : Interaction

class Parakeet(name: String) : Animal(name) {
    override fun sound() {
        println("$name said chirp!")
    }

    override fun step() {
        println("$name took a small step")
    }

    override fun move() {
        println("$name flew to another place")
    }
}

class Cat(name: String) : Animal(name) {
    override fun sound() {
        println("Prrrrrrr")
    }

    override fun step() {
        println("Look at my paws going!")
    }

    override fun move() {
        println("You want me to move, na a")
    }
}
