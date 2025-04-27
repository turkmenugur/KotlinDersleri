package com.trkmn.myapplication.nesne_tabanli_programlama

fun main() {
    val f = Fonksiyonlar()

    //void = Unit
    f.selamla1()

    val gelenSonuc = f.selamla2()
    println(gelenSonuc)


    //parametre
    f.selamla3("türkmen")

    f.topla(10.0,10.0,"uğur")
}