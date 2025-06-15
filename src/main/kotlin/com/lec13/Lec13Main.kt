package com.lec13

fun main() {
}

class JavaHouse(
    private val address: String,
    private val livingRoom: LivingRoom
) {

    inner class LivingRoom(
        private var area: Double
    ) {
        val address: String
            get() = this@LivingRoom.address
    }

}