package chapter9

// 코틀린 코드
class User {
    var name: String = ""
        get() = field.uppercase()
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }
        }
}

