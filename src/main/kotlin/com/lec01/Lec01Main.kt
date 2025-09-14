package com.lec01

import com.lannstark.lec01.Person

fun main() {
    // 변수 처리는 var(or val) 변수명 : 타입 으로 만든다
    // 불변이라면 val을 붙인다
    var number1 : Long = 0;
    val number2 : Long = 0;

    var number3 : Long = 0;
    // 인스턴스화할 때 new를 붙이지 않아도 된다
    var person : Person = Person("jamey")

    // val이 처음 초기화할 때까지 봐준다
    var number4 : Long
    number4 = 1;
    val number5 : Long
    number5 = 1;

    // null 값을 넣기 위해서는 타입 뒤에 ?를 붙여야한다
    var number6 : Long?
    number6 = null;

    // 출력할 때 System.out을 붙일 필요는 없다
    println(number6)
}