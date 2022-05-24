fun main(args: Array<String>) {
    println("Hola Amigos")

    var miBooleanoTrue = true
    val miBooleanoFalse = false
    println(miBooleanoTrue)
    println(miBooleanoFalse)

    miBooleanoTrue = false
    println(miBooleanoTrue)

    // como miBooleanoFalse es de un VAL, no puedo cambiar el valor a true


    var miEntero = 1
    println(miEntero)
    miEntero = 1 + 2
    println(miEntero)
    miEntero = 2 - 1
    println(miEntero)
    miEntero = 2 * 1
    println(miEntero)
    miEntero = 2 / 1
    println(miEntero)
    miEntero += 3
    println(miEntero)
    miEntero -= 1
    println(miEntero)
    miEntero *= 2
    println(miEntero)
    miEntero /= 2
    println(miEntero)
    miEntero = 9/2
    println(miEntero)
    println(miEntero.toDouble())


    var miDecimal = 1.0
    println(miDecimal)
    miDecimal = 1.0 + 1
    println(miDecimal)
    miDecimal = 9.0 / 2
    println(miDecimal)
    println(miDecimal.toInt())

    var miLetra = 'a'
    println(miLetra)
    miLetra += 1
    println(miLetra)
    miLetra = '2'
    println(miLetra.digitToInt())

    var miTexto = "Hola"
    println(miTexto)
    miTexto = "Hola" + " " + "que tal"
    println(miTexto)
    miTexto = "Soy el número " + miEntero
    println(miTexto)
    miEntero = 2
    println(miEntero)

    miDecimal = 5.0
    println(miDecimal)

    miLetra = 'g'
    println(miLetra)

    miTexto = "Amigo"
    println(miTexto)

    val miByte : Byte = 1
    println(miByte)

    val miShort : Short = 1
    println(miShort)

    val miLong1 : Long = 1
    println(miLong1)

    val miLong2 = 1L
    println(miLong2)

    var suma = miEntero + miByte.toLong()

    val miShort2 : Short = 200
    println(miShort2.toByte())

    var miEnteroConNulo : Int? = null
    miEnteroConNulo?.toDouble()

    var miText2 : String? = null
    println(miText2?.length)

}