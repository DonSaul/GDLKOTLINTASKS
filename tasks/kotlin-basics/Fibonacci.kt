fun fibonacciUsingIteration(num: Int): Int {
    var a = 0
    var b = 1
    var tmp: Int
    for (i in 2..num) {
        tmp = a + b
        a = b
        b = tmp
    }
    return b
}