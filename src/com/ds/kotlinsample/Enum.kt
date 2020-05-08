package com.ds.kotlinsample

fun main(args: Array<String>) {

    println(Department.HR.getDeptInfo())
}


enum class Department(val fullName:String, val numEmployee:Int) {

    //Enum Properties

    HR("Human Resource",5),IT("Information Tech",100)
    ,ACCOUNTING("Accountancce",12);
/********EXCEPTION: We need to add SEMI COLON if we want to add function in ENUM*/

    fun getDeptInfo() = "The ${fullName} department has ${numEmployee} employee"
}