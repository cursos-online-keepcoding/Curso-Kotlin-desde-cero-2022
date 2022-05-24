fun main() {
    var i = 1

    var persona = Persona("Juan", 15)
    persona.cumplirAnios()
    persona.cumplirAnios()
    println(persona)


    var persona2 = Persona("Mario", 20)
    persona2.cumplirAnios()
    println(persona2)
}

class Persona(var nombre : String, private var edad: Int) {

    fun cumplirAnios() {
        celebrarCumpleanios()
        edad++
    }

    private fun celebrarCumpleanios(){
        println("Soy $nombre y voy a cumplir años")
    }

    override fun toString(): String {
        return "Me llamo $nombre y tengo $edad años"
    }
}