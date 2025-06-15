package com.lec14

fun main() {
    val dto1 = PersonDto("jamey", 100)
    val dto2 = PersonDto("jamey", 200)
    println(dto1)

}

fun handleCountry(country: Country) {
    when(country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

// equals, toString, hashCode를 자동으로 붙여줌
// named parameter까지 있다고 생각하면 사실 build까지 있는 거임
data class PersonDto(
    val name: String,
    val age: Int
)

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US")
    ;

}

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("Avante", 0)