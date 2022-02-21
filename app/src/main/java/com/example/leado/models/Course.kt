package com.example.leado.models

data class Course(
    val name: String,
    val lessons: List<Lesson>,
    var lessonsNum: Int?=null,
    var numTaken:Int?=null,
    var rating:Double?=null,
    val genre:String?=null,
    var progress:Int?=null
)