package com.example.card_list_view

data class TeacherModel(
    val id : Int ?= null,
    val name : String ?= null,
    val sub : String ?= null,
    val students : List<StudentModel>,

)
data class StudentModel(
    val sId: Int ?= null,
    val sName: String ?= null,
    val sAddress: String ?= null,
    val sBatch: String ?= null,
)

