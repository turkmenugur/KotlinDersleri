package com.trkmn.myapplication.nesne_tabanli_programlama

fun main() {
    val a = ClassA()

    //Standart nesne tabanlı erişim
    //println(a.x)
    //a.metod()

    //sanal nesne - virtual object - nameless(isimsiz) object
    //println(ClassA().x) //nesne
    //ClassA().metod() //nesne

    //static kullanımı
    println(ClassA.x)
    ClassA.metod()
}