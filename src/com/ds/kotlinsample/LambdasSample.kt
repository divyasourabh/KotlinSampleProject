package com.ds.kotlinsample

import javax.print.DocFlavor

fun main(args: Array<String>) {

    println("Lambda Expression Sample")

    run{
        println("I am in the lambda !")
    }

    val employeeList = listOf(
        Employees("John","Smith",2016),
        Employees("ROhan","sohan",2013),
        Employees("gopal", "das", 2012))

    println(employeeList.minBy { e -> e.startYear })
    println(employeeList.minBy { e : Employees -> e.startYear })
    //***e is the every element in the employeeslist
    ///lambda should be last parameter
    println(employeeList.minBy { /*e -> e*/it.startYear })

    println(employeeList.minBy (Employees::startYear )) //Member Reference

    var num = 10

    run {
        num +=15
        println(num)
    }

    findByLastName(employeeList, "das")

    "Some String".apply someString@{
        "Another String".apply {
            println(toLowerCase())
            println(this@someString.toUpperCase())
        }
    }

}

fun useParameter (employees: List<Employees>, num : Int) {
    employees.forEach {
        println(it.firstName)
        println(num) // we cannot change parameter
    }
}

fun findByLastName (employees: List<Employees>, lastName : String) {
    employees.forEach returnBlock@ {
        if (it.lastName == lastName) {
            println("Yes there's an employee with the last Name $lastName")
            return@returnBlock
//            return
        }
    }

    println("Nppes there is no employee with the last name $lastName")
}

data class Employees (val firstName: String,val lastName: String, val startYear: Int) {

}