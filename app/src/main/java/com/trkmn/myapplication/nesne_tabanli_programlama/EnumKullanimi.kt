package com.trkmn.myapplication.nesne_tabanli_programlama

fun main() {
    ucretHEsapla(KonserveBoyut.ORTA, 55)
}

fun ucretHEsapla(boyut: KonserveBoyut, adet : Int){
    when(boyut){
        KonserveBoyut.KUCUK -> println("Ücret : ${adet * 104} TL")
        KonserveBoyut.ORTA -> println("Ücret : ${adet * 207} TL")
        KonserveBoyut.BUYUK -> println("Ücret : ${adet * 309} TL")
    }
}