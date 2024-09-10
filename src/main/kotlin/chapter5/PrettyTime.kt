package chapter5

fun secondsToPrettyTime(seconds: Int): String {
    if (seconds < 0) {
        return "Invalid Input"
    }

    val secondsInHour = 60 *  60
    val hours = seconds / secondsInHour
    val minutes = (seconds % secondsInHour) / 60
    val remainingSeconds = seconds % 60

    var result = ""
    if (hours > 0) {
        result += "$hours h"
    }
    if (minutes > 0) {
        result += " $minutes min"
    }
    if (remainingSeconds > 0) {
        result += " $remainingSeconds sec"
    }
    return result.trim()
}

fun main() {
    println(secondsToPrettyTime(3661)) // 1 h 1 min 1 sec
    println(secondsToPrettyTime(3600)) // 1 h
    println(secondsToPrettyTime(60)) // 1 min
    println(secondsToPrettyTime(0)) //
    println(secondsToPrettyTime(-1)) // Invalid Input
}