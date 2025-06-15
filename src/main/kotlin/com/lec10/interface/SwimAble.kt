package com.lec10.`interface`

interface SwimAble {

    val swimAbility: Int
        get() = 3

    fun act() {
        println(swimAbility)
        println("어푸 어푸")
    }

}