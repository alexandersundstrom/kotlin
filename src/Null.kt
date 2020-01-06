fun main() {
    val a = A(B(C("Hej")))
    val value = a?.value?.value?.value
    println(value)

    val string: String? = "My string"
    //safe call operator
    val length = string?.length
    println("The length of the string is $length")

    //If null will throw NPE
    val length2 = string!!.length

    val name: String? = null
    //Elvis operator
    val nameValue: String = name ?: "Default value"
    println(nameValue)

}


data class A(val value: B?)
data class B(val value: C?)
data class C(var value: String?)