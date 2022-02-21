package com.crsardar.kotlin_basic

fun main() {

    val months = ArrayList<String>()
    addMonths(months);

    for(month in months){
        println(month)
    }

    val years = mutableListOf<String>("2019", "2020", "2021")

}

fun addMonths(input: ArrayList<String>){

    input.add("January")
    input.add("February")
    input.add("March")
}