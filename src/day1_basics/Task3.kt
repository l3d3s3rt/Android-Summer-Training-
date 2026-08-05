/*
Calculator: ADD, SUB, MUL, DIV
*/


package day1_basics
import java.text.BreakIterator
fun main(){
    println("=========== Here is My Simple Calculator ===========")
    print("put your first num: ")
    val num1 = readlnOrNull()?.toIntOrNull()

    print("Choose Your Arithmetic Operation ( + , - , * , / ) : ")
    var operation = readlnOrNull()

    print("put your second num: ")
    val num2 = readlnOrNull()?.toIntOrNull()

    if (num1 == null || num2 == null) {
        println("You must enter a valid numbers")

    }

    else {
        if (operation == "/" && num2==0){
            println("Invalid operation")
            return
        }
        when (operation) {
            "+" -> println("Your Result is: ${num1 + num2} ")
            "-" -> println("Your Result is: ${num1 - num2} ")
            "*" -> println("Your Result is: ${num1 * num2} ")
            "/" -> println("Your Result is: ${num1 / num2} ")
            else -> println("Invalid Operation")
        }

    }
}