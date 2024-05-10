package org.example

fun main(args: Array<String>) {
    val num = 100
    val a: Boolean = (num==100)
    val b: Boolean = (num==125)
    println("変数 a の値は　${a} です。")
    println("変数 b の値は　${b}　です。")


    val num1 = 5
    val num2 = 10
    val a1 = (num1<num2)
    val b1 = (num1>num2)

    println("num1がnum2より小さい:$a1")
    println("num1がnum2より小さい:$b1")


    val num3 = 50
    val num4 = 100
    val a2 = (num3!=100)
    val b2 = (num4!=100)
    println("num３は　100ではない")
    println("num4は 100ではない")

}