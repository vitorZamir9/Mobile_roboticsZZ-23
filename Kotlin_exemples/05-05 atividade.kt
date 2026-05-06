fun main (){
    println("digite oque vai entrar na lista: ")
    val lista = readln().split(" ").map { it.toInt() }.sorted()
    println("digite o alvo: ")
    val alvo = readln().toInt()
    println("__________________________________________________")
    ///////////////////////////////////
    val resultado = buscaBinaria(lista, alvo)
    val buscando = busca(lista, alvo)
    val existe = existe(lista, alvo)
    val comparar = comparacoes(lista, alvo)
    println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV")
    println("O resultado de indices foi: $resultado.\nA busca binaria simples: $buscando." +
            "\nTotal de compracoes $comparar.\nVerificar existencia: $existe.\nO alvo era: $alvo.")
}
fun buscaBinaria(lista: List<Int>, alvo: Int): Int {
    var inicio = 0
    var fim = lista.size - 1
    while (inicio <= fim) {
        val meio = (inicio + fim) / 2
        println("Verificando indice $meio → valor ${lista[meio]}")
        if (lista[meio] == alvo) {
            return meio
        }
        if (lista[meio] < alvo) {
            inicio = meio + 1
        } else {
            fim = meio - 1
        }
    }
    return -1
}
fun busca(lista: List<Int>, alvo: Int): Int {
    var inicio = 0
    var fim = lista.size - 1
    while (inicio <= fim) {
        val meio = (inicio + fim) / 2
        if (lista[meio] == alvo) return meio
        if (lista[meio] < alvo) inicio = meio + 1
        else fim = meio - 1
    }
    return -1
}
fun existe(lista: List<Int>, alvo: Int): Boolean {
    return buscaBinaria(lista, alvo) != -1
}
fun comparacoes(lista: List<Int>, alvo: Int): Int {
    var inicio = 0
    var fim = lista.size - 1
    var comparacoes = 0
    while (inicio <= fim) {
        val meio = (inicio + fim) / 2
        comparacoes++
        if (lista[meio] == alvo) {
            println("Comparacoes: $comparacoes")
            return meio
        }
        if (lista[meio] < alvo) inicio = meio + 1
        else fim = meio - 1
    }
    println("Comparacoes: $comparacoes")
    return -1
}
