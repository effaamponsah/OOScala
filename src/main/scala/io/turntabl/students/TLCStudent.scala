package io.turntabl.students

  class TLCStudent(val fName:String,val secondName: String, val entranceYr: Int, github:String="github.com/turntabl"){
    val  ID:String="";
    val desc: String ="";
    override def toString = s"New student $fName $secondName added in $entranceYr"

    def sameYear(s: TLCStudent) = entranceYr ==  s.entranceYr

    def TOS()=if (entranceYr < 2019)2019 - entranceYr else "Cant compute"

    }
    object TLCStudent {
      def apply(fName: String, secondName: String, entranceYr: Int, github: String): TLCStudent = new TLCStudent(fName, secondName, entranceYr, github)
    }
