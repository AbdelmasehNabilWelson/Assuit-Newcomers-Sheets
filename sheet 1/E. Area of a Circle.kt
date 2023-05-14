fun main() {
    val r = readln().toDouble()
    if (r > 1 && r < 100) {
        println("%.9f".format(3.141592653 * r * r))
    }
}
