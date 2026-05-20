import model.*
import service.TrainingService

fun main() {
    val service = TrainingService()

    // Setup inicial de testes (Mock data robusto)
    val c1 = Course(1, "Kotlin POO Avançado", 20, CourseLevel.INTERMEDIATE)
    val c2 = Course(2, "Arquitetura Android", 30, CourseLevel.ADVANCED)

    val trilha = Trail(10, "Desenvolvimento Mobile")
    trilha.addCourse(c1)
    trilha.addCourse(c2)
    service.registerTrail(trilha)

    println("=== SISTEMA EVOLUÍDO - BASE QUARTA-FEIRA ===")

    while (true) {
        println("\n--- MENU DE OPERAÇÕES ---")
        println("1. Cadastrar Aluno")
        println("2. Realizar Nova Matrícula em Trilha")
        println("3. Registrar Progresso (Concluir 1 Curso)")
        println("4. Ver Relatório Geral e Ranking")
        println("5. Sair")
        print("Selecione: ")

        when (readlnOrNull()?.trim()) {
            "1" -> {
                try {
                    print("ID do Aluno (Inteiro): ")
                    val id = readln().toInt()
                    print("Nome do Aluno: ")
                    val name = readln()
                    print("E-mail do Aluno: ")
                    val email = readln()

                    val student = Student.fromRawInput(id, name, email)
                    if (service.registerStudent(student)) {
                        println("Aluno registrado.")
                    } else {
                        println("ID de aluno já existe.")
                    }
                } catch (e: NumberFormatException) {
                    println("Erro: O ID digitado deve ser um número inteiro válido.")
                } catch (e: IllegalArgumentException) {
                    println("Erro de Validação: ${e.message}")
                }
            }
            "2" -> {
                try {
                    print("ID da Matrícula: ")
                    val eId = readln().toInt()
                    print("ID do Aluno: ")
                    val sId = readln().toInt()
                    print("ID da Trilha: ")
                    val tId = readln().toInt()

                    service.enrollStudent(eId, sId, tId)
                        .onSuccess { println("Matrícula realizada com sucesso!") }
                        .onFailure { error -> println("Falha na matrícula: ${error.message}") }
                } catch (e: Exception) {
                    println("Entrada inválida detectada.")
                }
            }
            "3" -> {
                try {
                    print("ID do Aluno: ")
                    val sId = readln().toInt()
                    print("ID da Trilha: ")
                    val tId = readln().toInt()

                    if (service.advanceProgress(sId, tId)) {
                        println("Progresso atualizado! Mais um curso concluído na trilha.")
                    } else {
                        println("Não foi possível avançar (Matrícula não existe ou trilha já concluída).")
                    }
                } catch (e: Exception) {
                    println("Erro ao processar dados informados.")
                }
            }
            "4" -> {
                val ranking = service.getRanking()
                if (ranking.isEmpty()) {
                    println("Nenhuma matrícula ativa para gerar relatórios.")
                } else {
                    println("\n--- RANKING DE PROGRESSO NAS TRILHAS ---")
                    ranking.forEachIndexed { index, enrollment ->
                        println("${index + 1}º - Aluno: ${enrollment.student.name}")
                        println("     Trilha: ${enrollment.trail.name}")
                        println("     Progresso: ${enrollment.progress.completed}/${enrollment.progress.total} cursos concluídos (${enrollment.progress.percent()}%)")
                    }
                }
            }
            "5" -> {
                println("Encerrando sprint de quarta-feira.")
                break
            }
            else -> println("Opção inválida.")
        }
    }
}