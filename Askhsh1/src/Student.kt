data class Student (val Sname: String, val Sage: Int, val grade: Double, val studentId: Int, val department: String) :
    Person(Sname, Sage) {
    override fun introduce(): String {
        return "Ειμαι ο/η $name, φοιτητης/φοιτητρια στο τμημα $department."
    }
}