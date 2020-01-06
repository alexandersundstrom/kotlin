fun main() {
    //Immutable list
    val intList = listOf(1, 2, 3, 4, 5)
    val secondList = intList;
    println(intList + secondList + 7 + 8)

    //Mutable list  adding List<Int> removes add(), why? Perhaps not a problem as we should use immutable as much as possible
    val mutableIntList = mutableListOf(1,2,3,4,5)
    mutableIntList.add(7)
    println(mutableIntList)

}