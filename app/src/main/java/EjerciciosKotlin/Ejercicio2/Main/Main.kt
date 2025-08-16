package EjerciciosKotlin.Ejercicio2.Main

import EjerciciosKotlin.Ejercicio2.Clases.Direccion
import EjerciciosKotlin.Ejercicio2.Clases.Horario
import EjerciciosKotlin.Ejercicio2.Clases.Medico
import EjerciciosKotlin.Ejercicio2.Clases.Paciente
import EjerciciosKotlin.Ejercicio2.Controller.HospitalController

fun main() {
    println("!Bienvenido, para comenzar crea tu hospital¡")

    println("Nombre del hospital:")
    var nombre = readln()

    println("Nit del hospital:")
    var nit = readln()

    println("Calle donde se encuentra el hospital:")
    var calle = readln()

    println("Numero donde se encuentra el hospiatal:")
    var numero = readln()

    println("Barrio donde se encuentra el hospital:")
    var barrio = readln()

    println("Ciudad donde se encuentra el hospital:")
    var ciudad = readln()

    println("Codigo postal donde se encuentra el hospital:")
    var codigoPostal = readln()

    val hospital = HospitalController(nombre, nit, Direccion(calle, numero, barrio, ciudad, codigoPostal))

    println("Felicidades creaste tu hospital ${hospital.hospital.nombre}")

    println("Que desea hacer?")

    println("1.Manejo de medicos")
    println("2.Manejo de pacientes")
    var opcion = readln().toInt()

    if(opcion == 1){
        do {
            println("1.Crar medico")
            println("2.Buscar Medico")
            println("3.Editar Medico")
            println("4.Eliminar Medico")
            println("5.Total de salarios")
            println("6.Total de salarios por especialidad")
            println("7.Total de medicos por especialidad")
            println("8.Medico mas antiguo")
            var opcion2 = readln().toInt()
            when(opcion2){
                1 -> {
                    println("Nombre del medico:")
                    var nombre = readln()

                    println("Cedula del medico:")
                    var cedula = readln()

                    println("Genero del medico:")
                    var genero = readln()

                    println("Email del medico:")
                    var email = readln()

                    println("Telefono del medico:")
                    var telefono = readln()

                    println("Numero de licencia del medico:")
                    var numLicencia = readln()

                    println("Especialidad del medico:")
                    var especialidad = readln()

                    println("Anio de ingreso del medico:")
                    var anioIngreso = readln().toInt()

                    println("Ingresa el dia de trabajo del medico:")
                    var dia = readln()

                    println("Ingresa la hora de inicio del medico:")
                    var horaInicio = readln()

                    println("Ingresa la hora de fin del medico:")
                    var horaFin = readln()

                    println("Salario del medico:")
                    var salario = readln().toInt()

                    hospital.createMedico(Medico(nombre, cedula, genero, email, telefono, numLicencia, especialidad, anioIngreso, salario, Horario(dia, horaInicio, horaFin)))
                }
                2 -> {
                    println("Cedula del medico:")
                    var cedula = readln()
                    var med = hospital.readMedico(cedula)
                    if (med != null){
                        println("Nombre del medico: ${med.nombre}")
                        println("Cedula del medico: ${med.cedula}")
                    }else{
                        println("No se encontro el medico")
                    }
                }
                3 -> {
                    println("Cedula del medico:")
                    var cedula = readln()
                    var med = hospital.readMedico(cedula)
                    if (med != null){
                        println("Nombre del medico:")
                        var nombre = readln()

                        println("Cedula del medico:")
                        var cedula = readln()

                        println("Genero del medico:")
                        var genero = readln()

                        println("Email del medico:")
                        var email = readln()

                        println("Telefono del medico:")
                        var telefono = readln()

                        println("Numero de licencia del medico:")
                        var numLicencia = readln()

                        println("Especialidad del medico:")
                        var especialidad = readln()

                        println("Anio de ingreso del medico:")
                        var anioIngreso = readln().toInt()

                        println("Ingresa el dia de trabajo del medico:")
                        var dia = readln()

                        println("Ingresa la hora de inicio del medico:")
                        var horaInicio = readln()

                        println("Ingresa la hora de fin del medico:")
                        var horaFin = readln()

                        println("Salario del medico:")
                        var salario = readln().toInt()

                        hospital.editMedico(Medico(nombre, cedula, genero, email, telefono, numLicencia, especialidad, anioIngreso, salario, Horario(dia, horaInicio, horaFin)))
                    }else{
                        println("No se encontro el medico")
                    }
                }
                4 -> {
                    println("Cedula del medico:")
                    var cedula = readln()
                    var med = hospital.readMedico(cedula)
                    if (med != null){
                        hospital.deleteMedico(med)
                    }else{
                        println("No se encontro el medico")
                    }
                }
                5 -> {
                    println("Total de salarios: ${hospital.totalSalarios()}")
                }
                6 -> {
                    println("Especialidad del medico:")
                    var especialidad = readln()
                    println("Total de salarios: ${hospital.totalSalariosEspecialidad(especialidad)}")
                }
                7 -> {
                    println("Especialidad del medico:")
                    var especialidad = readln()
                    println("Total de medicos: ${hospital.cantidadDeMedicosPorEspecialidad(especialidad)}")
                }
                8 -> {
                    println("Medico mas antiguo: ${hospital.medicoMasAntiguo()?.nombre}")
                }
            }
            println("Desea realizar otra accion?")
            var continuar = readln().lowercase()
        }while (continuar == "si")
    } else {
        do{
            println("1.Crear paciente")
            println("2.Buscar paciente")
            println("3.Editar paciente")
            println("4.Eliminar paciente")
            println("5.Total de pacientes por genero")
            var opcion2 = readln().toInt()
            when(opcion2){
                1 -> {
                    println("Nombre del paciente:")
                    var nombre = readln()

                    println("Cedula del paciente:")
                    var cedula = readln()

                    println("Genero del paciente:")
                    var genero = readln()

                    println("Email del paciente:")
                    var email = readln()

                    println("Telefono del paciente:")
                    var telefono = readln()

                    hospital.createPaciente(Paciente(nombre, cedula, genero, email, telefono))
                }
                2 -> {
                    println("Cedula del paciente:")
                    var cedula = readln()

                    var pac = hospital.readPaciente(cedula)
                    if (pac != null){
                        println("Nombre del paciente: ${pac.nombre}")
                        println("Cedula del paciente: ${pac.cedula}")
                    }else{
                        println("No se encontro el paciente")
                    }
                }
                3 -> {
                    println("Cedula del paciente:")
                    var cedula = readln()

                    var pac = hospital.readPaciente(cedula)
                    if (pac != null){
                        println("Nombre del paciente:")
                        var nombre = readln()

                        println("Cedula del paciente:")
                        var cedula = readln()

                        println("Genero del paciente:")
                        var genero = readln()

                        println("Email del paciente:")
                        var email = readln()

                        println("Telefono del paciente:")
                        var telefono = readln()

                        hospital.editPaciente(Paciente(nombre, cedula, genero, email, telefono))
                    }else{
                        println("No se encontro el paciente")
                    }
                }
                4 -> {
                    println("Cedula del paciente:")
                    var cedula = readln()

                    var pac = hospital.readPaciente(cedula)
                    if (pac != null){
                        hospital.deletePaciente(pac)
                    }else{
                        println("No se encontro el paciente")
                    }
                }
                5 -> {
                    println("Genero del paciente:")
                    var genero = readln()
                    println("Total de pacientes: ${hospital.totalPacientesPorGenero(genero)}")
                }
            }
            println("Desea realizar otra accion?")
            var continuar = readln().lowercase()
        }while (continuar == "si")
    }
}
