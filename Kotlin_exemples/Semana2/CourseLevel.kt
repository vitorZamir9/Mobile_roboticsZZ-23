package model

data class Course(
    val id: Int,
    val title: String,
    val workloadHours: Int,
    val level: CourseLevel
) {
    init {
        // Validação de invariantes internas para evitar dados inconsistentes no sistema
        require(id > 0) { "O id do curso deve ser positivo." }
        require(title.isNotBlank()) { "O título do curso é obrigatório." }
        require(workloadHours > 0) { "A carga horária deve ser maior que zero." }
    }
}
