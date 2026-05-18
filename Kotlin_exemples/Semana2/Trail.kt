package model

class Trail(
    val id: Int,
    val name: String,
    var status: TrailStatus = TrailStatus.OPEN
) {
    // Lista mutável privada para proteger o estado interno contra manipulação externa direta
    private val _courses = mutableListOf<Course>()

    init {
        require(id > 0) { "O id da trilha deve ser positivo." }
        require(name.isNotBlank()) { "O nome da trilha é obrigatório." }
    }

    // Regra de negócio explícita trazida do briefing
    fun addCourse(course: Course): Boolean {
        if (status != TrailStatus.OPEN) return false
        if (_courses.any { it.id == course.id }) return false // Evita a duplicação de cursos
        _courses.add(course)
        return true
    }

    // Método de cálculo centralizado
    fun totalWorkload(): Int = _courses.sumOf { it.workloadHours }

    // Expõe uma visão somente leitura (read-only) para o console, impedindo .clear() ou .remove() externos
    fun listCourses(): List<Course> = _courses.toList()
}
