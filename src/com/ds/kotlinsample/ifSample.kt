package com.ds.kotlinsample

fun main(args: Array<String>) {
    println("If Examples")

    var someCondition = 40 < 60

    if (someCondition) println("I am true")  else println("I am False")


    /**IF- Else is an expression***/

    println("The result of if statement is  ${if (someCondition) {
        println("Something")
        50
    } else {
        println("Something else")
        100
    }}" )
}

