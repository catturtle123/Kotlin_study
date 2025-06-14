package com.lec06


fun main() {

    // for-each
    val numbers = listOf(1L,2L,3L)
    for (number in numbers) { // iterable 이 구현 된 것이라면 무조건 가능
        println(number)
    }

    // for
    // .. 연산자 : 범위를 만들어내는 연산자
    // 등차 수열을 만들어주는 코드
    // downTo와 step 둘다 함수 이다.
    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }

    // while
    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }

}