package com.crsardar.kotlin_basic.classes

class NoDefaultConstructor {

    var name: String? = null
    var ssn: String? = null

    init {
        println("NoDefaultConstructor : init()")
    }

    constructor(name: String, ssn: String){
        println("NoDefaultConstructor : constructor()")
        this.name = name
        this.ssn = ssn
    }

    override fun toString(): String {
        return "NoDefaultConstructor(name=$name, ssn=$ssn)"
    }
}