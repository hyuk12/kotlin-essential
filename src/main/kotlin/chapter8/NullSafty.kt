package chapter8

fun check(str: String?) {
    println("The value: \"$str\"")
    println("The value or empty: \"${str.orEmpty()}\"")
    println("Is null or empty? " + str.isNullOrEmpty())
    println("Is null or blank? " + str.isNullOrBlank())
}

fun main() {
    check("ABC")
    check(null)
    check("")
    check("         ")
}