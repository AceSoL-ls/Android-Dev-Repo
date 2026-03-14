fun main(){
    val scores = listOf<Int>(45, 60, 75, 80, 35, 45, 15, 90)
    val c = scores.count { it > 50 }
    val s = scores.sum()
    println(s)
}


