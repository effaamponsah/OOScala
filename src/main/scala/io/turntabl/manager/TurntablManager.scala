package io.turntabl.manager

import io.turntabl.TurntablEmployee

class TurntablManager(val name:String) extends TurntablEmployee {
  override val GetWorkload: String = "Works hard"

//  override def TOS(entranceYr: Int): Any = 100
}

object TurntablManager {
  def apply(name: String): TurntablManager = new TurntablManager(name)

  def unapply(manager: TurntablManager) = Some(manager.name)
}