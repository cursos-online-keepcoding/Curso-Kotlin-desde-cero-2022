fun main() {
    println("funcionRepeat")
    funcionRepeat()
    println("funcionWhile")
    funcionWhile()
    println("funcionDoWhile")
    funcionDoWhile()
    println("funcionFor")
    funcionFor()
}

fun funcionFor() {
    for(i in 0..9) {
        println(i)
    }
    println()
    for(i in 0..9) {
        if (i % 2 == 0)
            println(i)
    }
    println("Ya hemos terminado el funcionFor")

}

fun funcionDoWhile() {
    var num = 0
    do {
        println(num)
        num++
    } while(num<10)
    println()

    num = 100
    do {
        println("Este texto si que se va a escribir")
        println(num)
        num++
    } while(num<10)

    println("Ya hemos terminado el funcionDoWhile")
}

fun funcionWhile() {
    var num = 0
    while(num < 10) {
        println(num)
        num++
    }
    println()

    num = 0
    while(num < 10) {
        if (num % 2 == 0)
            println(num)
        num++
    }
    println()

    num = 0
    while(num < 10) {
        println(num)
        num+=2
    }
    println()

    num = 0
    while (num < 10) {
        println(num)
        if (num > 5)
            break
        num++
    }

    num = 10
    while(num < 10) {
        println("Esto no se escribirá nunca")
        num++
    }
    println("Ya hemos terminado el funcionWhile")
}

fun funcionRepeat() {
    repeat(10) { posicion ->
        println(posicion)
    }
    println()
    repeat(10) { posicion ->
        if (posicion % 2 == 0)
            println(posicion)
    }
    repeat(10) {
        println(it)
    }
    println()

    val numRepeticiones = 5
    repeat(numRepeticiones) {
        println(it)
    }
    println()

    repeat(numRepeticiones) {
        println(it)
        if (it > 1)
            return
    }
    println("Ya hemos terminado el funcionRepeat")

}


