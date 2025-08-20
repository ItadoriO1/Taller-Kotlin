package EjerciciosKotlin.Ejercicio2.Clases

class Paciente : Persona {

    var direccion : Direccion

    constructor(
        nombre: String,
        cedula: String,
        genero : String,
        email: String,
        telefono: String,
        direccion: Direccion
    ): super(nombre, cedula, genero, email, telefono) {
        this.nombre = nombre
        this.cedula = cedula
        this.genero = genero
        this.email = email
        this.telefono = telefono
        this.direccion = direccion
    }
}