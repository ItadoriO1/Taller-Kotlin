package EjerciciosKotlin.Ejercicio2.Controller

import EjerciciosKotlin.Ejercicio2.Clases.Medico
import EjerciciosKotlin.Ejercicio2.Clases.Paciente

class MedicoController {
    var medico : Medico

    constructor(med : Medico){
        this.medico = med
    }

    fun asignarPaciente(paciente: Paciente){
        this.medico.listaPaciente.add(paciente)
    }
}