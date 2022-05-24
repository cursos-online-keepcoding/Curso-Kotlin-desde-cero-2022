import kotlin.random.Random

fun main() {

    val dado1 = Dado(1,6)
    println(dado1.tiradaSimple())
    println(dado1.tiradaMultiple(100))
    println(dado1.tiradaMultiple(100))
    println(dado1.tiradaSimple())


    dado1.getHistorico()
    val analizador = AnalizadorEstadistico()
    analizador.analizarDado(dado1)

}

class AnalizadorEstadistico() {

    fun analizarDado(dado: Dado){
        println("El número de tiradas es ${dado.getHistorico().size}")// Obtener el número de tiradas

        println(contarApariciones(dado))// Obtener el número de veces que se repite cada valor.

        println(calcularMedia(dado))// La media de las tiradas realizadas.
    }

    private fun contarApariciones(dado: Dado) : String {
        val listaResultado = MutableList(dado.valorMax - dado.valorMin + 1) {
            0
        }

       dado.getHistorico().forEach {
            listaResultado[it - dado.valorMin] += 1
        }
        return  listaResultado.toString()
    }

    private fun calcularMedia(dado: Dado) : String {
        var sumatorio = 0
        dado.getHistorico().forEach { sumatorio += it }
        val media = sumatorio / dado.getHistorico().size.toDouble()
        return media.toString()
    }
}

open class Dado(val valorMin: Int, val valorMax: Int){

    private val historicoTiradas = MutableList(0) { 0 }

    fun tiradaSimple() : Int {
        val numAleatorio = Random.nextInt(valorMin, valorMax+1)
        historicoTiradas.add(numAleatorio)
        return numAleatorio
    }

    fun tiradaMultiple(repeticiones: Int) : List<Int> {
        val list = MutableList(0) { 0 }
        repeat(repeticiones) {
            list.add(tiradaSimple())
        }
        return list
    }

    fun getHistorico(): List<Int>{
        return historicoTiradas
    }
}