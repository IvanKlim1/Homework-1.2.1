package ru.netology

import kotlin.random.Random.Default.nextInt

fun main() {
    val amount = nextInt(1 ,150000 ) * 100
    val commission = amount*0.75
if (commission <35*100) {
    println("Операция невозможна")
} else {
    println("Total commission: $commission ")
}
}