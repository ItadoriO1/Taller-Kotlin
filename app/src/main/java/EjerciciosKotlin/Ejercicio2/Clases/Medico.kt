package EjerciciosKotlin.Ejercicio2.Clases

open class Medico : Persona {

    var numLicencia: String
    var especialidad : String
    var anioIngreso : Int

    val listaPaciente : MutableList<Paciente> = mutableListOf()
    var horario : Horario
    var salario : Double

    constructor(
        nombre: String,
        cedula: String,
        genero : String,
        email: String,
        telefono: String,
        numLicencia: String,
        especialidad : String,
        anioIngreso : Int,
        salario : Double,
        horario : Horario
    ) : super(nombre, cedula, genero, email, telefono) {
        this.numLicencia = numLicencia
        this.especialidad = especialidad
        this.anioIngreso = anioIngreso
        this.salario = salario
        this.horario = horario
    }

}
