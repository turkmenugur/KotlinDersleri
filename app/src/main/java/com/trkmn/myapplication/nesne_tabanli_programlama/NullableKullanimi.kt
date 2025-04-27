package com.trkmn.myapplication.nesne_tabanli_programlama

fun main() {
    //Nullable, Null Safety, Optional (swift dilindeki karşılığı)
    //Genellikle mobil uygulama geliştirme dillerinde yer almaktadır
    //null, NaN, nil

    //1. Tanımlama
    var mesaj : String? = null

    //mesaj = "Merhaba"

    //Kullanım senaryoları
    //Yöntem 1
    //Sorun yoksa çalışır, sorun varsa uygulama çökmez
    println("Yöntem 1: ${mesaj?.uppercase()}")

    //Yöntem 2
    //sorun yoksa çalışır, sorun varsa uygulama çöker
    //çok emin olduğunuz kodlarda kullanabilirsiniz
    //println("Yöntem 2: ${mesaj!!.uppercase()}")

    //Yöntem 3
    //null kontrol
    if (mesaj != null){
        println("Yöntem 3: ${mesaj.uppercase()}")
    }else{
        println("Değişkende null yer almaktadır.")
    }

    //null kontrolü
    mesaj?.let {
        println("Yöntem 3: ${mesaj.uppercase()}")
    }

}