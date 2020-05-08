package com.ds.kotlinsample

import java.util.*

/*******Note File name is not same as Class Name in Kotlin*********/

/*
* Object Key word can be use in 3 scenario
* 1. To create a singleton object
* 2. To use comapanion Object when we have private constructor
* 3. To create anonymous instances
* */

fun main(args: Array<String>) {
    println("File Name and class name not related in Koltin")

    /****Object Expression to call anonymous instance using object keyword****/

    var thisIsMutable = 45

    println(thisIsMutable)

    acceptSomeInterface(object : SomeInterface{

        /*****This is block Body*****/
        override fun mustImplement(num: Int): String {
            thisIsMutable++
            return "This is from acceptSomeInterface : ${num * 100}"
        }
//        override fun mustImplement(num: Int) = "Expression body This is from acceptSomeInterface: ${num*10}"/**This is Expression Body****/
    })

    println(thisIsMutable)
}

interface SomeInterface {
    fun mustImplement (num:Int) :String
}

fun acceptSomeInterface (si: SomeInterface) {
    println("Printing from wantsSomemInterface ${si.mustImplement(10)}")
}