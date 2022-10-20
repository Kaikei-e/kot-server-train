package Sec1

class Train {
    fun printOddOrEvenNumberText(num: Int ){
        var text = ""
        if (num % 2 == 0) {
            text = "Even"
        } else {
            text = "Odd"
        }

        println(text)
    }


    // Alternative and smart kotlin way
    fun printOddOrEvenNumberText2(num: Int ){
        val text = if (num %2 == 1) "odd" else "even"
    }

}