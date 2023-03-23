fun main() {
    val (a, b, c, d) = readln().split(' ')
    println("Difference = ${a.toLong() * b.toLong() - c.toLong() * d.toLong()}")
}