fun isPalindrome(str: String): Boolean {
    val cleanedStr = str.replace("\\s".toRegex(), "").toLowerCase()
    return cleanedStr == cleanedStr.reversed()
}

// Uso de la función
fun main() {
    val result = isPalindrome("radar")
    println(result)  // Debería imprimir true
}
