fun main(){
    println("digite oque vai entrar na lista: ")
    val lista = readln().split(" ").map{ it.toInt()}
    println("digite o alvo: ")
    val alvo = readln().toInt()
    ///////////////////////////////////
    val resultado = buscarLinear(lista, alvo)
    val contagem= contarQuantasVezes(lista,alvo)
    val tamanho = tamanhoDaLista(lista)
    val maior= maiorValor(lista)
    println("saida: ")
    println("alvo: $alvo")
    println("tamanho: $tamanho")
    println("O alvo $alvo Esta na posicao: $resultado.\nO alvo $alvo apareceu $contagem vezes \nNa lista o maior valor" +
            " e: $maior ")
}
fun buscarLinear(lista: List<Int>, alvo: Int): Int{
    //fala em qual posição está
    for (i in lista.indices){
        if (lista[i] == alvo){
            return i
        }
    }
    return -1
}
fun contarQuantasVezes( lista: List<Int>, alvo: Int): Int{
    var contador = 0
    for (item in lista){
        if (item == alvo)++contador
    }
    return contador
}
fun tamanhoDaLista(lista: List<Int>): Int{
    var tamanho = 0
    for (item in lista){
        tamanho++
    }
    return tamanho
}
fun maiorValor(lista: List<Int>): Int{
    var maior = lista[0]
    for (item in lista){
        if (item > maior) maior = item
    }
    return maior
}
