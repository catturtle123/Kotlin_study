package com.lec16

fun main() {
    val str : String = "ABC"
    println(str.lastChar())

    // inline 함수
    val a = 3
    3 add 4
}

fun String.lastChar(): Char {
    return this[length - 1]
}

infix fun Int.add(other: Int): Int {
    return this + other
}