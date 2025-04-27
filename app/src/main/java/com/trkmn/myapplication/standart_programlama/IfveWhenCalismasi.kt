package com.trkmn.myapplication.standart_programlama

fun main() {
    var yas = 17
    if (yas >= 18){
        println("reşitsiniz")
    }else{
        println("reşit değilsiniz")
    }

    val ka = "admin"
    val s = 123456
    val sayi = 10

    if (ka == "admin" && s == 123456){ // && = And (ve) -> true && true ise true olur. Diğer durumlarda hep false olur
        println("hoş geldiniz")
    }else{
        println("hatalı giriş")
    }

    if (sayi == 9 || sayi == 10) { //|| or(veya) false || false ise false olur. Diğer durumlarda true olur
        println("sayi 9 veya 10")
    }else{
        println("sayi 9 veya 10 değildir")
    }


    //When - diğer dillerde switch
    val number = 1
    when(number){
        1-> println("Sayı 1dir")
        2-> println("sayı 2 dir")
        else -> println("tanımlayan sayı")
    }
}