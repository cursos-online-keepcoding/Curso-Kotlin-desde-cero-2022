import com.google.gson.Gson
import java.io.File
import java.io.FileNotFoundException

fun main() {

    val file = File("DadoMejorado.txt")

    val dadoMejorado = try {
       DadoMejorado.fromJson(file.readLines()[0])
    } catch (exception: FileNotFoundException) {
       DadoMejorado(1,6)
    }

    println(dadoMejorado.toJson())
    dadoMejorado.tiradaMultiple(10)
    println(dadoMejorado.toJson())
    file.writeText(dadoMejorado.toJson())
}

class DadoMejorado(valorMin: Int, valorMax: Int) : Dado(valorMin, valorMax) {

    companion object {
        fun fromJson(json: String): DadoMejorado {
            val gson = Gson()
            return gson.fromJson(json, DadoMejorado::class.java)
        }
    }

    fun toJson() : String {
        val gson = Gson()
        return gson.toJson(this)
    }

}