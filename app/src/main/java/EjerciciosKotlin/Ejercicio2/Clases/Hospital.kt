package EjerciciosKotlin.Ejercicio2.Clases

open class Hospital {
    var nombre : String
    var nit : String
    var direccion : Direccion
    val listPaciente : MutableList<Paciente> = mutableListOf()
    val listMedico : MutableList<Medico> = mutableListOf()

    constructor(nombre: String, nit: String, direccion: Direccion){
        this.nombre = nombre
        this.nit = nit
        this.direccion = direccion
    }
}