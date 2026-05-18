package model

data class Student(
    val id: Int,
    val name: String,
    val email: String,
    val associatedTrail: Trail? = null // Null safety aplicado quando o aluno inicia sem trilha
) {
    init {
        require(id > 0) { "O id do aluno deve ser positivo." }
        require(name.trim().length >= 3) { "O nome deve ter pelo menos 3 caracteres." }
        require(email.contains("@") && email.contains(".")) { "O e-mail fornecido é inválido." }
    }

    companion object {
        // Função de fábrica que limpa e normaliza dados do console antes de construir o objeto
        fun fromRawInput(id: Int, rawName: String, rawEmail: String, trail: Trail? = null): Student {
            return Student(
                id = id,
                name = rawName.trim(),
                email = rawEmail.trim().lowercase(),
                associatedTrail = trail
            )
        }
    }
}
