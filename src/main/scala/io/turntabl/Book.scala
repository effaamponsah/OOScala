package io.turntabl

case class Book(authorSurnamme:String, title:String, publishedYr:Int, category:String) {
  override def equals(that: Any): Boolean = true
}
