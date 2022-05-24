import kotlin.random.Random

fun main() {
    val array1 = arrayOf(1,2,3,4,5)
    println(array1[0])
    println(array1[1])
    println(array1[2])
    println(array1[3])
    println(array1[4])
    // println(array1[5].toString()) Este nos daría error ya que no existe un elemento en la posición 5

    val array2 = arrayOf('a','b','c','d','e')
    println(array2[0])
    println(array2[1])
    println(array2[2])
    println(array2[3])
    println(array2[4])

    array2[0] = 'z'
    array1[1] = 1
    // array2[1] = 1 No se puede ya que array2 espera chars y le estamos pasando un número.

    val array3 = arrayOf(1,'b',3,'d',5)
    println(array3[0])
    println(array3[1])
    println(array3[2])
    println(array3[3])
    println(array3[4])


    val array4 = Array(10) { posicion ->
        "En la posición $posicion guardamos un ${Random.nextInt(0,100)}"
    }

    println(array4)

    val array5 = Array(10) { posicion ->
       if (posicion % 2 == 0) {
           "Cara"
       } else {
           0
       }
    }

    repeat(array4.size) { posicion ->
        println(array4[posicion])
    }

    for(i in array5) {
        println(i)
    }

    array5.forEach { elemento ->
        println(elemento)
    }

    array1.forEachIndexed { index, elemento ->
        println("En la posición $index se encuentra el elemento $elemento")
    }
}