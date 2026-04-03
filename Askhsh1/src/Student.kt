data class Student (override val name: String,
                    override val age: Int,
                    var grade: Double,
                    val studentId: Int,
                    val department: String) :

    Person(name, age), Gradable {

    override fun setGrades(grade: Double) {
        if (grade in 0.0..10.0){
        this.grade = grade
    } else {
        println("Out of range")
        }
    }

    override fun getLetterGrade(): String {
        return when (this.grade){
            in 9.0..10.0 -> "A"
            in 7.0..8.5 -> "B"
            in 5.0..6.5 -> "C"
            in 3.5..5.0 -> "D"
            else -> return "F"
        }


    }

    override fun introduce(): String {
        return "Ειμαι ο/η $name, φοιτητης/φοιτητρια στο τμημα $department."
    }
}