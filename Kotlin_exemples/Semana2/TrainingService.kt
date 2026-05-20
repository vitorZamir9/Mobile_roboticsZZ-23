package service

import model.*

class TrainingService {
    private val students = mutableListOf<Student>()
    private val trails = mutableListOf<Trail>()
    private val enrollments = mutableListOf<Enrollment>()

    fun registerStudent(student: Student): Boolean {
        if (students.any { it.id == student.id }) return false
        students.add(student)
        return true
    }

    fun registerTrail(trail: Trail): Boolean {
        if (trails.any { it.id == trail.id }) return false
        trails.add(trail)
        return true
    }

    fun findStudentById(id: Int): Student? = students.find { it.id == id }
    fun findTrailById(id: Int): Trail? = trails.find { it.id == id }

    // Regra Crítica: Impede matrícula duplicada do mesmo aluno na mesma trilha
    fun enrollStudent(enrollmentId: Int, studentId: Int, trailId: Int): Result<Enrollment> {
        val student = findStudentById(studentId) ?: return Result.failure(Exception("Aluno não encontrado."))
        val trail = findTrailById(trailId) ?: return Result.failure(Exception("Trilha não encontrada."))

        if (enrollments.any { it.student.id == studentId && it.trail.id == trailId }) {
            return Result.failure(Exception("Aluno já está matriculado nesta trilha."))
        }

        return try {
            val newEnrollment = Enrollment(enrollmentId, student, trail)
            enrollments.add(newEnrollment)
            Result.success(newEnrollment)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    fun advanceProgress(studentId: Int, trailId: Int): Boolean {
        val enrollment = enrollments.find { it.student.id == studentId && it.trail.id == trailId }
        return enrollment?.progress?.completeOne() ?: false
    }

    fun getEnrollments(): List<Enrollment> = enrollments.toList()

    // Gera o ranking ordenado por quem tem maior percentual de conclusão (Requisito do Relatório)
    fun getRanking(): List<Enrollment> {
        return enrollments.sortedByDescending { it.progress.percent() }
    }
}