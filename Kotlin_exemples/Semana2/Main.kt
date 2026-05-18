import model.Course
import model.CourseLevel
import model.Student
import model.Trail
import service.TrainingService

fun main() {
    val service = TrainingService()

    println("=== WorldSkills MOB 08 - Treinamento de Segunda-feira ===")
    
    // 1. Instanciando dados válidos para a base mínima
    val cursoBasico = Course(1, "Kotlin Fundamentos", 10, CourseLevel.BASIC)
    val trilhaAndroid = Trail(101, "Trilha Android Core")
    trilhaAndroid.addCourse(cursoBasico)
    service.registerTrail(trilhaAndroid)

    // Uso da função fábrica com dados que precisam de higienização
    val novoAluno = Student.fromRawInput(1, "  Vitor Nascimento  ", " VITOR@EMAIL.COM ", trilhaAndroid)
    service.registerStudent(novoAluno)

    println("Base inicial criada com sucesso: ${service.getAllStudents().first()}")

    // 2. Demonstração de diagnóstico técnico: Testando se as regras do Bloco Init estão a funcionar
    println("\n--- Teste de Mesa de Robustez (Invariantes) ---")
    try {
        println("A tentar criar um curso com carga horária inválida (0h)...")
        Course(2, "Curso Bugado", 0, CourseLevel.ADVANCED)
    } catch (e: IllegalArgumentException) {
        println("✅ Bloqueado com sucesso pelo 'require': ${e.message}")
    }

    try {
        println("A tentar criar um estudante com e-mail inválido...")
        Student(2, "José", "email_sem_arroba_e_ponto")
    } catch (e: IllegalArgumentException) {
        println("✅ Bloqueado com sucesso pelo 'require': ${e.message}")
    }
}
