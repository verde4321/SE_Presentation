package Tutorial.Variables_Control_Structures

// Hello Kotlin | Variables | Types | Nullability
// speciffic type


val name: String = "Peter Griffin"
var greeting = "hello"


fun main(){
    // No specific type
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

    // Assigning a val with an if
    val greeting_to_print = if(greeting !=null) greeting else "good morning"
    println(greeting_to_print)

    // Kotlin elvis operator
    val greeting_elvis:String?= greeting
    println(greeting_elvis)

    // when
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


