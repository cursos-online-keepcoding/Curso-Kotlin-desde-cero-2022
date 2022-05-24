import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    ejercicio4A()
    ejercicio4B()
}

fun ejercicio4B() {
    val lista = listOf("H", 1, 2, "o", 0.2, "l", 1.0, "a", 0.3, "!")
    var stringsConcatenados = ""
    var suma = 0.0

    lista.forEach {
        when (it) {
            is Int -> suma += it
            is Double -> suma += it
            is String -> stringsConcatenados += it
        }
    }

    println("Los strings concatenados forman el siguiente texto $stringsConcatenados")
    println("La suma de todos los números es $suma")

}

fun ejercicio4A(){
    var listaRandom = MutableList(100) {
        Random.nextInt(0..9)
    }
    println(listaRandom)

    listaRandom.forEach {
        print("$it, ")
    }
    println()

    var listaResultado = MutableList(10) {
        0
    }

    println(listaResultado)

    listaRandom.forEach {
        listaResultado[it] += 1
    }

    println(listaResultado)

}