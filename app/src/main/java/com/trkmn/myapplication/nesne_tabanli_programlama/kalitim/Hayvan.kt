package com.trkmn.myapplication.nesne_tabanli_programlama.kalitim

//Özellik aktaracak sınıfların başına open keywordü yazılır
open class Hayvan {
    //başına open keywordünü ekelyerek bu sınıfı alt sınıflardan kullanılabilir hale getiriyoruz
    open fun sesCikar(){
        println("Ses Çıkar")
    }
}