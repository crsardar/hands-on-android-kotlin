package com.crsardar.kotlin_basic

fun main() {
    myFunction()
    println("Addition = ${addUp(3, 4)}")
}

fun myFunction() {
    println("In myFunction")
}

fun addUp(a: Int, b: Int): Int {
    return a + b
}