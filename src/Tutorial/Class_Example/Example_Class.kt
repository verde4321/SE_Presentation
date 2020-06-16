package Tutorial.Class_Example

// primary Constructor
class Example_Class(val value1 :String,val value2:String) {
    // secondary constructor vs default values
    constructor(): this("foo","faa"){
      println("$value1 $value2")}
}