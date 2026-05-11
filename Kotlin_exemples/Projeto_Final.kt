import java.lang.Thread.sleep

fun main (){
    println("Ola, esse script ira te ajudar a gerenciar seus contatos! ")
    var comecar = 0
    while(comecar != 1){
        println("\nDigite 1 para comecar:")
        var n1 = readLine()!!.toInt()
        if (n1 == 1){
            break
        }
    }
    val contatos = mutableMapOf<Int, Pair<String, String>>()
    var id = 0
    var id2 =0
    var nome = 0
    var numero = 0
    var funcao = 0
    var contador= 0

    while (funcao == 0) {
        if (funcao == 0){
            println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV")
            println("O que voce deseja?" +
                    "\n(1)-Sair" +
                    "\n(2)-Adicionar contato" +
                    "\n(3)-Buscar contato" +
                    "\n(4)-Exibir contatos" +
                    "\n(5)-Excluir contato" +
                    "\n(6)-Limpar lista de contatos" +
                    "\n(7)-Ligar pro contato" +
                    "\n(8)-Atualizar contato")
            println("Digite aqui: ")
            var funcao2 = readln().toInt()
            if (funcao2 == 1){//sair
                var funcao = 1
                println("Obrigado, volte logo!")
                break
            }
            if (funcao2 == 2) {
                println("Digite o Nome do do contato:")
                val nome = readln().toString()
                println("Digite o numero do contato:" +
                        "\nex: 819123456 ")
                val numero = readln().toString()
                if (numero.length == 11) {
                    if (contatoJaExiste(contatos, nome, numero)) {
                        println("Erro: Nome ou Numero ja cadastrado!")
                    } else {
                        contador += 1
                        val id = contador
                        adicionarNumero(contatos, id, nome, numero)
                        println("O contato adicionado sera: id:$id, numero:$numero, nome:$nome.")
                        listarContatos(contatos)
                    }
                } else {
                    println("Digite um numero valido!")
                }
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
                println("Digite o numero do contato: " +
                        "\nex: 819123456")
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
            if (funcao2 == 8){//Atualiza o contato
                println("Digite o numero do contato que voce deseja atualizar: " +
                        "\nex: 819123456")
                var numero = readln().toString()
                if (buscarContatoNumero(contatos,numero) == "nao encontrado"){
                    println("Digite um numero valido!" )
                    sleep(2000)
                }else if(buscarContatoNumero(contatos,numero) != "nao encontrado"){
                    var idNativo = pegarIdPeloNumero(contatos,numero)
                    var nomeNativo = contatos[idNativo]?.first?:"nao encontrado"
                    println("O que voce quer atualizar do contato? " +
                            "\n(3)-Nome" +
                            "\n(2)-Numero" +
                            "\n(1)Nome e numero" +
                            "\n(0)Cancelar operacao")
                    println("Digite aqui: ")
                    var funcao = readln().toInt()
                    while (funcao != 0){
                        if (funcao == 3){
                            println("Alterar so nome do contato para qual: ")
                            var novoNome = readln().toString()
                            atualizarContato(contatos,numero,novoNome,numero)
                            break
                        }
                        if (funcao == 2){
                            //tem que pegar o que ja estava
                            println("Alterar so numero do contato para qual: ")
                            var novoNumero = readln().toString()
                            atualizarContato(contatos,numero,nomeNativo, novoNumero)
                            break
                        }
                        if (funcao == 1){
                            println("Alterar o nome do contato para qual: ")
                            var novoNome = readln().toString()
                            println("Alterar o numero do contato para qual:")
                            var novoNumero = readln().toString()
                            atualizarContato(contatos,numero,novoNome,novoNumero)
                            break
                        }
                    }
                }

            }
            if (funcao2 >= 9){
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
fun atualizarContato(
    contatos: MutableMap<Int, Pair<String, String>>,
    numeroDeBusca: String,
    novoNome: String,
    novoNumero: String
) {
    var idEncontrado: Int? = null
    for ((id, dados) in contatos) {
        if (dados.second == numeroDeBusca) {
            idEncontrado = id
            break
        }
    }
    if (idEncontrado != null) {
        contatos[idEncontrado] = Pair(novoNome, novoNumero)
        println("Contato atualizado com sucesso!")
    } else {
        println("Erro: Numero nao encontrado no sistema.")
    }
}
fun pegarIdPeloNumero(contatos: Map<Int, Pair<String, String>>, numeroBusca: String): Int {
    for ((id, dados) in contatos) {
        if (dados.second == numeroBusca) {
            return id
        }
    }
    return 0 // Retorna 0 se não achar nada
}
fun contatoJaExiste(contatos: Map<Int, Pair<String, String>>, nome: String, numero: String): Boolean {
    for (contato in contatos.values) {
        if (contato.first.equals(nome, ignoreCase = true) || contato.second == numero) {
            return true
        }
    }
    return false
}
