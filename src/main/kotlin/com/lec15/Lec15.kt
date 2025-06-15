package com.lec15

import java.util.Collections

fun main() {

    // 배열
    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println(array[i])
    }

    for ((index, value) in array.withIndex()) {
        println("$index: $value")
    }

    for (i in array) {
        println(i)
    }

    array.plus(300)

    // Collection
    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()
    printNumbers(emptyList())

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("$idx: $value")
    }

    // 기본적으로 ArrayList 임
    val numbers2 = mutableListOf(100, 200)

    // set (LinkedHashSet)
    mutableSetOf(100, 200)

    // map (LinkedHashMap)
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY", 3 to "WEDNESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println("$key: $value")
    }
}

// 추론 가능하면 생략 가능함
private fun printNumbers(numbers: List<Int>) {

}