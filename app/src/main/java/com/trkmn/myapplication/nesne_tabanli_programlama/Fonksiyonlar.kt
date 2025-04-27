package com.trkmn.myapplication.nesne_tabanli_programlama

class Fonksiyonlar {
    // void - sadece işlem yapan
    fun selamla1(){ //swift -> func
        var sonuc = "Merhaba ugur"
        println(sonuc)
    }

    //return - hem işlem yapan hem veri transferi yapan
    fun selamla2() : String{
        val sonuc = "Merhaba ugur"
        return sonuc
    }


    //parametre
    fun selamla3(isim:String){
        var sonuc = "Merhaba $isim"
        println(sonuc)
    }

    //overloading - bir sınıf içerisinde aynı isimde fonkisyonları tekrar kullanmak
    fun topla(sayi1: Int, sayi2: Int){
        println("Toplama: ${sayi1 + sayi2}")
    }

    fun topla(sayi1: Double, sayi2: Double){
        println("Toplama: ${sayi1 + sayi2}")
    }

    fun topla(sayi1: Double, sayi2: Double, isim :String){
        println("Toplama: ${sayi1 + sayi2} - İşlem yapan: ${isim}")
    }

}