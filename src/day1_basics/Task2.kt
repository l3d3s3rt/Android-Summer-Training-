/*
create an Array of integer. Use java.util.Random to fill the Array with 100 random
number between 1 and 100. Go through collection and print values less than or equal
to 10
*/


package day1_basics
import java.util.Random
fun main (){
    val random = Random()
    val numbers = IntArray(100) { random.nextInt(100) +1 }
    for (i in numbers) {
        if (i <=10 ){
            println(i)
        }
    }
}

