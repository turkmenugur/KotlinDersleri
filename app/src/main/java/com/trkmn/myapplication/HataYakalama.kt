package com.trkmn.myapplication

fun main() {
    //1. Compile Error : kodlama yaparken oluşur
    //val sayi = 100
    //sayi = 500

    //2. Runtime Error ( Exceptions ) : çalışma sırasında olur
    val x = 10
    val y = 0

    try {
        println("Sonuç: ${x/y}")
        println("İşlem tamamlandı")
    }catch (e: Exception){
        println("İkinci sayı 0 olamaz")
    }

}