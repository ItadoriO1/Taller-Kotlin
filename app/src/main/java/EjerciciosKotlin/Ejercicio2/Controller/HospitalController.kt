package EjerciciosKotlin.Ejercicio2.Controller

import EjerciciosKotlin.Ejercicio2.Clases.Direccion
import EjerciciosKotlin.Ejercicio2.Clases.Hospital
import EjerciciosKotlin.Ejercicio2.Clases.Medico
import EjerciciosKotlin.Ejercicio2.Clases.Paciente

class HospitalController{
    var hospital : Hospital

    constructor(
        nombre: String,
        nit: String,
        direccion: Direccion
    ){
        hospital = Hospital(nombre, nit, direccion)
    }

    fun createMedico(medico: Medico){
        var med = hospital.listMedico.find { it.cedula == medico.cedula }
        if(med == null){
            hospital.listMedico.add(medico)
        } else {
            println("Revisa el horario del medico")
        }
    }

    fun readMedico(cedula: String) : Medico?{
        var med = hospital.listMedico.find { it.cedula == cedula }
        if (med != null){
            return med
        }
        return null
    }

    fun editMedico(medico: Medico){
        var med = hospital.listMedico.find { it.cedula == medico.cedula }
        if (med != null && !med.horario.horaInicio.equals(med.horario.horaFin)){
            med.nombre = medico.nombre
            med.cedula = medico.cedula
            med.genero = medico.genero
            med.email = medico.email
            med.telefono = medico.telefono
            med.numLicencia = medico.numLicencia
            med.especialidad = medico.especialidad
            med.anioIngreso = medico.anioIngreso
            med.salario = medico.salario
            med.horario = medico.horario
        }
    }

    fun deleteMedico(medico: Medico){
        var med = hospital.listMedico.find { it.cedula == medico.cedula }
        if (med != null && hospital.listMedico.size > 1){
            hospital.listMedico.remove(med)
        } else {
            println("Siempre tiene que haber al menos un medico")
        }
    }

    fun createPaciente(paciente: Paciente){
        var pac = hospital.listPaciente.find { it.cedula == paciente.cedula }
        if(pac == null){
            hospital.listPaciente.add(paciente)
        }
    }

    fun readPaciente(cedula: String) : Paciente?{
        var pac = hospital.listPaciente.find { it.cedula == cedula }
        if (pac != null){
            return pac
        }
        return null
    }

    fun editPaciente(paciente: Paciente){
        var pac = hospital.listPaciente.find { it.cedula == paciente.cedula }
        if (pac != null){
            pac.nombre = paciente.nombre
            pac.cedula = paciente.cedula
            pac.genero = paciente.genero
            pac.email = paciente.email
            pac.telefono = paciente.telefono
        }
    }

    fun deletePaciente(paciente: Paciente){
        var pac = hospital.listPaciente.find { it.cedula == paciente.cedula }
        if (pac != null){
            hospital.listPaciente.remove(pac)
        }
    }

    fun totalSalarios() : Double{
        var total = 0.0
        for (medico in hospital.listMedico){
            total += medico.salario
        }
        return total
    }

    fun totalSalariosEspecialidad(especialidad: String) : Double{
        var total = 0.0
        for (medico in hospital.listMedico){
            if (medico.especialidad.toLowerCase() == especialidad.toLowerCase()){
                total += medico.salario
            }
        }
        return total
    }

    fun totalPacientesPorGenero(genero: String) : Double{
        var total = 0.0
        for (paciente in hospital.listPaciente){
            if (paciente.genero.toLowerCase() == genero.toLowerCase()){
                total++
            }
        }
        return (total/hospital.listPaciente.size)*100
    }

    fun cantidadDeMedicosPorEspecialidad(especialidad: String) : Int{
        var total = 0
        for (medico in hospital.listMedico){
            if(medico.especialidad.toLowerCase() == especialidad.toLowerCase()){
                total++
            }
        }
        return total
    }

    fun medicoMasAntiguo() : Medico?{
        var medico = hospital.listMedico[0]
        for (m in hospital.listMedico){
            if (m.anioIngreso < medico.anioIngreso){
                medico = m
            }
        }
        return medico
    }
}
