import com.google.gson.Gson

fun main() {
    val json = deObjetoAJson(Persona("Roberto", 23))
    val persona = deJsonAObjeto(json)
}

fun deJsonAObjeto(json: String): Persona {
    val gson = Gson()
    val persona = gson.fromJson(json, Persona::class.java)
    println(persona)
    return persona
}

fun deObjetoAJson(persona: Persona) : String {
    val gson = Gson()
    val json = gson.toJson(persona)
    println(json)
    return json
}