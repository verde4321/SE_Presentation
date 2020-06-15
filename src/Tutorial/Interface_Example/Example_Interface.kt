package Tutorial.Interface_Example

// interface
interface Example_Interface {
    // Defoult implementation of an interface method
    fun say_some_thing(value:Int){
    println("$value min to go")
}
}

// class implementation of multiple interfaces
class Examples: Example_Interface{
    
}

fun main(){
    val example = Examples()

    example.say_some_thing(10)

}