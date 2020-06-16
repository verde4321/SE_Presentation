package Tutorial.Interface_Example

// interface
interface Example_Interface {
    // Default implementation of an interface method similar to the concept of abstract classes in java but not the same
    fun say_some_thing(value:Int){
    println("$value min to go")
}
}

// class implementation  multiple interfaces are possible
class Examples: Example_Interface


fun main(){
    val example = Examples()
    example.say_some_thing(10)
}