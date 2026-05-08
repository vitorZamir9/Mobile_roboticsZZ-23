import java.lang.Thread.sleep

fun main (){
    println("Ola, esse script ira te ajudar a gerenciar seus contatos! ")
    val contatos = mutableMapOf<Int, Pair<String, String>>()
    var id = 0
    var id2 =0
    var nome = 0
    var numero = 0
    var funcao = 0
    var contador= 0

    while (0 == 0) {
        if (funcao == 0){
            println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV")
            println("O que voce deseja?" +
                    "\n(1)-Sair" +
                    "\n(2)-Adicionar contato" +
                    "\n(3)-Buscar contato" +
                    "\n(4)-Exibir contatos" +
                    "\n(5)-Excluir contato" +
                    "\n(6)-Limpar lista de contatos" +
                    "\n(7)-Ligar pro contato")
            println("Digite aqui: ")
            var funcao2 = readln().toInt()
            if (funcao2 == 1){//sair
                var funcao = 1
                println("Obrigado, volte logo!")
                break
            }
            if (funcao2 == 2){//Adicionar contato
                println("Digite o Nome do do contato:")
                var nome = readln().toString()
                println("Digite o numero do contato:" +
                        "\nex: 819123456 ")
                var numero = readln().toString()
                contador += 1
                var id = contador
                println("O contato adicionado sera: id:$id, numero:$numero, nome:$nome.")
                adicionarNumero(contatos, id, nome ,numero)
                println(listarContatos(contatos))
                sleep(5000)
            }
            if (funcao2 == 3){//Buscar contato
                println("Digite o id do contato:")
                var id2 = readln().toInt()
                println("Busca: ${buscarContato(contatos,id2)}")
                sleep(2000)
            }
            if (funcao2 == 4){//Exibir contatos
                println("Aqui esta sua lista de contatos: ${listarContatos(contatos)}")
                sleep(2000)
            }
            if (funcao2 == 5){//Excluir contato
                println("Digite o id do contato que voce deseja excluir: ")
                val exlui = readln().toInt()
                println("Contato que voce excluiu foi: ${buscarContato(contatos, exlui)}")
                excluirLivro(contatos, exlui)
                println("Contato excluido")
            }
            if (funcao2 == 6){//Limpar lista de contatos
                println("Voce deseja excluir a lista de contatos?" +
                        "\nDigite (1) para sim." +
                        "\nDigite (0) para cancelar.")
                val apagaCatalogo = readln().toInt()
                if (apagaCatalogo == 1){
                    println("Lista de contatos limpa!")
                    limparCatalogo(contatos)
                }else if(apagaCatalogo == 0){
                    //
                }else{
                    println("Acao nao concluida")
                }
            }
            if (funcao2 == 7){//Ligar pro contato
                println("Digite o numero do contato: ")
                var numero = readln().toString()
                println("Buscando o numero $numero: ${buscarContatoNumero(contatos,numero)}")
                if (buscarContatoNumero(contatos,numero) == "nao encontrado"){
                    println("Digite um numero valido!" )
                    sleep(2000)
                }else if(buscarContatoNumero(contatos,numero) != "nao encontrado"){
                    println("Ligando para o numero: $numero...")
                    sleep(2000)
                    println("Ligação falhou..")
                    sleep(2000)
                }

            }
            if (funcao2 >= 8){
                println("Essa funcao nao existe!")
                sleep(2000)
            }
        }

    }

}
fun adicionarNumero(
    contatos: MutableMap<Int, Pair<String, String>>,
    id: Int,
    nome: String,
    numero: String
) {
    if (contatos.containsKey(id)) {
        println("ID ja existe")
        println("ERROR")
    } else {
        contatos[id] = Pair(nome, numero)
    }
}
fun buscarContato(
    contatos: Map<Int, Pair<String, String>>,
    id: Int
): String {
    val contato = contatos[id]
    var existe = 0
    return if (contato != null) {
        "${contato.first} - ${contato.second}"
    } else {
        "Contato não encontrado"
    }
}
fun buscarContatoNumero(
    contatos: Map<Int, Pair<String, String>>,
    numero: String

): String {
    for (contato in contatos.values) {
        if (contato.second == numero) {
            return "Encontrado: ${contato.first} - ${contato.second}"
        }

    }
    return "nao encontrado"
}
fun listarContatos(contatos: Map<Int, Pair<String, String>>) {
    val ordenado = contatos.toSortedMap()
    for ((id, dados) in ordenado) {
        println("$id ${dados.first} ${dados.second}")
    }
}

fun excluirLivro(contatos: MutableMap<Int, Pair<String, String>>, id: Int) {
    contatos.remove(id)
}
fun limparCatalogo(contatos: MutableMap<Int, Pair<String, String>>) {
    contatos.clear()
}
