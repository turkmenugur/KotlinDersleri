package com.trkmn.myapplication.collections

fun main() {
    //Tanımlama
    val meyveler = ArrayList<String>()

    //veri ekleme : en sonuna ekleme yapar
    meyveler.add("Elma") //0.index
    meyveler.add("Muz") //1.
    meyveler.add("Kiraz") //2
    println(meyveler)

    //Güncelleme
    meyveler[1] = "Yeni Muz"
    println(meyveler)

    //Insert : istediğimiz bir indekse veri ekler
    meyveler.add(1,"Portakal")
    println(meyveler)

    //Okuma
    println(meyveler.get(3))
    println(meyveler[3])

    println("Boyut: ${meyveler.size}")

    meyveler.reverse()
    println(meyveler)

    //iterating
    for (meyve in meyveler){
        println("Sonuç: $meyve")
    }

    for ((indeks,meyve) in meyveler.withIndex()){ //Swift enumarated()
        println("$indeks. -> $meyve")
    }

    meyveler.removeAt(1)
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}