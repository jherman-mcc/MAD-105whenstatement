fun main(args: Array<String>) {
    var input1
    var OtherLang = "x"
    input1 = readLine()!! toInt ()
    When(Input1) {
    1 -> OtherLang = "The number $input1 in Japanese is ichi"
    2 -> OtherLang = "The number $input1 in Japanese is ni"
    3 -> OtherLang = "The number $input1 in Japanese is san"
    4 -> OtherLang = "The number $input1 in Japanese is shi"
    5 -> OtherLang = "The number $input1 in Japanese is go"
    6 -> OtherLang = "The number $input1 in Japanese is roku"
    7 -> OtherLang = "The number $input1 in Japanese is shichi"
    8 -> OtherLang = "The number $input1 in Japanese is hachi"
    9 -> OtherLang = "The number $input1 in Japanese is kyuu"
    10 -> OtherLang = "The number $input1 in Japanese is juu"
    !in 1..10 OtherLang "Out of range"
    Else -> OtherLang "Unknown"
    }
}