package Tutorial.Variables_Control_Structures

// Hello Kotlin | Variables | Types | Nullability
// read only variable deceleration with specific type
val name: String = "Peter Griffin"
// mutable variable deceleration without explicit type
var greeting = "hello"

// fun in Kotlin can be a Toplevel deceleration
fun main(){
    // No specific type and local variable
    val greeting_Kotlin= "Hello Kotlin"
    println(greeting_Kotlin)

    println(greeting)
    println(name)

    // if | when | do
    // Normal if
    if(greeting != null){
        println(greeting)
    }else{
        println("moin")
    }

    // Assigning a val with an if (in this case its a null check)
    val greeting_to_print = if(greeting !=null) greeting else "good morning"
    println(greeting_to_print)

    // Kotlin elvis operator (a nother Null check) ? allows nullability
    val greeting_elvis:String?= greeting
    println(greeting_elvis)

    // when is the Kotlin expression for switch case in java
    when(greeting){
        null -> println("moin")
        else -> println(greeting)
    }

    // Assigning a val with when
    val greeting_to_print_when = when(greeting){
        null -> println("moin")
        else -> println(greeting)
    }
    println(greeting_to_print)
}


