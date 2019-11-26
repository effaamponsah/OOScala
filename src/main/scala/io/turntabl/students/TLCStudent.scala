package io.turntabl.students
import io.turntabl.TurntablEmployee
import io.turntabl.grades.Grades
  class TLCStudent(val fName:String,val secondName: String, val entranceYr: Int, github:String="github.com/turntabl") extends TurntablEmployee{
    val  ID:String="";
    val desc: String ="";
    override def toString = s"New student $fName $secondName added in $entranceYr"

    override val GetWorkload: String = "Works super hard"

    def sameYear(s: TLCStudent) = entranceYr ==  s.entranceYr

    def TOS()=if (entranceYr < 2019)2019 - entranceYr else "Cant compute"

    def TopGrade(subject:String, grade:String) = Grades(subject, grade)

    }
    object TLCStudent {
      def apply(fName: String, secondName: String, entranceYr: Int, github: String): TLCStudent = new TLCStudent(fName, secondName, entranceYr, github)
    }
