/*
    Task 1 :
    Use the readline() to read inputs from the user. User should input their name, if
    user enters empty string, store a default value. Use an if expression to define greeting
    message based on whether the user entered a name
 */


package day1_basics
fun main() {
    print ("what's Your Name ?? ")
    val input = readlnOrNull()
    if (input != ""){
        println("Welcome $input :)")
    }
    else {
        println("Your Name is missing :( ")
    }
}


