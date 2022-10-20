package com.example


class User1 {
    var name: String = ""
}

fun createUser(){

    val user = User1()
    user.name = "John"

    println(user.name)
}


// I should consider to avoid this in the most cases
class User3{
    lateinit var name: String
}

class User6 {
    val id: Int = 1
    val name: String = "Kotlin"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User6

        if (id != other.id) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int{
        return 31 * name.hashCode() + id
    }

    override fun toString(): String{
        return "User6(id=$id, name='$name')"
    }
}

data class User7(val id: Int, val name: String)


class SecondOne {

    val calc: (Int, Int) -> Int = { a, b -> a + b }

    fun printCalcResult(num1: Int, num2: Int, calc: (Int, Int) -> Int) {
        val result = calc(num1, num2)
        println(result)
    }

    fun printOddOrEvenNumberText(num: Int) {
        var text = ""
        if (num % 2 == 0) {
            text = "Even"
        } else {
            text = "Odd"
        }

        println(text)
    }


    // Alternative and smart kotlin way
    fun printOddOrEvenNumberText2(num: Int) {
        val text = if (num % 2 == 1) "odd" else "even"
    }

    fun printOddOrEvenNumberText3(num: Int): String {
        return if (num % 2 == 1) "odd" else "even"
    }

    // 2.1.7

    fun printNumText(num: Int) {
        val text = when (num) {
            100 -> {
                "Input is 100"
            }

            200 -> {
                "Input is 200"
            }

            else -> {
                "Input is not 100 or 200"
            }
        }
    }

}


