package com.lec08

fun main() {
    repeat("Hello World")

    // named argument
    // builder를 만들지 않고 builder의 장점을 가지게 됨.
    // kotlin에서 자바의 함수를 가져다 쓸 때는 namedArgument를 쓸 수 없음 (바이트 코드로 할 때 이름을 보존하고 있지 않기 때문)
    repeat("Hello World", useNewLine = false)

    printNameAndGender(name = "jamey", gender = "MALE")

    printAll("A", "B")

    // 스프레드 연산자를 넣어주어야함(*)
    val array = arrayOf("A","B","C")
    printAll(*array)
}

// expression 이기 때문에 가능
fun max(a: Int, b: Int) = if (a > b) a else b

// default parameter
// 기본 값을 넣어주기 가능 (자바에서는 오버로딩으로)
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println("name : $name, gender : $gender")
}

// 가변 인자
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}