package com.trkmn.myapplication.standart_programlama

fun main() {
    for (i in 1..3){ // swift -> 1...3     i = index(dizilerdeki index numarası)
        println("Döngü 1: $i")
    }


    for (x in 10..20 step 5){ // step -> infix fonksiyon
        println("Döngü 2: $x")
    }

    // 20 ile 10 arasında 5er azalsın
    for (x in 20 downTo 10 step 5){ // downTo -> geriye doğru
        println("Döngü 3: $x")
    }


    //1,2,3
    //While
    var sayac = 1

    while (sayac < 4){
        println("Dongü 4: $sayac")
        sayac++
    }

    //1,2,3,4,5
    for (i in 1..5){
        if (i == 3){
            break // döngüyü durdurur
        }
        println("Döngü 5: $i")
    }

    //1,2,3,4,5
    for (i in 1..5){
        if (i == 3){
            continue //bulunduğu adımı pas geçer
        }
        println("Döngü 6: $i")
    }
}