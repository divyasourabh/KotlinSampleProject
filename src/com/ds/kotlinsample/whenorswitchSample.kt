package com.ds.kotlinsample

import java.math.BigDecimal

fun main(args: Array<String>) {

    println("When sample")

    val num = 100

    // In when only one condition will execute
    // No break statement like java

    when (num) {
        100, 600 -> println("100") // Or COndition
        in 200..400 -> println("200") // Raanges
        300 -> println("300")
        400 -> println("400")
        500 -> println("500")
        else -> println("Else case execute")
    }

    val y =10
    val num1 = 90

    when (num1) {
        y + 80 -> println("Execute on epression 90 ") // Or COndition
        y + 90-> println("100") // Raanges
        300 -> println("300")
        else -> println("Else case execute")
    }

    val obj: Any = "I am String"
    val obj2: Any = BigDecimal(25.2)
    val obj3:Any = 45

    val something:Any = obj2

    when (something) {
        is String -> "Something is string"
        is BigDecimal -> "Something is BigDecimal"
        is Int -> "Something is Int"
        else -> "Something is something else"
    }


    /***When is an Expression****/
    println(    when (something) {
        is String -> "Something is string"
        is BigDecimal -> "Something is BigDecimal"
        is Int -> "Something is Int"
        else -> "Something is something else"
    })

    val result =     when (something) {
        is String -> "Something is string"
        is BigDecimal -> "Something is BigDecimal"
        is Int -> "Something is Int"
        else -> "Something is something else"
    }

    println("Result =>  $result")

    /***FOR WHEN Statement if we are using them as a expression then there should be ELSE case otherwise error***/

    /*BUT iN case of ENUM if conditions are equal to number of enum element then no need of else case*/

    val dept = Department.IT

    println(" ENUM result => ${ when(dept){
        Department.IT-> {
            "IT ${2+2}"
        }
        Department.HR-> "HR"
        Department.ACCOUNTING-> "Accountant"
    }} ")

}