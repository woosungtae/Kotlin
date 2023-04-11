package com.example.test

class Patient(val name:String){
    fun doctorList(d:Docter){
        println("Patient:$name , Doctor:${d.name}")

    }
}
class Docter(val name: String){
    fun patientList(p:Patient){
        println("Docter:$name,Patient:${p.name}")
    }
}
fun main(){
    val doc1 = Docter("wst")
    val patient1= Patient("ttt")
    doc1.patientList(patient1)
    patient1.doctorList(doc1)
}

