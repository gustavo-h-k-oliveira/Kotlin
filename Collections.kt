fun main() {
    val greenNumber = listOf(1, 4, 23)
    val redNumber = listOf(17, 2)
    println("There are ${greenNumber.count() + redNumber.count()} numbers.")

    val supported = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = supported.contains(requested.uppercase())
    println("Support for $requested: $isSupported")

    val number2word = mapOf(1 to "O-N-E", 2 to "T-W-O", 3 to "T-H-R-E-E")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}