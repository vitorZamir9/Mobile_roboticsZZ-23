package service

import model.Student
import model.Trail

class TrainingService {
    private val _students = mutableListOf<Student>()
    private val _trails = mutableListOf<Trail>()

    fun registerStudent(student: Student): Boolean {
        if (_students.any { it.id == student.id }) return false
        _students.add(student)
        return true
    }

    fun registerTrail(trail: Trail): Boolean {
        if (_trails.any { it.id == trail.id }) return false
        _trails.add(trail)
        return true
    }

    fun getAllStudents(): List<Student> = _students.toList()
    fun getAllTrails(): List<Trail> = _trails.toList()
}
