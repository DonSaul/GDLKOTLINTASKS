fun printType(value: Any?) {
    when (value) {
        is String -> println("String: $value")
        is Int -> println("Integer: $value")
        null -> println("Value is null.")
    }
}
