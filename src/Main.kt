//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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


