fun main() {
    val (aa, bb) = readln().split(' ')
    val a = aa.toLong()
    val b = bb.toLong()
    println("""
        $a + $b = ${a + b}
        $a * $b = ${a * b}
        $a - $b = ${a - b}
    """.trimIndent())
}