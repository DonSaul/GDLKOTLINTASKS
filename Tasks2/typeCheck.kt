fun typeCheck(n:Any?){
    if(n is String){
        println("Tipo string:  $n")
    }else if(n is Int){
        println("Tipo Int: $n")
    }else if(n == null){
        println("Es nulo")
    }else{
        print("Otro tipo no reconodido")
    }
}

fun main() {
    var n1:String? = "df"
    var n2:Int = 34

    typeCheck(n1)
    typeCheck(n2)
}