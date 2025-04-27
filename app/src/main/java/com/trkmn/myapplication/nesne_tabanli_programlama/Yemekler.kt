package com.trkmn.myapplication.nesne_tabanli_programlama

data class Yemekler (var id: Int, var ad: String, var fiyat: Int){

    //Constructor - init fonksiyonu
    //Bu sınıftan nesne oluştuğunda çalışsın
    init {
        println("****Nesne oluştu*****")
    }

    fun bilgiAl(){
        println("---------------")
        println("id: ${id}")
        println("ad: ${ad}")
        println("fiyat: ${fiyat}")
    }

    //this : bulunduğu sınıfı temsil eder. this.id yazılabilir. swift dilinde self
    //super : kalıtım ile bir üst sınıfı temsil eder.

}