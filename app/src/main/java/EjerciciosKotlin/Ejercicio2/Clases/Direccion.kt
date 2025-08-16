package EjerciciosKotlin.Ejercicio2.Clases

class Direccion {
    var calle : String
    var numero : String
    var barrio : String
    var ciudad : String
    var codigoPostal : String

    constructor(calle: String,numero: String,barrio: String,ciudad: String,codigoPostal: String){
        this.calle = calle
        this.numero = numero
        this.barrio = barrio
        this.ciudad = ciudad
        this.codigoPostal = codigoPostal
    }
}