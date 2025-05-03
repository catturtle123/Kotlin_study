package com.lec03

import com.lannstark.lec03.Person

// 코틀린에서의 타입
fun main() {
//    val number1 = 3
//    val number2 = number1.toLong()

    val number1 : Int? = 3
    // null에 대해서는 적절한 처리가 필요함
    val number2: Long = number1?.toLong() ?: 0
    val number3 = number1!! / number2.toDouble()

    printAgeIfPerson(Person("",100))

    val person = Person("최태현", 100);
    val name = person.name

    println("이름 : $name")

    // 여러 줄 가능
    """
        ABCD
        EFGH
        ${name}
    """.trimIndent()

    // 배열 처럼 하면 문자 가져오기 가능
    val str = "ABC"
    println(str[0])
}

fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
    if (obj is Person) {
//        val person = obj as Person // 이미 했다면 상관 없음
        println(obj.age)
    }
}

// Any는 Object와 비슷
// Unit은 void와 비슷 / Unit은 그 자체로 타입 인자로 사용 가능하다 ex) 제네릭
// Nothing 함수가 정상적으로 끝내지 않는 다는 역할