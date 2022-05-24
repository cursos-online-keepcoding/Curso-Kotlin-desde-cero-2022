import kotlin.random.Random

fun main() {
    repeat(5){
        val numAleatorio = Random.nextInt(0,10)

        println("Encuentra un número del 0..9")
        var encontrado = false

        do {
            println("Escribe tu número")
            var respuestaDelUsuario = readLine()
            if (respuestaDelUsuario != null) {
                println("Has introducido: ${respuestaDelUsuario.toInt()}")
                if (numAleatorio == respuestaDelUsuario.toInt()) {
                    encontrado = true
                } else if (numAleatorio > respuestaDelUsuario.toInt()) {
                    println("El número buscado es más grande")
                } else {
                    println("El número buscado es más pequeño")
                }
            }
        } while(!encontrado)
        println("Enhorabuena! Has acertado. El número buscado era el $numAleatorio")
    }
}