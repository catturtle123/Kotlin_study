package com.lec07

// try catch finally
fun parseIntOrThrow(str: String): Int {
    try {
        // 기본 타입 간의 타입 변환은 to로 변환함
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }

}

fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e : NumberFormatException) {
        null
    }
}

