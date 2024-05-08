package org.example

fun main(args: Array<String>) {
    val a: Char = 'え'
    val b: Char = 'び'
    val c: Char = 'し'
    val message: String = "こんにちは"
    println(a)
    println(b)
    println(c)
    println(message)

    val message1 : String = "こんにちは、\n世界!"
    println(message1)

    val world = "世界"
    val message2 = "こんにちは、$world"
    println(message2)

    val h: Int = 8
    val message3 = "日働いた時間は、${h}hours"
    val message4 = "このペースで働くと、${h*30}hours　の労働になります。"
    val message5 = "このペースで一年働くと、${h*365}hours　の労働になります。"

    println(message3)
    println(message4)
    println(message5)



    val message7 = """
        |こんにちは、世界！
        |私は　Kotlinに関して勉強しています。
        |Kotlinでは、とても完結なプログラミングを書くことができます。
        |皆さん、一緒に楽しくプログラミングをしましょう
        """.trimMargin()
    println(message7)
}