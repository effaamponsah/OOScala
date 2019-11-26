package io.turntabl.scalagettingstarted


object MyApp extends App {
    val returnLength=(word:String) => word.length

    val returnSpaces = (sentence:String) => sentence.split(" ").length - 1

    val  ApplyToString=(word: String, func:(String =>Int)) => func(word)

    println(ApplyToString("Dennis",returnLength))

    println(ApplyToString(" Dennis Effa Amponsah", returnSpaces))


    val calculate=(operation:String) => ((param1:Int, param2:Int) => operation match {
        case "add" => param1 + param2
        case "subtract" => param1 - param2
        case "mult" => param1 * param2
        case _=> "Operation not found"
    })

    val addTwoInts = calculate("add")
    println(addTwoInts(1,5))

    val subTwoInts = calculate("subtract")
    println(subTwoInts(5,3))

    val invalidOp=calculate("testing")
    println(invalidOp(9,4))

}
