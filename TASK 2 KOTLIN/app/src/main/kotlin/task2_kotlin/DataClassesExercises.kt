package task2_kotlin

import task2_kotlin.models.Persona
import task2_kotlin.models.Libro

class DataClassesExercises {
    fun ejercicio1() {
        val libro = Libro("El Prinicipio del Placer")
        println(libro)
    }

    fun ejercicio2() {
        val persona = Persona("Juan Gabriel", 64)
        val personaActualizada = persona.copy(edad = 31)
        println("Persona original: $persona")
        println("Persona actualizada: $personaActualizada")
        println("¿Son iguales? ${persona == personaActualizada}")
    }
}