var texto : String? = null

fun main() {
    texto = "1"
    texto.let {
        if (it != null)
            println(it.toInt())
    }
    texto?.let {
        println(it.toInt())
    }

    //if (texto != null)
    //    println(texto.toInt())

    run {
        // println(texto.toInt())
    }
    texto.run {
       // println(this.toInt())
    }
    texto?.run {
        println(this.toInt())
    }

    with(texto){
        //println(this.toInt())
    }

    texto.also {
      //  println(it.toInt())
    }

    texto?.also {
        println(it.toInt())
    }

    texto.apply {
       // println(this.toInt())
    }

    texto?.apply {
        println(this.toInt())
    }
}