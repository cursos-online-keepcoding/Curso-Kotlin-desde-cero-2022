fun main() {
    val miLambda1 = { println("Esta Lambda escribe: Hola") }
    miLambda1()

    val miLambda2 =  {integer : Int -> println("Esta Lambda recibe un Int y lo escribe: $integer") }
    miLambda2(1)

    val miLambda3 = {posicion : Int, list : List<Any> -> println("Esta Lambda recibe un Int y una Lista. Escribe al elemento que haya en la posición ${ list[posicion]}")}
    val list = listOf(1,"hola", 1.0, 'c')
    miLambda3(0, list)
    miLambda3(1, list)
    miLambda3(2, list)
    miLambda3(3, list)
}

fun lambda1() { println("Esta Lambda escribe: Hola") }
fun lambda2(integer : Int) {  println("Esta Lambda recibe un Int y lo escribe: $integer") }
fun lambda3(posicion : Int, list : List<Any>) { println("Esta Lambda recibe un Int y una Lista. Escribe al elemento que haya en la posición ${ list[posicion]}") }
