package com.alex.guess

import java.util.*

class SecretNumber {
//    var 會變動的亂數
    var secret: Int = Random().nextInt(10)+1   //產生 1~10的亂數
    var count = 0    //自動推斷等號右邊的值為Int

    fun validate(number: Int): Int {
        return number - secret
    }
}


fun main() {
    val secretNumber = SecretNumber()
    println(secretNumber.secret)
    println(secretNumber.validate(2))
    println("${secretNumber.validate(2)}, count: ${secretNumber.count}")
}