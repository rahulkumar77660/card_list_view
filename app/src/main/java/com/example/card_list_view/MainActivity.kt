package com.example.card_list_view

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val students = ArrayList<StudentModel>()
        val teachers = ArrayList<TeacherModel>()
        students.add(StudentModel(1,"Rahul", "Shekhpura", "Android"))
        students.add(StudentModel(1,"Rahul", "Shekhpura", "Android"))
        students.add(StudentModel(1,"Rahul", "Shekhpura", "Android"))
        students.add(StudentModel(1,"Rahul", "Shekhpura", "Android"))
        students.add(StudentModel(1,"Rahul", "Shekhpura", "Android"))
        students.add(StudentModel(1,"Rahul", "Shekhpura", "Android"))
        students.add(StudentModel(1,"Rahul", "Shekhpura", "Android"))
        students.add(StudentModel(1,"Rahul", "Shekhpura", "Android"))
        students.add(StudentModel(1,"Rahul", "Shekhpura", "Android"))
        students.add(StudentModel(1,"Rahul", "Shekhpura", "Android"))
        students.add(StudentModel(2,"Vivek", "Shekhpura", "Android"))
        students.add(StudentModel(2,"Vivek", "Shekhpura", "Android"))
        students.add(StudentModel(2,"Vivek", "Shekhpura", "Android"))
        students.add(StudentModel(2,"Vivek", "Shekhpura", "Android"))
        students.add(StudentModel(2,"Vivek", "Shekhpura", "Android"))
        students.add(StudentModel(2,"Vivek", "Shekhpura", "Android"))
        students.add(StudentModel(3,"Rohit", "chandpura", "Android"))
        students.add(StudentModel(3,"Rohit", "chandpura", "Android"))
        students.add(StudentModel(3,"Rohit", "chandpura", "Android"))
        students.add(StudentModel(3,"Rohit", "chandpura", "Android"))
        students.add(StudentModel(3,"Rohit", "chandpura", "Android"))
        students.add(StudentModel(3,"Rohit", "chandpura", "Android"))
        students.add(StudentModel(3,"Rohit", "chandpura", "Android"))
        students.add(StudentModel(3,"Rohit", "chandpura", "Android"))

        teachers.add( TeacherModel(1,"Ansar sir","Android" ,students))
        teachers.add( TeacherModel(2,"Subham sir","Android" ,students))
        teachers.add( TeacherModel(3,"Rashid","Android" ,students))
        teachers.add( TeacherModel(4,"Sudish sir","Android" ,students))
        teachers.add( TeacherModel(5,"Ajay sir","Android" ,students))
        teachers.add( TeacherModel(6,"Ajay","Android" ,students))
        teachers.add( TeacherModel(7,"Nehal","Android" ,students))
        teachers.add( TeacherModel(8,"Sudhir","Android" ,students))
        teachers.add( TeacherModel(9,"Rohit","Android" ,students))
        teachers.add( TeacherModel(10,"Vikash","Android" ,students))
        teachers.add( TeacherModel(11,"Rahul Sir","Android" ,students))
        teachers.add( TeacherModel(12,"Rahul Raj","Android" ,students))

        val teacherList = findViewById<RecyclerView>(R.id.teacherList)
        val adapter = TeacherAdapter(teachers)
        teacherList.adapter = adapter

    }
}