package io.turntabl.manager

import io.turntabl.TurntablEmployee

class TurntablManager extends TurntablEmployee {
  override val GetWorkload: String = "Works hard"

  override def TOS(entranceYr: Int): Any = 100
}
