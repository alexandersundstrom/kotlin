import java.io.File

fun main() {
    File("/Users/alexander/dev/Kotlin Test/src/myFile.txt").inputStream()
            //use uses automatic resource closure
        .use {
            it.bufferedReader()
                .lineSequence()
                .forEach ( ::println )
        }

    //Just a smart way to work with a file
    File("/Users/alexander/dev/Kotlin Test/src/myFile.txt").forEachLine { println(it) }
}