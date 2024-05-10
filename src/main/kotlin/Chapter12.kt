package org.example

fun main(args: Array<String>) {

    val x = 2

    when(x) {
        1     -> print("ワン")
        2     -> println("ツー")
        3     -> println("スリー")
        else -> println("ワン、ツー、スリー以外の数字です")
    }
}