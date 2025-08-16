package EjerciciosKotlin.Ejercicio2.Clases

open class Persona {
    var nombre : String
    var cedula : String
    var genero : String
    var email : String
    var telefono : String

    constructor(nombre: String,cedula:String,genero:String,email: String,telefono: String){
        this.nombre = nombre
        this.cedula = cedula
        this.genero = genero
        this.email = email
        this.telefono = telefono
    }
}