package com.lec10.abstarct

import com.lec10.`interface`.Flyable
import com.lec10.`interface`.SwimAble

class Penguin(
    species: String,
) : Animal(species, 2), SwimAble, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직인다")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
       super<SwimAble>.act()
       super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = super.swimAbility

}