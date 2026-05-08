import java.lang.Thread.sleep

fun main (){
    println("Ola, esse script ira te ajudar a catalogar e acessar seus livros! ")
    val catalogo = mutableMapOf<Int, Pair<String, String>>()
    var adciona = 0
    var livro = 0
    var id = 0
    var id2= 0
    var autor = 0
    var funcao = 0
    var contador= 0

    while (0 == 0) {
        if (funcao == 0){
            println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV")
            println("O que voce deseja?" +
                    "\n(1)-Sair" +
                    "\n(2)-Adicionar livro" +
                    "\n(3)-Buscar livro" +
                    "\n(4)-Exibir catalogo" +
                    "\n(5)-Excluir livro" +
                    "\n(6)-Limpar catalogo")
            println("Digite aqui: ")
            var funcao2 = readln().toInt()
            if (funcao2 == 1){//sair
                var funcao = 1
                println("Obrigado, volte logo!")
                break
            }
            if (funcao2 == 2){//Adicionar livro
                println("Digite o Nome do autor:")
                var autor = readln().toString()
                println("Digite o nome do livro: ")
                var livro = readln().toString()
                contador += 1
                var id = contador
                println("O livro adicionado sera: id:$id, livro:$livro, autor:$autor.")
                adicionarLivro(catalogo,id,livro,autor)
                println(exibirCatalogo(catalogo))
                sleep(5000)
            }
            if (funcao2 == 3){//Buscar livro
                println("Digite o id do livro:")
                var id2 = readln().toInt()
                println("Busca: ${buscarLivro(catalogo,id2)}")
                sleep(2000)
            }
            if (funcao2 == 4){//Exibir catalogo
                println("Aqui esta seu catalogo: ${exibirCatalogo(catalogo)}")
                sleep(2000)
            }
            if (funcao2 == 5){//Excluir livro
                println("Digite o id do livro que voce deseja excluir: ")
                val exlui = readln().toInt()
                println("livro que voce excluiu foi: ${buscarLivro(catalogo, exlui)}")
                excluirLivro(catalogo, exlui)
                println("Livro excluido")
            }
            if (funcao2 == 6){//Limpar catalogo
                println("Voce deseja excluir o catalogo?" +
                        "\nDigite (1) para sim." +
                        "\nDigite (0) para cancelar.")
                val apagaCatalogo = readln().toInt()
                if (apagaCatalogo == 1){
                    println("Catalogo limpo!")
                    limparCatalogo(catalogo)
                }else if(apagaCatalogo == 0){
                    //
                }else{
                    println("Acao nao concluida")
                }
            }
            if (funcao2 >= 7){
                println("Essa funcao nao existe!")
                sleep(2000)
            }
        }

    }

}
fun adicionarLivro(
    catalogo: MutableMap<Int, Pair<String, String>>,
    id: Int,
    nome: String,
    autor: String
) {
    if (catalogo.containsKey(id)) {
        println("ID ja existe")
        println("ERROR")
    } else {
        catalogo[id] = Pair(nome, autor)
    }
}
fun buscarLivro(
    catalogo: Map<Int, Pair<String, String>>,
    id: Int
): String {
    val livro = catalogo[id]
    return if (livro != null) {
        "${livro.first} - ${livro.second}"
    } else {
        "Livro não encontrado"
    }
}
fun exibirCatalogo(catalogo: Map<Int, Pair<String, String>>) {
    val ordenado = catalogo.toSortedMap()
    for ((id, dados) in ordenado) {
        println("$id ${dados.first} ${dados.second}")
    }
}
fun excluirLivro(catalogo: MutableMap<Int, Pair<String, String>>, id: Int) {
    catalogo.remove(id)
}

fun limparCatalogo(catalogo: MutableMap<Int, Pair<String, String>>) {
    catalogo.clear()
}
