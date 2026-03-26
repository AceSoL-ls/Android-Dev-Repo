public abstract class Person(val name: String, var age: Int){
    abstract fun introduce(): String
    fun info() {
        println("Ονομα $name, Ηλικια: $age")
    }
}
