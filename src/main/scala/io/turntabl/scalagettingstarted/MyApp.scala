package io.turntabl.scalagettingstarted
import io.turntabl.Book

object MyApp extends App {

    val books = List(
        Book("James","Hammer in the head",2019,"Fiction"),
        Book("Kwame","Hello from other side",2018,"Drama"),
        Book("Akosua","Ananse",1957,"Fiction"),
        Book("Theon","Okay Google",2017,"Adventure"),
        Book("Christy","Thanks",2019,"Thriller"),
        Book("Bill","Decoding Bill Gates",2015,"Fiction")
    )

    val publish=(year:Int, listBooks:List[Book]) => listBooks filter(book => book.publishedYr == year) foreach(print)

    publish(2019, books)
}