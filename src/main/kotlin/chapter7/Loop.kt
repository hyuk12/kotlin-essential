package chapter7


fun calculateSumOfSquares(n: Int): Int = (1..n).sumOf { it * it }
fun calculateSumOfEven(n: Int): Int = (1..n).filter { it % 2 == 0 }.sum()
fun countDownByStep(
    start: Int,
    end: Int,
    step: Int,
): String = (start downTo end step step).joinToString()

fun main() {
    // calculateSumOfSquares를 사용한 예
    println(calculateSumOfSquares(0)) // 0
    println(calculateSumOfSquares(1)) // 1
    println(calculateSumOfSquares(2)) // 5 (1 + 4)
    println(calculateSumOfSquares(3)) // 14 (1 + 4 + 9)
    println(calculateSumOfSquares(4)) // 30 (1 + 4 + 9 + 16)

    // calculateSumOfEven을 사용한 예
    println(calculateSumOfEven(0)) // 0
    println(calculateSumOfEven(1)) // 0
    println(calculateSumOfEven(2)) // 2
    println(calculateSumOfEven(3)) // 2
    println(calculateSumOfEven(5)) // 6 (2 + 4)
    println(calculateSumOfEven(10))// 30 (2 + 4 + 6 + 8 + 10)
    println(calculateSumOfEven(12))// 42 (2 + 4 + 6 + 8 + 10 + 12)
    println(calculateSumOfEven(20))// 110(2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20)

    // countDownByStep을 사용한 예
    println(countDownByStep(1, 1, 1))    // 1
    println(countDownByStep(5, 1, 2))    // 5, 3, 1
    println(countDownByStep(10, 1, 3))   // 10, 7, 4, 1
    println(countDownByStep(15, 5, 5))   // 15, 10, 5
    println(countDownByStep(20, 2, 3))   // 20, 17, 14, 11, 8, 5, 2
    println(countDownByStep(10, 4, 3))   // 10, 7, 4
    println(countDownByStep(-1, -1, 1))  // -1
    println(countDownByStep(-5, -9, 2))  // -5, -7, -9

}