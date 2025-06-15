package com.lec09

fun main() {
    val person = Person("jamey", 100)
    println(person.name)

    person.age = 10
    println(person.age)

    val person2 = Person("jamey")
    println(person2.name)

    Person()
}

// 생성자 제거 가능
// kotlin 은 getter 와 setter 는 자동으로 만들어줌.
// primary constructor (반드시 존재해야함) (없다면 기본 생성자를 만들어줌)
class Person(
    name: String,
    var age: Int
) {

    // val name은 getter가 이미 들어가 있기 때문
    // name 대신 field를 넣어서 무한 루프를 막는다
//    val name = name
//        get() = field.uppercase()

//    val upperCaseName: String
//        get() = this.name.uppercase()

    // setter 자체를 사용하는 것을 지양하기 때문에 잘 쓰지 않음
    var name = name
        set(value) {
            field = value.uppercase()
        }

    // 초기화 되는 시점에 한번 불러오는 것
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    // 두번 째 생성자 부터는 안에 constructor로 만들어주어야함.
    // secondary constructor
    // 최종적으로 주생성자를 호출해야함. (중간에 부생성자를 호출해도 됨)
    // body를 가질 수 있음
    // 역순 (여기서는 init-> first -> second) (default parameter를 사용하는 경우가 많음)
    // 거의 쓰지 않음
    constructor(name: String): this(name, 1) {
        println("first second constructor")
    }

    constructor(): this("홍길동") {
        println("second second constructor")
    }

    // custom getter
    // 객체의 속성이라면 커스텀 객체, 그렇지 않다면 함수
    val isAdult: Boolean
        get() = this.age >= 20
}