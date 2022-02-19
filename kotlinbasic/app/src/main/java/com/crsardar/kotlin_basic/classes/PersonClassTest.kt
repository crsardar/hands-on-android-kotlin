package com.crsardar.kotlin_basic.classes

fun main() {

    var shiva: PersonClass = PersonClass("Shiva", "Kailash")
    println(shiva)

    var chitta: PersonClass = PersonClass("Chittaranjan", "Bangalore")
    println(chitta)

    var defaultPerson = PersonClass()
    println(defaultPerson)

    var omni = PersonClass("Omni", "Baroda", 17.0f)
    println(omni)
    // println(omni.laterOn) UninitializedPropertyAccessException


    var constTest1 = NoDefaultConstructor("Rudra", "1")
    println(constTest1)
}