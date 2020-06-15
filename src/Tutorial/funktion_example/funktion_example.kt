package Tutorial.funktion_example

fun main() {

}
// functions
// function with return value
fun greet_the_world():String{
    return "Hello World"
}
// Single expression function
fun single_expretion_fun() = "Hi i am Kotlin"

// functions
fun printout_greet_the_world():Unit{
    println(greet_the_world())
}

// function with String concardination with string Templates
fun say_good_morning(person:String){
    var msg = "Good Morning" + person
    msg="moin $person"
    println(msg)
}