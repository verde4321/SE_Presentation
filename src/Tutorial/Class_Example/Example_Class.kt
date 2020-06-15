package Tutorial.Class_Example

// Constructor
class Example_Class(val value1 :String,val value2:String) {
    // secondary constructor vs default values
    constructor(): this("foo","faa"){
      println("$value1 $value2")}

    var somthing:String? = null

    set(v) {
        field= v
        println("Override default setter")
    }

}