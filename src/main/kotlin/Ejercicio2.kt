fun main() {
    println(calcularPrecioIf("Carlos", 34))
    println(calcularPrecioIf("Rodolfo", 84))
    println(calcularPrecioIf("Arturo", 15))

    println(calcularPrecioWhen("Carlos", 34))
    println(calcularPrecioWhen("Rodolfo", 84))
    println(calcularPrecioWhen("Arturo", 15))
}

fun calcularPrecioWhen(nombre: String, edad: Int): String {
    when {
        edad < 18 -> return "$nombre, debes abonar 5€"
        edad in 18..64 -> return "$nombre, debes abonar 10€"
        else -> return "$nombre, para ti es gratis"
    }
}

fun calcularPrecioIf(nombre: String, edad: Int) : String {
    if (edad < 18) return "$nombre, debes abonar 5€"
    else if (edad < 65) return "$nombre, debes abonar 10€"
    else return "$nombre, para ti es gratis"
}
