public abstract class Person(open val name: String, open val age: Int){
    abstract fun introduce(): String
    fun info() {
        println("Ονομα $name, Ηλικια: $age")
    }
}
