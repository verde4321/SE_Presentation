package Demo.Variables_Control_Structures
// i did most of the demo in this class and deleted every thing i didnt needed i changed the demo a bit acording to the questions so it was a bit smaller than palned i hope thats still fine

 class Jedi(name:String,  override val speciesname: String, rank: String = "Padavan"):Species{
     val name = name
     var rank = rank

}

fun main(){
var anikin = Jedi("Anikin","Humen")
    println(anikin.speciesname)
    println(anikin.eats("Apels"))
    println(anikin.name)
     anikin.rank= "Master"
    println(anikin.rank)
}

interface Species{
    val speciesname:String
    fun eats(food:String):String = "A $speciesname eats $food"

}

