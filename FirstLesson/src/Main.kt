//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var kalathi = mutableListOf<String>("Π1", "Π2", "Π3")
    kalathi.add("Π4")
    kalathi.add("Π5")
    kalathi.removeAt(0)
    for (kalathi in kalathi) {
        println(kalathi)
    }
    println(kalathi.size)
}