package io.turntabl.scalagettingstarted
import io.turntabl.Book

object MyApp extends App {

    val books = List(
        Book("James","Hammer in the head",2019,"Fiction"),
        Book("Kwame","Hello from other side",2018,"Drama"),
        Book("Akosua","Ananse",1957,"Fiction"),
        Book("Theon","Okay Google",2017,"Adventure"),
        Book("Christy","Thanks",2019,"Thriller"),
        Book("Bill","Decoding Bill Gates",2015,"Fiction"),
        Book("Steve","Human",1995,"Fiction"),
        Book("Hannah","Human brain",20112,"History"),
        Book("Nkrumah","Ananse",2010,"Fiction"),
        Book("Gates","Okay Google",2000,"Adventure"),
        Book("Jeff","Thanks",1880,"Thriller"),
        Book("Andrew","Decoding Bill Gates",1998,"Comedy")
    )

    val authorsWithMatch=(bookList: List[Book],category:String)=>  category match {
        case "History" => bookList filter(book => book.category == "History") map(book => book.authorSurnamme) foreach(print)
    }

   authorsWithMatch(books, "History")
}