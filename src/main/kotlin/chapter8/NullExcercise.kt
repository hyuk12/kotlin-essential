package chapter8

data class EmailAddress(val email: String?)

data class User(
    val name: String?,
    val age: Int?,
    val email: EmailAddress,
)

fun processUserInformation(user: User?): String {
    if (user == null) {
        return "Missing user information"
    }
    val name = user.name ?: throw IllegalArgumentException()
    val age = user.age ?: 0
    val email = user.email.email ?: "Missing email"
    return "User: $name, Age: $age, Email: $email"
}

fun main() {
    println(processUserInformation(null))

    val user1 = User(
        name = "John",
        age = 30,
        email = EmailAddress("john@example.com")
    )
    println(processUserInformation(user1))
}