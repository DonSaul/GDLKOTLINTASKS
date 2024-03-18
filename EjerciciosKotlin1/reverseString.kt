fun reverseString(string:String): String{
    var string2 = ""
    for(i in string.length - 1 downTo 0){
        string2 += string[i]
    }

    return string2;
}

fun main() {
    println(reverseString("hola"))
}