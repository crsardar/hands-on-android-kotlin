package com.crsardar.kotlin_basic

fun main() {
    var name: String? = "Anjana"
    name = null;

    if(name == null){
        println("Name is null")
    }

    var len = name?.length;
    println("Length = $len")

    len = name?.length.let { 100 };
    println("Length = $len")

    len = name?.length ?: 10;
    println("Length = $len")

    name = "Shiva"
    len = name?.length ?: 10;
    println("Length = $len")
}