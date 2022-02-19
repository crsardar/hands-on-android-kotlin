package com.crsardar.kotlin_basic

fun main(){

    val season = 15;
    when(season){
        1 -> println("Season = $season")
        2 -> println("Season = $season")
        5 -> {
            println("Season = $season")
            println("Season = $season and many more to come? No")
        }
        3 -> println("Season = $season")
        4 -> println("Season = $season")
        else -> println("Season = $season is NOT valid.")
    }

    val month = 11;
    when(month){

        in 3..5 -> println("Month = $month, it is a Spring")
        in 6..8 -> println("Month = $month, it is a Summer")
        in 9..11 -> println("Month = $month, it is a Fall")
        12,1,3 -> println("Month = $month, it is a Winter")
    }

    val data: Any = 13.3
    when(data){
        is Int -> println("Data = $data, it is an Int")
        is Long -> println("Data = $data, it is a Long")
        is Float -> println("Data = $data, it is a Float")
        is Double -> println("Data = $data, it is a Double")
        is String -> println("Data = $data, it is a String")
    }
}