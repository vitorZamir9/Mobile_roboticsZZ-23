fun main(){
    println("digite oque vai entrar na lista: ")
    val lista = readln().split(" ").map{ it.toInt()}
    println("digite o alvo: ")
    val alvo = readln().toInt()
    ///////////////////////////////////
    val resultado = buscarLinear(lista, alvo)
    println("saida: ")
    println("alvo: $alvo")
    println("Esta na posicao: $resultado")
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
