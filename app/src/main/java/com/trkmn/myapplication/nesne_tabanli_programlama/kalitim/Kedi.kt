package com.trkmn.myapplication.nesne_tabanli_programlama.kalitim

class Kedi : Memeli() {
    override fun sesCikar() {
        //super.sesCikar() -> super : kalıtım ile üst sınıfı(Memeli) temsil eder
        println("Miyav Miyav")
    }
}