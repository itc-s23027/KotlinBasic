package org.example

fun main(args: Array<String>) {
    val a = 5
    val b = 10

    if (a < b) {
        println("aの方が、bよりも小さいです")
    } else if (a > b) {
        println("aの方がbよりも大きいです")
    } else {
        println("aとbの値は同じです。")

    }

    println("----11.9----")
    val age = 14
    if (age in 13..15) {
        println("中学生です")
    } else {
        println("中学生ではありません")
    }
}

