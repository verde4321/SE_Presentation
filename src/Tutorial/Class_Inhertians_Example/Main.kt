package Tutorial.Class_Inhertians_Example
//child class with custom get method
// set and get methods are standard in kotlin there is not need to create them by hand except for customisation
class penguin: Bird(){
  override val can_fly :String
      get()= "sadly i cant fly"
}

fun main(){
    val pingu = penguin()
    pingu.fly()
}