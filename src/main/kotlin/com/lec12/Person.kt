package com.lec12

import com.lannstark.lec12.Movable

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    moveSomething(object : Movable {
        override fun move() {
            println("무브")
        }

        override fun fly() {
            println("날다")
        }

    })
}

class Person(
    var name: String,
    var age: Int
) {

    companion object {
        private const val MIN_AGE = 0

//        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }

}

object Singleton {
    var a: Int = 0
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}