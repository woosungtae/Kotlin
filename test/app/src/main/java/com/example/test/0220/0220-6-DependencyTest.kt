package com.example.test

class Student(val name:String, var id:Int){
    fun teacherList(t:Teacher){
        println("Student:$name,Teacher:${t.name}")
    }
}
class Teacher(val name:String, var s:Student){

    val studentId:Int = s.id

    fun studentList(){
        println("Teacher:$name,Student:${s.name}")
        println("Student id:$studentId")
    }
}
fun main(){
    val student1 = Student("wst",8318)
    val tea1 = Teacher("www",student1)
    tea1.studentList()
}
