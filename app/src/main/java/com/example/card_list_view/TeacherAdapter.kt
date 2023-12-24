package com.example.card_list_view

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class TeacherAdapter(val teachersData: List<TeacherModel>): RecyclerView.Adapter<TeacherAdapter.TeacherHolder>() {
    class TeacherHolder(itemView: View): RecyclerView.ViewHolder (itemView){
        val heading = itemView.findViewById<TextView>(R.id.headingText)
        val teacherCard = itemView.findViewById<CardView>(R.id.teacherCard)
        val studentListView = itemView.findViewById<RecyclerView>(R.id.studentList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeacherHolder {
        val layout  = LayoutInflater.from(parent.context).inflate(R.layout.teacher_item_list, parent,false)
        return TeacherHolder(layout)
    }

    override fun getItemCount(): Int {
       return  teachersData.size
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: TeacherHolder, position: Int) {

        if (position%2==0){
            holder.studentListView.adapter = StudentAdapter(teachersData[position].students)

            holder.teacherCard.setCardBackgroundColor(Color.CYAN)
        }else {
            holder.studentListView.adapter = StudentAdapter1(teachersData[position].students)

            holder.teacherCard.setCardBackgroundColor(Color.CYAN)

        }
      holder.heading.text = teachersData[position].name


    }
}


class StudentAdapter(val studentsData: List<StudentModel>): RecyclerView.Adapter<StudentAdapter.StudentHolder>() {
    class StudentHolder(itemView: View): RecyclerView.ViewHolder (itemView){
        val name = itemView.findViewById<TextView>(R.id.name)
        val batch = itemView.findViewById<TextView>(R.id.batch)
        val address = itemView.findViewById<TextView>(R.id.address)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentHolder {
        val layout  = LayoutInflater.from(parent.context).inflate(R.layout.student_item_list, parent,false)
        return StudentHolder(layout)
    }

    override fun getItemCount(): Int {
        return  studentsData.size
    }

    override fun onBindViewHolder(holder: StudentHolder, position: Int) {
        holder.name.text = studentsData[position].sName
        holder.batch.text = studentsData[position].sBatch
        holder.address.text = studentsData[position].sAddress

    }
}

class StudentAdapter1(val studentsData: List<StudentModel>): RecyclerView.Adapter<StudentAdapter1.StudentHolder1>() {
    class StudentHolder1(itemView: View): RecyclerView.ViewHolder (itemView){
        val name = itemView.findViewById<TextView>(R.id.name)
        val batch = itemView.findViewById<TextView>(R.id.batch)
        val address = itemView.findViewById<TextView>(R.id.address)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentHolder1 {
        val layout  = LayoutInflater.from(parent.context).inflate(R.layout.student1_item_list, parent,false)
        return StudentHolder1(layout)
    }

    override fun getItemCount(): Int {
        return  studentsData.size
    }

    override fun onBindViewHolder(holder: StudentHolder1, position: Int) {
        holder.name.text = studentsData[position].sName
        holder.batch.text = studentsData[position].sBatch
        holder.address.text = studentsData[position].sAddress

    }
}