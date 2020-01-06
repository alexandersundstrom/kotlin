val country = "Sweden"
val tired = false
fun main() {

    //Similar to java
    val first = when (country) {
        "Sweden" -> "Best"
        "Norway" -> "Second"
        else -> "Naa"
    }

    //A when can test multipöe things
    val capital = when {
        //Can use multi line, last row returned
        tired && country == "Sweden" -> "Get some sleep in Sweden"
        country == "Norway" -> {
            "A lovely neighbour"
        }
        country == "Sweden" -> "The crown of scandinavia"
        else -> "I Dont know what you're talking about"
    }

    println(capital)
}