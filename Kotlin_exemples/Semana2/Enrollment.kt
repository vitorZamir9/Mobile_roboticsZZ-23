package model

import java.time.LocalDate

data class Enrollment(
    val id: Int,
    val student: Student,
    val trail: Trail,
    val enrollmentDate: LocalDate = LocalDate.now(),
    val progress: Progress = Progress(trail.listCourses().size)
) {
    init {
        require(id > 0) { "O ID da matrícula deve ser positivo." }
        // Garante que não podemos matricular alguém numa trilha que não tem cursos cadastrados
        require(trail.listCourses().isNotEmpty()) { "Não é possível matricular em uma trilha sem cursos." }
    }
}