fun main() {
    pregunta1()
    pregunta2()
    pregunta3()
    pregunta4()
}

class User1(var name : String, var password : String)
data class User2(var name : String, var password : String)


fun pregunta1() {
    val user1a = User1("Carlos", "1234")
    val user1b = User1("Carlos", "1234")
    if (user1a == user1b) {
        println("user1a == user1b")
    } else {
        println("user1a != user1b")
    }
}


fun pregunta2() {
    val user2a = User2("Carlos", "1234")
    val user2b = User2("Carlos", "1234")
    if (user2a == user2b) {
        println("user1a == user1b")
    } else {
        println("user1a != user1b")
    }
}

fun pregunta3() {
    val user1a = User1("Carlos", "1234")
    val user1b = user1a
    user1b.name = "John"
    user1b.password = "4321"

    println("user1a -> My name is ${user1a.name} and my password is ${user1a.password}")
    println("user1b -> My name is ${user1b.name} and my password is ${user1b.password}")
}

fun pregunta4() {
    val user1a = User2("Carlos", "1234")
    val user1b = user1a.copy()
    user1b.name = "John"
    user1b.password = "4321"

    println("user1a -> My name is ${user1a.name} and my password is ${user1a.password}")
    println("user1b -> My name is ${user1b.name} and my password is ${user1b.password}")
}
