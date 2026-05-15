import java.lang.Thread.sleep
import java.io.PrintStream
import java.io.FileOutputStream
import java.io.FileDescriptor
fun main (){
    System.setOut(PrintStream(FileOutputStream(FileDescriptor.out), true, "UTF-8"))
    println("Olá, esse script vai apresentar a atividade: Revisão Completa — Algoritmos em Kotlin ")
    val contatos = mutableMapOf<Int, Pair<String, String>>()
    var funcao = 0
    var funcaoDif = 0
    var contador= 0
    var numero = 0
    var nome = ""
    while (funcao == 0) {
        println("(0)-funcao" +
                "\n(1)-Exercício 1 — Par ou ímpar" +
                "\n(2)-Exercício 2 — Classificação de nota" +
                "\n(3)-Exercício 3 — Validação de curso" +
                "\n(4)-Exercício 4 — Buscar curso por ID" +
                "\n(5)-Exercício 5 — Filtrar cursos ativos" +
                "\n(6)-Exercício 6 — Ranking por nota" +
                "\n(7)-Exercício 7 — Agrupar por categoria" +
                "\n(8)-Exercício 8 — Calcular carga horária total" +
                "\n(9)-Exercício 9 — Deduplicar categorias" +
                "\n(10)-Exercício 10 — Desafio integrador")
        println("Digite o número da função que você deseja: ")
        var funcao = readln().toInt()
        if (funcao == 0) {
            println("Programa sendo encerrad!")
            break
        }
        if (funcao == 1) {
            //entra no loop da atividade
            while (funcaoDif == 0) {
                //entra no loop da atividade
                println("(0)-Para sair da atividade" +
                        "\n(1)-Para ver a atividade")
                println("Digite aqui um número para continuar: ")
                var funcaoDif = readln().toInt()
                if (funcaoDif == 0) {//Sai da atividade
                    println("Você está saindo da atividade!")
                    sleep(2000)
                    break
                }
                if (funcaoDif == 1) {//Faz a atividade
                    println("Fazendo a atividade!")
                    //Atividade
                    println("Digite um número para ver se é par ou ímpar: ")
                    var numero = readln().toInt()
                    println("O número: $numero é ${parOuImpar(numero)}")
                    //
                    sleep(2000)
                }
            }
        }
        if (funcao == 2) {
            //entra no loop da atividade
            while (funcaoDif == 0) {
                //entra no loop da atividade
                println("(0)-Para sair da atividade" +
                        "\n(1)-Para ver a atividade")
                println("Digite aqui um número para continuar: ")
                var funcaoDif = readln().toInt()
                if (funcaoDif == 0) {//Sai da atividade
                    println("Você está saindo da atividade!")
                    sleep(2000)
                    break
                }
                if (funcaoDif == 1) {//Faz a atividade
                    println("Fazendo a atividade!")
                    //Atividade
                    println("Digite o nome do Aluno(a) de Kris: ")
                    var nome = readln().toString()
                    println("Digite a nota final do Aluno(a) $nome: ")
                    var numero = readln().toInt()
                    print("O Aluno de Kris foi: ${aprovacaoDkris(numero)}")
                    //
                    sleep(2000)
                }
            }
        }
        if (funcao == 3) {
            //entra no loop da atividade
            while (funcaoDif == 0) {
                //entra no loop da atividade
                println("(0)-Para sair da atividade" +
                        "\n(1)-Para ver a atividade")
                println("Digite aqui um número para continuar: ")
                var funcaoDif = readln().toInt()
                if (funcaoDif == 0) {//Sai da atividade
                    println("Você está saindo da atividade!")
                    sleep(2000)
                    break
                }
                if (funcaoDif == 1) {//Faz a atividade
                    println("Fazendo a atividade!")
                    //Atividade
                    println("Digite o nome do Aluno(a) de Kris: ")
                    var nome = readln().toString()
                    println("Digite a carga horária do Aluno(a) $nome: ")
                    var numero = readln().toString()
                    println("A carga horaria do Aluno(a) $nome: ${medicaoCargaHoraria(nome,numero)}")
                    //
                    sleep(2000)
                }
            }
        }
        if (funcao == 4) {
            //parei aqui falta terminar
            //entra no loop da atividade
            while (funcaoDif == 0) {
                //entra no loop da atividade
                println("(0)-Para sair da atividade" +
                        "\n(1)-Para ver a atividade")
                println("Digite aqui um número para continuar: ")
                var funcaoDif = readln().toInt()
                if (funcaoDif == 0) {//Sai da atividade
                    println("Você está saindo da atividade!")
                    sleep(2000)
                    break
                }
                if (funcaoDif == 1) {//Faz a atividade
                    println("Fazendo a atividade!")
                    //Atividade
                    println("Digite um número de 1-10 para saber sobre um curso: ")
                    var numero = readln().toInt()

                    //
                    sleep(2000)
                }
            }
        }
        if (funcao == 5) {
            //entra no loop da atividade
            while (funcaoDif == 0) {
                //entra no loop da atividade
                println("(0)-Para sair da atividade" +
                        "\n(1)-Para ver a atividade")
                println("Digite aqui um número para continuar: ")
                var funcaoDif = readln().toInt()
                if (funcaoDif == 0) {//Sai da atividade
                    println("Você está saindo da atividade!")
                    sleep(2000)
                    break
                }
                if (funcaoDif == 1) {//Faz a atividade
                    println("Fazendo a atividade!")
                    //Atividade

                    //
                    sleep(2000)
                }
            }
        }
        if (funcao == 6) {
            //entra no loop da atividade
            while (funcaoDif == 0) {
                //entra no loop da atividade
                println("(0)-Para sair da atividade" +
                        "\n(1)-Para ver a atividade")
                println("Digite aqui um número para continuar: ")
                var funcaoDif = readln().toInt()
                if (funcaoDif == 0) {//Sai da atividade
                    println("Você está saindo da atividade!")
                    sleep(2000)
                    break
                }
                if (funcaoDif == 1) {//Faz a atividade
                    println("Fazendo a atividade!")
                    //Atividade

                    //
                    sleep(2000)
                }
            }
        }
        if (funcao == 7) {
            //entra no loop da atividade
            while (funcaoDif == 0) {
                //entra no loop da atividade
                println("(0)-Para sair da atividade" +
                        "\n(1)-Para ver a atividade")
                println("Digite aqui um número para continuar: ")
                var funcaoDif = readln().toInt()
                if (funcaoDif == 0) {//Sai da atividade
                    println("Você está saindo da atividade!")
                    sleep(2000)
                    break
                }
                if (funcaoDif == 1) {//Faz a atividade
                    println("Fazendo a atividade!")
                    //Atividade

                    //
                    sleep(2000)
                }
            }
        }
        if (funcao == 8) {
            //entra no loop da atividade
            while (funcaoDif == 0) {
                //entra no loop da atividade
                println("(0)-Para sair da atividade" +
                        "\n(1)-Para ver a atividade")
                println("Digite aqui um número para continuar: ")
                var funcaoDif = readln().toInt()
                if (funcaoDif == 0) {//Sai da atividade
                    println("Você está saindo da atividade!")
                    sleep(2000)
                    break
                }
                if (funcaoDif == 1) {//Faz a atividade
                    println("Fazendo a atividade!")
                    //Atividade

                    //
                    sleep(2000)
                }
            }
        }
        if (funcao == 9) {
            //entra no loop da atividade
            while (funcaoDif == 0) {
                //entra no loop da atividade
                println("(0)-Para sair da atividade" +
                        "\n(1)-Para ver a atividade")
                println("Digite aqui um número para continuar: ")
                var funcaoDif = readln().toInt()
                if (funcaoDif == 0) {//Sai da atividade
                    println("Você está saindo da atividade!")
                    sleep(2000)
                    break
                }
                if (funcaoDif == 1) {//Faz a atividade
                    println("Fazendo a atividade!")
                    //Atividade

                    //
                    sleep(2000)
                }
            }
        }
        if (funcao == 10) {
            //entra no loop da atividade
            while (funcaoDif == 0) {
                //entra no loop da atividade
                println("(0)-Para sair da atividade" +
                        "\n(1)-Para ver a atividade")
                println("Digite aqui um número para continuar: ")
                var funcaoDif = readln().toInt()
                if (funcaoDif == 0) {//Sai da atividade
                    println("Você está saindo da atividade!")
                    sleep(2000)
                    break
                }
                if (funcaoDif == 1) {//Faz a atividade
                    println("Fazendo a atividade!")
                    //Atividade

                    //
                    sleep(2000)
                }
            }
        }
        if (funcao >= 11) {//função não definida
            println("Essa função não existe!")
            sleep(2000)
        }

    }
}
fun parOuImpar(numero: Int): String {
    if (numero % 2 == 0) {
        return "Par"
    }else {
        return "Ímpar"
    }

}
fun aprovacaoDkris(numeroPmedia: Int): String {
    if (numeroPmedia >= 90 && numeroPmedia <= 100) {
        return "Excelente"
    }else if (numeroPmedia >= 70 && numeroPmedia <= 89) {
        return "Aprovado"
    }else if (numeroPmedia >= 50 && numeroPmedia <= 69) {
        return "Para Recuperação"
    }else if (numeroPmedia >= 0 && numeroPmedia <= 49) {
        return "Reprovado"
    }else{
        return "Nota inválida"
    }
}
fun medicaoCargaHoraria(nome: String, cargaHorariaTEXTO: String): String {
    val carga = cargaHorariaTEXTO.toIntOrNull()
        ?: return "Carga horária deve ser numérica"
    if (nome == "") {
        return "Nome vazio"
    }else if (carga < 0 ) {
        return "Carga horária deve ser maior que zero"
    }else if (carga > 400) {
        return "Carga horária não pode passar de 400"
    }else{
        return "Curso Válido"
    }
}
data class Curso(
    val id: Int,
    val nome: String,
    val categoria: String,
    val cargaHoraria: Int,
    val nota: Double,
    val ativo: Boolean
)
fun buscarPorId(cursos: List<Curso>, id: Int): Curso? {
    return cursos.firstOrNull { it.id == id }
}
