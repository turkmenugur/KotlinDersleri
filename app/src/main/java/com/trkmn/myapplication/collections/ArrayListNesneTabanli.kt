package com.trkmn.myapplication.collections

fun main() {
    val f1 = Filmler(1, "Babam ve Oğlum", 50)
    val f2 = Filmler(2, "Neşeli Hayatlar", 30)
    val f3 = Filmler(3, "Kış Uykusu", 80)

    val filmlerlistesi = ArrayList<Filmler>()
    filmlerlistesi.add(f1)
    filmlerlistesi.add(f2)
    filmlerlistesi.add(f3)

    for (film in filmlerlistesi){
        println("${film.id} : ${film.ad} ${film.fiyat}₺")
    }

    //Sıralama - Sorting

    //Ascend -ASC
    println("----- Fiyata Göre Artan -----")
    val siralama1 = filmlerlistesi.sortedWith(compareBy { it.fiyat })
    for (film in siralama1){
        println("${film.id} : ${film.ad} ${film.fiyat}₺")
    }

    //DESC
    println("----- Fiyata Göre Azalan -----")
    val siralama2 = filmlerlistesi.sortedWith(compareByDescending { it.fiyat })
    for (film in siralama2){
        println("${film.id} : ${film.ad} ${film.fiyat}₺")
    }

    //Ascend -ASC
    println("----- Artan Sıralama-----")
    val siralama3 = filmlerlistesi.sortedWith(compareBy { it.ad })
    for (film in siralama3){
        println("${film.id} : ${film.ad} ${film.fiyat}₺")
    }

    //Filtreleme
    println("----- Filtreleme 1 -----")
    val filtreleme1 = filmlerlistesi.filter { it.fiyat > 40 && it.fiyat < 60 }
    for (film in filtreleme1){
        println("${film.id} : ${film.ad} ${film.fiyat}₺")
    }

    println("----- Filtreleme 2 -----")
    val filtreleme2 = filmlerlistesi.filter { it.ad.contains("at") }
    for (film in filtreleme2){
        println("${film.id} : ${film.ad} ${film.fiyat}₺")
    }
}