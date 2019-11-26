package io.turntabl.manager

import io.turntabl.TurntablEmployee
import io.turntabl.AccessCard
class TurntablManager extends TurntablEmployee with AccessCard {
  override val GetWorkload: String = "Works hard"

  override def TOS(entranceYr: Int): Any = 100

  override val ID: Int = 123

  override def gainAccess(day: String): Unit = day match {
    case "Monday" => true
    case _ => false
  }
}
