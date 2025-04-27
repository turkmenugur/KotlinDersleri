package com.trkmn.myapplication.odevler

//1 - Parametre olarak girilen kenar sayısına göre iç açılar toplamını hesapalyıp sonucu geri döndüren metod
fun icAciToplamiHesapla(kenarSayisi: Int) : Int {
    return (kenarSayisi - 2) * 180
}

//2 - Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod
fun maasHesapla(gunSayisi : Int) : Int {
    //1 günde 8 saat çalışılabilir, çalışma saat ücreti 10₺, mesai saat ücreti 20₺, 160 saat üzeri mesai sayılır
    val toplamSaat = gunSayisi * 8
    var mesaiUcreti = 0
    var normalSaatUcreti = 0
    var saateGoreMaas = 0
    if (toplamSaat > 160){
        mesaiUcreti = (toplamSaat - 160) * 20
        normalSaatUcreti = 160 * 10
        return normalSaatUcreti + mesaiUcreti
    }else{
        saateGoreMaas = toplamSaat * 10
        return saateGoreMaas
    }
}

//3 - Parametre olarak girilen kota miktarına göre ücreti hesaplayarark geri döndüren metodu yazın
fun kotaUcretiHesapla(kota: Int) : String{
    //50GB 100₺, Kota aşımından sonra her 1GB 4₺
    val temelUcret = 100
    if (kota<=50)
        return "$temelUcret₺"
    else{
        val kotaFarki = kota - 50
        val asimUCreti = kotaFarki * 4
        return "${temelUcret + asimUCreti}₺"

    }
}

//4 - Parametre olarak girilen dereceyi fahrenheit'a dönüştürdükten sonra geri döndüren bir metod yazınız
fun fahrenheitHesapla(derece : Double) : Double{
    // F = C * 1.8 + 32
    return (derece * 1.8) + 32
}

//5 - Kenarları parametre olarak girilen ve dikdörtgenin çevresini hesaplayan metod
fun dikdortgenCevreHesapla(kenar1: Double, kenar2: Double, kenar3: Double, kenar4: Double){
    println("${kenar1}, ${kenar2}, ${kenar3}, ${kenar4} kenar uzunluklarına sahip dikdörtgenin çevresi: ${kenar1 + kenar2 + kenar3 + kenar4} ")
}

//6 - Parametre olarak girilen sayının faktöriyel değerini hesaplayıp geri döndüren metod
fun faktoriyelHesapla(sayi : Int) : Int{
    var sonuc = 1

    if (sayi > 0){
        if (sayi>1){
            sonuc = sayi * faktoriyelHesapla(sayi - 1)
        }

        return sonuc
    }else {
        println("Negatif sayıların faktöriyelleri tanımlı değildir")
        return 0
    }

}

//7 - Parametre olarak girilen kelime içinde kaç adet a harfi olduğunu gösteren metod
fun aSayisiHesapla(kelime : String) {
    var aSayisi = 0
    for (harf in kelime){
        if (harf == 'a' || harf == 'A') aSayisi++
    }
    println("$kelime kelimesinde $aSayisi tane a harfi vardır.")
}

fun main() {
    //!
    println(icAciToplamiHesapla(4)) //360

    //2
    println(maasHesapla(100)) //14400
    println(maasHesapla(240)) //36800

    //3
    println(kotaUcretiHesapla(45)) //100₺
    println(kotaUcretiHesapla(54)) //116₺

    //4
    println(fahrenheitHesapla(10.0)) //50
    println(fahrenheitHesapla(20.3)) //68.54

    //5
    dikdortgenCevreHesapla(10.0,20.5,30.0,40.5) //101.0

    //6
    println(faktoriyelHesapla(5)) //120

    //7
    aSayisiHesapla("Uğur") //0
    aSayisiHesapla("Araba") //3
    aSayisiHesapla("yazılım") //1

}