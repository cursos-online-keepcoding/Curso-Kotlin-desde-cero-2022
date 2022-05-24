fun main() {
    val mascota1 = Mascota("Piolin", "Periquito")
    val mascota2 = Mascota("Piolin", "Periquito")
    println(mascota1)
    println(mascota2)

    if (mascota1 == mascota2) {
        println("Son iguales")
    } else {
        println("No son iguales")
    }

    val mascota3 =  Mascota(mascota1.nombre, mascota1.especie)
    mascota3.nombre = "Snoopy"
    mascota3.especie = "perro"
    println(mascota3)
    println(mascota1)


    val mascotaDataClass1 = MascotaDataClass("Piolin", "Periquito")
    val mascotaDataClass2 = MascotaDataClass("Piolin", "Periquito")
    println(mascotaDataClass1)
    println(mascotaDataClass2)

    if (mascotaDataClass1 == mascotaDataClass2) {
        println("Son iguales")
    } else {
        println("No son iguales")
    }

    val mascotaDataClass3 = mascotaDataClass1.copy()
    mascotaDataClass3.nombre = "Snoopy"
    mascotaDataClass3.especie = "perro"
    println(mascotaDataClass3)
    println(mascotaDataClass1)

}

class Mascota(var nombre: String, var especie : String) {

    override fun toString(): String {
        return "el nombre es $nombre y la especie es $especie"
    }
}

data class MascotaDataClass(var nombre: String, var especie : String)
