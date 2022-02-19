package com.crsardar.kotlin_basic.classes

import java.lang.IllegalArgumentException

fun main() {

    var myTaigun: Car = Car("VW", "Taigun")
    myTaigun.maxSpeed = 360.00f
    println("My Taigun $myTaigun")

    var myQ3 = Car("BMW", "Q3")
    // myQ3.maxSpeed = -10.00f IllegalArgumentException: Max speed must be greater than 0(zero).
    //myQ3.brand = "Tata" //Compilation Error
    println("My Q3 $myQ3")

    //var notACar = Car("", "Astra") // IllegalArgumentException: The car must have a brand name
    var notACar = Car("Opal", "") // IllegalArgumentException: The car must have a model name
}

class Car(brand: String, model: String){

    val brand: String = brand

    var model: String
        get() = field
        // Making model setter to private
        // i.e. no one but the constructor can set the brand model
        private set


    var maxSpeed: Float = 250.00f
        get() = field

        set(value){
            if(value<0)
                throw IllegalArgumentException("Max speed must be greater than 0(zero).")
            else
                field = maxSpeed
        }

    var capacity: Int

    init {
        if(brand.isEmpty())
            throw IllegalArgumentException("The car must have a brand name")

        if(model.isEmpty())
            throw IllegalArgumentException("The car must have a model name")

        this.model = model
        capacity = 5
        println("")
    }

    override fun toString(): String {
        return "Car(brand='$brand', maxSpeed=$maxSpeed, capacity=$capacity)"
    }
}