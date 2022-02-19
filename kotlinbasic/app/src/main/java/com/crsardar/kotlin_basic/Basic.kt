// Simple Kotlin File, NOT a Class
package com.crsardar.kotlin_basic

fun main() {

    // ";" semicolon is optional in Kotlin

//    diffVarAndVal()
//    dataType()
    stringInterpolation()
}

fun diffVarAndVal() {

    var name = "Chitta"
    name = "Rama";
    print("Hi " + name + "!")

    // Immutable variable
    val country = "India"
    //country = "USA"   not allowed, "val is FINAL"
    println("Hi " + country + "!") // NO new line
}

fun dataType() {

    // Numbers

    // var number1: int = 10; Error - NO primitive types in Kotlin
    var number1: Int = 10
    var number2: Int = 1000000000
    println("Number2 = $number2")

    var number3: Int = 99_000
    println("Number3 = $number3")

    var byte: Byte = 127
    var short: Short = 32_767
    var int: Int = 2_147_483_647
    var long: Long = 9_223_372_036_854_775_807

    // DEFAULT is Int
    var default = 10 // Type Inference : Find out the type from the context

    // Allowed
    var myVar: Int
    // NOT allowed
    // var myVarTwo
    // Allowed
    var myVarThree = 5

    // NOT allowed, because compiler assumed to be a Double
    //var float: Float = 13.33
    // Allowed
    var float1: Float = 13.33f
    var float2: Float = 13.33F
    var float3 = 13.33F

    var double: Double = 13.33

    var bool1 = true;
    var bool2: Boolean = true
    bool1 = false

    // Characters
    var char1 = 'A'
    // NOT allowed
    //var char2 = 'AB'
    var char3: Char = 'C'

    // String
    var string1 = "Chittaranjan"
    var string2: String = "Sardar"

    var firstCharOfString1 = string1[0]
    println("firstCharOfString1 = $firstCharOfString1")

    var lastCharOfString1 = string1[string1.length - 1]
    println("lastCharOfString1 = $lastCharOfString1")
}

fun stringInterpolation() {

    var name = "Chittaranjan"
    println("Name = " + name)

    var lord: String = "Shiva"
    println("Lord = $lord")

    println("1. Name = $name and length of name is $name.length")
    println("2. Name = $name and length of name is ${name.length}")
}
