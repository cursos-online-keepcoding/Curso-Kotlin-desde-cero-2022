fun main() {
    primerIF(1)
    primerIF(2)
    tiene4char("Hola")
    tiene4char("Que tal")

    compararNumeros(1,1)

    primerWhen(0)
    primerWhen(1)
    primerWhen(2)
    primerWhen(3)
    primerWhen(4)
    primerWhen(5)
    primerWhen(6)
    primerWhen(7)

    whenAvanzado(18, true)
    whenAvanzado(16, true)
    whenAvanzado(18, false)
    whenAvanzado(16, false)

}



fun compararNumeros(num1: Int, num2: Int) {
    if (num1 > num2) {
        println("num1 es mayor que num2")
    } else {
        if (num1 == num2) {
            println("num1 es igual a num2")
        } else {
            println("num2 es mayor que num1")
        }
    }
}

fun primerIF(num : Int) {
    if (num == 1) {
        println("Num es igual a uno")
        println("Sigo estando dentro del IF")
    } else {
        println("Num no es igual a uno")
        println("Sigo estando dentro del ELSE")
    }
    println("Fin del primerIF")
}

fun tiene4char(texto: String) {
    if (texto.length == 4) {
        println("El texto \"$texto\" tiene 4 chars")
    } else {
        println("El texto \"$texto\" tiene un número distinto de 4 chars")
    }
}

fun primerWhen(num: Int) {
    when(num) {
        0 -> {
            println("Cero")
            println("Este es el número más bajo que tenemos en cuenta.")
        }
        1 -> println("Uno")
        2 -> println("Dos")
        in 3..6 -> println("Número comprendido entre 3 y 6")
        else -> println("El número no está comprendido entre el 0 y el 6")
    }
}

fun whenAvanzado(edad: Int, trabaja: Boolean) {

    when {
        (edad >= 18 && trabaja) -> println("Esta persona es MAYOR de edad y SI está trabajando")
        (edad < 18 && trabaja) -> println("Esta persona es MENOR de edad y SI está trabajando")
        (edad >= 18 && !trabaja) -> println("Esta persona es MAYOR de edad y NO está trabajando")
        (edad < 18 && !trabaja) -> println("Esta persona es MENOR de edad y NO está trabajando")
    }
    
}
