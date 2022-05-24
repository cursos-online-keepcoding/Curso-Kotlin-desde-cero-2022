fun main() {
    println("Estoy en el fichero FUNCIONES")

    funcionDiHola()

    var resultadoFuncion = devuelvemeUnHola()
    println(resultadoFuncion)

    println(devuelvemeUnHola())

    // Error 1: Ignorar lo que me devuelve la función
    // devuelvemeUnHola()

    // Error 2: Tomar el valor de una función que no devuelve nada conocido.
    println(funcionDiHola())

    saluda("Rodolfo")

    val name = "Pedro"
    saluda(name)

    var otroNombre = "Juan"
    otroNombre = addApellido(otroNombre)
    println(otroNombre)

    saludaDesconocido()
    saludaDesconocido("Alfredo")

    println(sumaEnteros(3,2))
}

fun funcionDiHola() {
    var texto = "Hola!"
    println(texto)
}

fun devuelvemeUnHola() : String {
    return "Hola"
}

fun saluda(nombre: String) {
    println("Hola $nombre")
}

fun addApellido(nombre: String) : String {
    return "$nombre Pérez"
}

fun saludaDesconocido(nombre: String = "desconocido") {
    println("Hola $nombre")
}

fun sumaEnteros(entero1 : Int, entero2: Int) : Int {
    return entero1 + entero2
}