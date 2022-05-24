fun main() {

    println(sumaIntegers(1,2))
    println(sumaString("1", "2"))
    diResultado(sumaIntegers(3,4), sumaString("5", "6"))
    decirQuienSoy("Carlos", "Tena")
    println(sumarIntAString(8,8))
    
}

// Crea una función que reciba dos Integer y devuelva un Double. Llámala “sumaIntegers”. Escribe el resultado por pantalla.
fun sumaIntegers(int1: Int, int2: Int) : Double {
    /*
    FORMA 1
    val resultado = int1 + int2
    val resultadoDouble = resultado.toDouble()
    return resultadoDouble*/

    /*
    FORMA 2
    val resltado = int1 + int2
    return resltado.toDouble()
    */

    /* FORMA 3
    return int1.toDouble() + int2.toDouble()
    */

    // FORMA 4
    return (int1 + int2).toDouble()

}

// Crea una función que reciba dos String, los transforme a Integer, los sume y devuelva un Double. Llámala “sumaStrings”. Escribe el resultado por pantalla. Asume que los String se transforman en Int sin problemas.
fun sumaString(string1: String, string2: String): Double {
    val int1 = string1.toInt()
    val int2 = string2.toInt()
    // return (int1 + int2).toDouble()
    return sumaIntegers(int1, int2)
}

// Crea una función que reciba los resultados de las 2 funciones anteriores y escriba: “sumaIntegers ha devuelto un {numero1} y SumaStrings ha devuelto un {numero2}. Llámala “diResultado”.
fun diResultado(fun1: Double, fun2 : Double){
    println("sumaInteger ha devuelto un $fun1 y sumaString ha devuelto un $fun2")
}

// Crea una función que reciba dos Strings, nombre y apellido. La función debe escribir por pantalla: Hola, soy “nombre” y me apellido “apellido” (donde “nombre” y “apellido” son los valores recibidos en las función
fun decirQuienSoy(nombre: String, apellido: String){
    println("Hola, soy $nombre y me apellido $apellido")
}

// Crea una función que reciba dos Int, num1 y num2 y devuelva un String. La función debe sumarlos y devolver un string con el resultado.
fun sumarIntAString(num1: Int, num2: Int) : String {
    return (num1 + num2).toString()
}