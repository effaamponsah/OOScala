package io.turntabl.scalagettingstarted

import io.turntabl.students.TLCStudent

object MyApp extends App {
    val student = new TLCStudent("Dennis", "Effa",2018)

    val student2 = new TLCStudent("Christy", "Asare", 2018)

    println(student.TOS)
    println(student sameYear student2)


}
