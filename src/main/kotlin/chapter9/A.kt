package chapter9

//class A // 가장 기본적인 클래스 모양

class A {
    fun println() {
        println(this)
    }
}

fun main() {
    val a = A()
    println(a) // chapter9.A@3b07d329
    a.println() // chapter9.A@3b07d329 동일하다.
}