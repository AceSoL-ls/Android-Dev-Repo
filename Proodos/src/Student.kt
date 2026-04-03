data class Student(
    val id: Int,
    val name: String,
    var grade: Double
) {
    init {
        require(grade in 0.0..10.0) { "Ο βαθμός πρέπει να είναι μεταξύ 0.0 και 10.0" }
    }
}