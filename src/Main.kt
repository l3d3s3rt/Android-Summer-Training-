fun main() {
    print ("what's Your Name ?? ")
    val input = readLine() ?: ""
    if (input != ""){
        println("Welcome $input :)")
    }
    else {
        println("Your Name is missing :( ")
    }
}


