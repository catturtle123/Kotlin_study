package com.lec02

import com.lannstark.lec02.Person

fun main() {
    val person = Person(null)

    // 자바의 코드를 kotlin에서 쓸때는 어노테이션을 이해 가능함
    // 어노테이션이 없다면 알 수 없음 -> 런타임에서 에러가 남 (플랫폼 타입)
    // 자바 코드를 사용할 때는 null 관련 것을 잘 사용해야함. 라이브러리를 단일 지점으로 만들거나 라이브러리에서 null을 잘 알고 있어야함
    startsWithPerson(person.name)

    val str: String? = null

    // null 일 가능성이 있을 시에는 safe call을 사용해야 함
    println(str?.length ?: 0)

    println(starsWith(null))
}

fun startsWithPerson(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA1(str: String?) : Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }
    return str.startsWith("A")
}

fun startsWithA1WithSafeCallAndEvil(str: String?) : Boolean {
    // null이 아닐 경우 safe call 호출, null 이라면 Elvis 연산자 사용
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?) : Boolean? {
    if (str == null) {
        return null;
    }
    return str.startsWith("A")
}

fun startsWithA2WithSafeCallAndEvil(str: String?) : Boolean? {
    // safe call의 경우 앞이 null이면 null이 되기때문
    return str?.startsWith("A")
}

fun startsWithA3(str: String?) : Boolean {
    if (str == null) {
        return false;
    }
    // ?가 있을 시 바로 함수 호출은 막아 놓음
    return str.startsWith("A")
}

fun startsWithA3WithSafeCallAndEvil(str: String?) : Boolean {
    return str?.startsWith("A") ?: false
}

// 혹시나 null이라면 런타임에서 NPE가 남 (!!는 null이 확실히 아닐 때 사용하는 것)
fun starsWith(str: String?) : Boolean {
    return str!!.startsWith("A")
}