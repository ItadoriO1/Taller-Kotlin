package EjerciciosKotlin.Ejercicio2.Clases

class Horario {
    var dia : String
    var horaInicio : String
    var horaFin : String

    constructor(
        dia : String,
        horaInicio : String,
        horaFin : String
    ){
        this.dia = dia
        this.horaInicio = horaInicio
        this.horaFin = horaFin
    }
}
