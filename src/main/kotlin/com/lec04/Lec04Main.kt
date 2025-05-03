package com.lec04

import com.lannstark.lec04.JavaMoney

fun main() {

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    // 비교 연산자 사용 시 compareTo를 자동으로 호출 되어짐
    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다")
    }

    // 동등성(==) (정체성), 동일성(.equals) (주소값)
    // 코틀린에서는 == (값비교, 동등성), ===(참조 비교, 동일성)을 사용
    val money1e = JavaMoney(1_000L)
    val money2e = money1e
    val money3e = JavaMoney(1_000L)

    println(money1e === money2e)
    println(money1e == money3e)

    // 자바와 같은 Lazy 연산 사용
    if (fun1() || fun2()) {
        println("finish")
    }

    // in은 컬렉션 범위에 포함되어 있는 지
    val c : List<Int> = listOf(1, 2, 3)
    if (1 in c) {
        println("1")
    }

    // 연산자 오버로딩
    val money1K = Money(1_000L)
    val money2K = Money(2_000L)
    println(money1K + money2K)
}

fun fun1() : Boolean {
    println("fun1")
    return true
}

fun fun2() : Boolean {
    println("fun2")
    return false
}