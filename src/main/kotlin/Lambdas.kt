fun main() {
    {
        println("Me estoy ejecutando dentro de una lambda")
    }()
    println("Primera Lamda ejecutada")
    var miLambda1 = {
        println("Me estoy ejecutando dentro de una lambda contenida en una variable")
    }
    miLambda1.invoke()
    miLambda1()

    escribe5VecesElContenidoDeUnaLambda(miLambda1)

    escribe5VecesElContenidoDeUnaLambda({ println(":)") })

    var lambdaCon1Parametro = { numero : Int ->
        repeat(numero) {
            println("lambdaCon1Parametro se está repitiendo")
        }
    }
    lambdaCon1Parametro(3)
    lambdaCon1Parametro(2)

    var lambdaCon2Parametros = { texto : String, numero: Int ->
        repeat(numero) {
            println(texto)
        }
    }
    lambdaCon2Parametros("Este es el texto que quiero repetir", 2)

    var lambda2ParametrosQueSuma = { num1 : Int, num2 : Int ->
        var b =num1 + num2
        b++
        println()
        num1 + num2
    }


    println(lambda2ParametrosQueSuma(3,2))

    var lambdaAvanzada = { num: Int ->
        if (num%2 == 0)
            num
        else
            num * -1
    }
    println(lambdaAvanzada(1))
    println(lambdaAvanzada(2))

    println("Fin del programa")


    repeat(5, { num : Int ->
        println(num)
    })

    repeat(5){ num : Int ->
        println(num)
    }

    var l = listOf(11,22,33,44,55)
    l.forEach({elemento : Int -> println(elemento) })
    l.forEach { elemento : Int -> println(elemento) }

    var miLambda = {elemento : Int ->
        val out = elemento*2
        println(out)
    }

    l.forEach(miLambda)
    
}


fun escribe5VecesElContenidoDeUnaLambda(lambda: () -> Unit) {
    repeat(5) {
        lambda()
    }

}
