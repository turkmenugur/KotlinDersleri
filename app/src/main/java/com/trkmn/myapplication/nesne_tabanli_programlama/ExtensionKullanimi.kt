package com.trkmn.myapplication.nesne_tabanli_programlama

//fun main() {
//    val sonuc = 5.carp(2)
//    println(sonuc)
//}
//
//fun Int.carp(sayi: Int) : Int{
//    return this * sayi //integer classını temsil ediyor
//}

fun main() {
    val sonuc = 5 carp 2
    println(sonuc)
}

infix fun Int.carp(sayi: Int) : Int{
    return this * sayi //integer classını temsil ediyor
}