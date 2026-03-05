fun main(){
    val cart = mutableListOf<String>("Egg", "Mik", "Spaghetti")

    do {
        println("--------------")
        println("Enter your choice: ")
        println("1. ADD")
        println("2. REMOVE")
        println("3. PRINT")
        println("4. EXIT")
        val choice = readln().toInt()

        when (choice) {
            0 -> continue
            1 -> {
                print("Enter Name: ")
                val name = readln()
                cart.add(name)
            }
            2 ->{
                println("Enter Name: ")
                val name = readln()
                cart.remove(name)
            }
            3 ->{
                for (i in 0 until cart.size){
                    println("${i+1} : ${cart[1]}")
                }
            }

            else -> println("Chose a valid option! ")
        }
    }while (choice != 0)
    println("Program Ended! ")
}