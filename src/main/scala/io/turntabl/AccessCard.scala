package io.turntabl

trait AccessCard {
  val ID:Int
  abstract def gainAccess(day:String)
}
