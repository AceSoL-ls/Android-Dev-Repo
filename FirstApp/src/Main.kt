// ΛΑΛΙΩΤΗΣ ΕΥΡΙΠΙΔΗΣ ΤΕΠ Δ2 ΠΡΩΟΔΟΣ

data class Student(
    val id: Int,
    val name: String,
    var grade: Double
) {
    init {
        require(grade in 0.0..10.0) { "Invalid grade" }
    }
}

class GradeTracker {
    private val students = mutableListOf<Student>()

    fun addStudent(student: Student) {
        students.add(student)
    }

    fun removeStudent(id: Int): Boolean {
        val removed = students.removeIf { it.id == id }
        if (!removed) {
            println("Σφάλμα: Ο φοιτητής με ID $id δεν βρέθηκε.")
        }
        return removed
    }

    fun getAllStudents(): List<Student> = students.toList()

    fun calculateAverage(): Double {
        if (students.isEmpty()) {
            println("Σφάλμα: Η λίστα είναι κενή.")
            return 0.0
        }
        return students.map { it.grade }.average()
    }

    fun getHighestGrade(): Student? = students.maxByOrNull { it.grade }

    fun getFailingStudents(): List<Student> = students.filter { it.grade < 5.0 }

    fun getExcellentStudents(): List<Student> = students.filter { it.grade >= 8.5 }
}

fun main() {
    val tracker = GradeTracker()

    tracker.addStudent(Student(1, "Γιάννης Παππάς", 4.2))
    tracker.addStudent(Student(2, "Ελένη Φωτίου", 9.5))
    tracker.addStudent(Student(3, "Κώστας Μελάς", 3.8))
    tracker.addStudent(Student(4, "Μαρία Ζήση", 8.7))
    tracker.addStudent(Student(5, "Νίκος Ράπτης", 6.0))
    tracker.addStudent(Student(6, "Άννα Δήμου", 7.4))

    println("Όλοι οι φοιτητές:")
    tracker.getAllStudents().forEach { println(it) }

    println("\nΜέσος Όρος: ${tracker.calculateAverage()}")

    println("\nΑποτυχόντες:")
    tracker.getFailingStudents().forEach { println(it) }

    println("\nΆριστοι:")
    tracker.getExcellentStudents().forEach { println(it) }

    println("\nΑφαίρεση ID 3: ${tracker.removeStudent(3)}")

    println("\nΕνημερωμένη λίστα:")
    tracker.getAllStudents().forEach { println(it) }

    println("\nΥψηλότερος βαθμός:")
    println(tracker.getHighestGrade())
}