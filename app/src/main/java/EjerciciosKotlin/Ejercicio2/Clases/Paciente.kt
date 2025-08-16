package EjerciciosKotlin.Ejercicio2.Clases

class Paciente : Persona {
    constructor(
        nombre: String,
        cedula: String,
        genero : String,
        email: String,
        telefono: String,
    ): super(nombre, cedula, genero, email, telefono) {
        this.nombre = nombre
        this.cedula = cedula
        this.genero = genero
        this.email = email
        this.telefono = telefono
    }
}