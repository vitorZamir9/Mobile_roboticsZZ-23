fun main (){
    println("Digite o numero para Fibonacci: ")
    val n = readln().toInt()
    println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV")
    val Fib1 = fibonacci(n)
    val Fib2 = fibonacci2(n)
    val FibInterativo = fibonacciIterativo(n)
    println("Seu numero escolhido foi: $n.\nO calculo Fibonacci: $Fib1.\nA quantidade de chamadas e de: $Fib2." +
            "\nFibonacci Iterativo: $FibInterativo.")
}
fun fibonacci(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1
    return fibonacci(n - 1) + fibonacci(n - 2)
}
var chamadas = 0
fun fibonacci2(n: Int): Int {
    chamadas++
    if (n <= 1) return n
    return fibonacci(n - 1) + fibonacci(n - 2)
}
fun fibonacciIterativo(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1
    var a = 0
    var b = 1
    for (i in 2..n) {
        val temp = a + b
        a = b
        b = temp
    }
    return b
}
