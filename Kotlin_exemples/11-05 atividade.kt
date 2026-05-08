import java.lang.Thread.sleep

fun main (){
    println("Ola, esse script ira te ajudar a gerenciar seus contatos! ")
    val contatos = mutableMapOf<Int, Pair<String, String>>()
    var id = 0
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

            }
            if (funcao2 == 2){//Adicionar contato

            }
            if (funcao2 == 3){//Buscar contato

            }
            if (funcao2 == 4){//Exibir contatos

            }
            if (funcao2 == 5){//Excluir contato

            }
            if (funcao2 == 6){//Limpar lista de contatos

            }
            if (funcao2 == 7){//Ligar pro contato

            }
            if (funcao2 >= 8){
                println("Essa funcao nao existe!")
                sleep(2000)
            }
        }

    }

}
