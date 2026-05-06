fun main (){
    println("digite oque vai entrar na lista: ")
    val lista = readln().split(" ").map{ it.toInt()}
    println("digite o alvo: ")
    val alvo = readln().toInt()
    println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV")
    ///////////////////////////////////
    val mapa = mutableMapOf<Int, Int>()
    val buscando = buscar(lista, alvo)
    val binaria = buscaBinaria(lista, alvo)
    val existee = existe(lista, alvo)
    val reptido= buscarPrimeiro(lista, alvo)
    val completa = buscaCompleta(lista, alvo)
    for (i in lista.indices) {
        mapa[lista[i]] = i
    }
    println("O alvo foi: $alvo.\nPosicao que esta o alvo: ${mapa[alvo] ?: -1}.\nBusca binaria: $binaria." +
            "\nO alvo: $alvo, existe: $existee.\nBuscando o primeiro elemento reptido: $reptido." +
            "\nBusca completa: $completa.")
}
fun buscar(lista: List<Int>, alvo: Int): Int {
    if (lista.isEmpty()) return -1
    for (i in lista.indices) {
        if (lista[i] == alvo) return i
    }
    return -1
}

fun buscaBinaria(lista: List<Int>, alvo: Int): Int {
    if (lista.isEmpty()) return -1
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
    return lista.contains(alvo)
}
fun buscarPrimeiro(lista: List<Int>, alvo: Int): Int {
    for (i in lista.indices) {
        if (lista[i] == alvo) return i
    }
    return -1
}
fun construirMapa(lista: List<Int>): Map<Int, Int> {
    val mapa = mutableMapOf<Int, Int>()
    for (i in lista.indices) {
        mapa[lista[i]] = i
    }
    return mapa
}
fun buscaCompleta(lista: List<Int>, alvo: Int): String {
    if (lista.isEmpty()) return "Lista vazia"
    val resultado = lista.indexOf(alvo)
    return if (resultado == -1) "Nao encontrado"
    else "Encontrado na posicao $resultado"
}
