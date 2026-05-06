fun main (){
    println("Digite o numero fatorial: ")
    val n = readln().toInt()
    println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV")
    println("O numero $n, seu fatrial recusirvo e: ${fatorial(n)}.\nFatorial interativo: ${fatorialIterativo(n)}." +
            "\nSoma: ${soma(n)}.\nContagem: ${contagem(n)}.\nFibonacci: ${fibonacci(n)}." +
            "\nSoma interativa: ${somaIterativa(n)}.")
}
fun fatorial(n: Int): Int {
    if (n == 1) {
        return 1
    }
    return n * fatorial(n - 1)
}
fun fatorialIterativo(n: Int): Int {
    var resultado = 1
    for (i in 1..n) {
        resultado *= i
    }
    return resultado
}
fun soma(n: Int): Int {
    if (n == 0) return 0
    return n + soma(n - 1)
}
fun contagem(n: Int): Int  {
    if (n == 0)
    println(n)
    return (n - 1)
}
fun fibonacci(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1
    return fibonacci(n - 1) + fibonacci(n - 2)
}
fun somaIterativa(n: Int): Int {
    var soma = 0
    for (i in 1..n) {
        soma += i
    }
    return soma
}
