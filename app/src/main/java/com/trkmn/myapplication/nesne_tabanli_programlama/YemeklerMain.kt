package com.trkmn.myapplication.nesne_tabanli_programlama

fun main() {
    //Nesne oluşturma
    val y1 = Yemekler(1, "Köfte", 249)

    //Değer okuma
    y1.bilgiAl()

    //Değer atama / değiştirme
    y1.fiyat = 350
    y1.bilgiAl()

    val y2 = Yemekler(2, "Baklava", 300)
    y2.bilgiAl()

    y2.ad = "Soğuk Baklava"
    y2.bilgiAl()
}