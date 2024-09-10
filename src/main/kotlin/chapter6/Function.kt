package chapter6

fun formatPersonDisplay(
    name: String? = null,
    surname: String? = null,
    age: Int? = null
): String {
    // 값이 없을 경우 null 이 "" 로 변경됨
    var result = ""
    if(name != null) result += name
    if(surname != null) result += " $surname"
    if(age != null) result += " ($age)"

    return result.trim()
}

fun main() {
    println(formatPersonDisplay("John", age = 30)) // John Doe (30)
    println(formatPersonDisplay("John", "Doe")) // John Doe (null)
    println(formatPersonDisplay("John")) // John null (null)
    println(formatPersonDisplay()) // null null (null)
}