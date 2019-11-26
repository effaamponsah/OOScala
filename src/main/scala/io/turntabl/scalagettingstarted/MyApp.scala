package io.turntabl.scalagettingstarted

import io.turntabl.manager.TurntablManager
import io.turntabl.TurntablEmployee
import io.turntabl.students.TLCStudent

object MyApp extends App {
    val student = new TLCStudent("Dennis", "Effa",2018)

    val student2 = new TLCStudent("Christy", "Asare", 2018)

    student.TopGrade("Intro to Data Science", "F")
    student2.TopGrade("Scala", "A")
    println(student.TOS)
    println(student sameYear student2)

    def printLoad(turntablEmployee: TurntablEmployee) = print(turntablEmployee.GetWorkload)

    printLoad(student)


}
