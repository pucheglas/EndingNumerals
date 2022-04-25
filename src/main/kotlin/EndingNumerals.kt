fun main() {
    val likes = 101
    val numerals = if (likes % 10 == 1) "человеку" else "людям"
    println("Понравилось $likes  $numerals")
}