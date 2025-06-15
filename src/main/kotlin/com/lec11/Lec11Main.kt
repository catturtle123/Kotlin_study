package com.lec11

val NUM = 3

fun add(a: Int, b: Int): Int {
    return a + b
}

class Cat private constructor()

// getter와 setter의 범위를 정할 수 있음
class Car (
    internal val name: String,
    private var owner: String,
    _price: Int
) {

    var price = _price
        private set

}