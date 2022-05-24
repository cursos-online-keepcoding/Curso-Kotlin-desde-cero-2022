fun main() {
    val mutableList1 = mutableListOf(1,2,3,4,5)
    println(mutableList1)
    mutableList1[1] = 1
    println(mutableList1)
    mutableList1.add(99)
    println(mutableList1)
    mutableList1.removeAt(2)
    println(mutableList1)
    mutableList1.add(0, -1)
    println(mutableList1)

    // mutableList1 = mutableListOf(2,4) como mutableList1 es "val" no le podemos asignar otra lista.

    var mutableList2 = MutableList(10) { posicion ->
        posicion
    }
    println(mutableList2)
    mutableList2.add(99)
    println(mutableList2)

    mutableList2 = mutableListOf(2,4)
    println(mutableList2)


    val list1 = List(5){
        "Tengo el elemento ${it * 5}"
    }
    println(list1)
    // En una List no podemos añadir, ni eliminar ni cambiar elementos
    // list1[0] = "Hola"

    // list1 = listOf("Hola") Esto no se puede hacer ya que listes de tipo "val"
    var list2 = List(5){
        "Tengo el elemento ${it * 5}"
    }
    println(list2)
    list2 = listOf("Hola", "Adios")
    println(list2)

    var mutableList3 = list2.toMutableList()
    mutableList3.add("!")
    println(mutableList3) // Esto ha cambiado en la mutableList
    println(list2)

    for (elemento in mutableList3) {
        println(elemento)
    }

    list2.forEach { elemento ->
        println(elemento)
    }

    mutableList2.forEachIndexed { index, elemento ->
        println("Soy el elemento $elemento y estoy en la posición $index")
    }

}