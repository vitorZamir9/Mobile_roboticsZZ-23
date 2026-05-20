package model

data class Progress(
    val total: Int,
    private var _completed: Int = 0
) {
    val completed: Int get() = _completed

    init {
        require(total > 0) { "Total de cursos da trilha deve ser maior que zero." }
        require(_completed >= 0) { "Cursos concluídos não pode ser negativo." }
        require(_completed <= total) { "Cursos concluídos não pode superar o total." }
    }

    fun completeOne(): Boolean {
        if (_completed >= total) return false
        _completed++
        return true
    }

    // Retorna a porcentagem inteira protegida contra divisões inválidas
    fun percent(): Int = (_completed * 100) / total
}