package com.lec05

fun validateScoreIsNotNegative(score: Int) {
    // 포함 되어 있는 지
    if (score !in 0..100) {
        throw IllegalArgumentException("score의 범위가 0부터 100 사이입니다.")
    }
}

// if-else
fun getPassOrFail(score: Int) : String {
    // Kotlin에서는 expression 이다.
    // 그 대신 삼항 연산자가 없다.
    return if (score >= 50) {
        "P";
    } else {
        "F";
    }
}

fun getGrade(score: Int) : String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

// switch 와 when
fun getGradeWithSwitch(score: Int) : String {
//    return when (score / 10) {
//        90-> "A"
//        80 -> "B"
//        70 -> "C"
//        else -> "D"
//    }

    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다")
        else -> println("1, 0, -1이 아닙니다")
    }
}

// early return 가능
fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어지는 숫자는 홀수 입니다")
    }
}