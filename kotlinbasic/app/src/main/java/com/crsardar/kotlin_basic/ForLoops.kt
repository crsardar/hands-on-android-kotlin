package com.crsardar.kotlin_basic

fun main(){

    for(i in 1..10){
        print("$i ")
    }

    print("   ")

    for(i in 1 until 11){
        print("$i ")
    }

    print("   ")

    for(i in 10 downTo  1){
        print("$i ")
    }

    print("   ")

    for(i in 11 downTo  1 step 2){
        print("$i ")
    }
    print("   ")

    for(i in 11.downTo(1).step(2)){
        print("$i ")
    }

    print("   ")

    for(i in 1 until 11 step 2){
        print("$i ")
    }

    print("   ")

    for(i in 10.until(1).step(2)){
        print("$i ")
    }
}