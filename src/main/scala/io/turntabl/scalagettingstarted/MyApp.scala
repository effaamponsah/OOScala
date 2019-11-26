package io.turntabl.scalagettingstarted


object MyApp extends App {
    val myself = ("Dennis", "python")
    val name, favLang = myself


    val countries = Map("Britian" -> "London",
        "Ghana" -> "Accra",
        "Togo" -> "Lome") + ("Ethiopia"->"Addis Ababa", "Egypt"->"Cairo")

    print(countries)
    countries.getOrElse("Norway", "unknown")

    val friends = Set("James", "John", "Hannah")+("Samuel","Samuel")

    println(friends.count(_ == "Samuel"))

    val names =List("Christiana","Francis","Bill")
    names foreach(print)

    names filter(name => name.length > 6) foreach(print)

    print(names count(_.length > 6))


}