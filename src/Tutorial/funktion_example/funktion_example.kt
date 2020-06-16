package Tutorial.funktion_example

fun main() {
println(single_expretion_fun())
printout_greet_the_world()
say_good_morning("Brian")
}

// function with return value
fun greet_the_world():String{
    return "Hello World"
}
// Single expression function
fun single_expretion_fun() = "Hi i am Kotlin"

// functions
fun printout_greet_the_world():Unit{
    println("hello There")
}

// function with String concatenation and concatenation with string Templates
fun say_good_morning(person:String){
    var msg = "Good Morning" + person
    var msg2="moin $person"
    println(msg)
    println(msg2)
}