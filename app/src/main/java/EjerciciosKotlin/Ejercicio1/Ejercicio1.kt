package EjerciciosKotlin.Ejercicio1

class Ejercicio1 {
    fun main(){
        convertirDecimal(1000)
        convertirBinario(1002)
    }

    private fun sentenciaWhen(){
        val country = "Colombia"

        when (country){
            "España" -> {
                println("El idioma es español")
            } "Mexico" -> {
            println("El idioma es español")
        } "Colombia"-> {
            println("El idioma es español")
        } "EEUU" -> {
            println("El idioma es ingles")
        } else -> {
            println("No conocemos el idioma")
        }
        }

        val age = 10

        when (age){
            0, 1, 2 ->{
                println("Eres un bebe")
            } in 3..10 -> {
            println("Eres un niño")
        } in 11..17 -> {
            println("Eres un adolecente")
        } in 18..69 -> {
            println("Eres un niño")
        } else ->{
        }
        }
    }

    private fun convertirDecimal(numero: Int){
        if(esBinario(numero)){
            var num = numero
            var result = 0
            var base = 1
            do{
                result += base * (num % 10)
                base = base * 2
                num = num / 10
            } while (num > 0)
            println(result)
        } else {
            convertirBinario(numero)
        }
    }

    private fun convertirBinario(numero: Int){
        if(!esBinario(numero)){
            var num = numero;
            var numDec = "";
            do{
                var resto = (num % 2)
                numDec = resto.toString() + numDec
                num = num / 2
            } while (num > 0)
            print(numDec)
        } else {
            convertirDecimal(numero)
        }
    }

    private fun esBinario(numero: Int): Boolean{
        return numero.toString().all { it == '0' || it == '1' }
    }
}