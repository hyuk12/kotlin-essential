package chapter3

fun main() {
    val a: Int = 10
    var b: String = "ABC"
    println(a) // 10
    println(b) // ABC
    // a = 12 <- a는 val 로 초기화 되어 읽을 수만 있기에 "Val cannot ressigned" 오류 발생
    b = "CDE" // 값을 재할당 가능
    println(b) // CDE

}

