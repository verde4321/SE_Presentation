package Tutorial.Class_Inhertians_Example

class penguin: Bird(){
  override val can_fly :String
      get()= "sadly i cant fly"
}


fun main(){
    val pingu = penguin()
    pingu.fly()
}