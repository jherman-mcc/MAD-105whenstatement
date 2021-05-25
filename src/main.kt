fun main(args: Array<String>) {
    var input1 = 0
    var otherLang = "x"
    input1 = readLine()!!.toInt()
    when (input1){
        1 -> otherLang = "ichi"
        2 -> otherLang = "ni"
        3 -> otherLang = "san"
        4 -> otherLang = "shi"
        5 -> otherLang = "go"
        6 -> otherLang = "roku"
        7 -> otherLang = "shichi"
        8 -> otherLang = "hachi"
        9 -> otherLang = "kyuu"
        10 -> otherLang = "juu"
        !in 1..10 -> otherLang = "Out of range"
        else -> otherLang = "Unknown"
    }
    println("The number $input1 in Japanese")
    print("is $otherLang")
}