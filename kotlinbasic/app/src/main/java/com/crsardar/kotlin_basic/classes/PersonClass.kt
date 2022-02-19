package com.crsardar.kotlin_basic.classes

class PersonClass(name: String = "Shiva", city: String = "Kailash") {

    val name: String = name
    var city: String
    var age: Float? = null
    lateinit var laterOn: String

    init {
        this.city = city
        println("\nPersonClass: init(): Name = $name, City = $city")
    }

    // init() will be called before this constructor
    constructor(name: String, city: String, age: Float) : this(name, city) {
        this.age = age
        println("In constructor()")
    }

    override fun toString(): String {
        return "PersonClass(name=$name, city=$city, age=$age)"
    }
}