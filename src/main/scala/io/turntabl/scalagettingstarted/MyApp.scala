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
        Book("Hannah","Human brain",20112,"Drama"),
        Book("Nkrumah","Ananse",2010,"Fiction"),
        Book("Gates","Okay Google",2000,"Adventure"),
        Book("Jeff","Thanks",1880,"Thriller"),
        Book("Andrew","Decoding Bill Gates",1998,"Comedy")
    )

//    3
    val publish=(year:Int, listBooks:List[Book]) => listBooks filter(book => book.publishedYr == year) foreach(println)

//    publish(2019, books)
//    4
    val after99=(bookList:List[Book])=> bookList filter(book => book.publishedYr > 1999) map(book => book.title) foreach(println)
    after99(books)
}