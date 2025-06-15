package com.lec10.abstarct

abstract class Animal(
    protected val species: String,
    // override에서 get이 꼭 필요함
    protected open val legCount: Int
) {

    abstract fun move()

}