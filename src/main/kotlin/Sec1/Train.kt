package Sec1

class Train {
    fun printOddOrEvenNumbberText(num: Int ){
        var text = ""
        if (num % 2 == 0) {
            text = "Even"
        } else {
            text = "Odd"
        }

        println(text)
    }



}