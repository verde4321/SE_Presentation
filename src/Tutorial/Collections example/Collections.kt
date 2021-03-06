package Tutorial.Collections

fun main() {
    // array
    val arr= arrayOf(1,2,3,4,5)
    println(arr.size)
    println(arr.get(0))
    println(arr[0])

    // for each loop
    for (arr in arr){
        println(arr)
    }

    // for each loop Kotlin way
    arr.forEach {arr-> println(arr) } // it is the defoult Demo.Variables_Control_Structures.getName for every item

    // array with index
    arr.forEachIndexed{index,arr-> println("$arr. the index is $index")}

    // List and Mutable List excusable with same methods like in java
    val names = listOf("Peter Griffin", "Meg Griffin", "Brian Griffin")
    val names2 = mutableListOf("Peter Griffin", "Meg Griffin", "Brian Griffin")
    names2.add("Meg")

    // map excusable with same methods like in java
    val map= mapOf("key1" to "value1","key2" to "value2")
    map.forEach { key, value ->  println("$key opens $value")}

    show_vararg("soup", "chicken", "karrots")
}
// vararg param allows treating a variable like multiple variables of the same type
fun show_vararg (vararg items:String){
    items.forEach { items-> println("this are the item: $items") }
}