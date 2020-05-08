package com.ds.kotlinsample

import java.time.Year

fun main(args: Array<String>) {
    //Only one instance of company communication will create when first time class is use
    println(CompanyCommunication.getTagLine())
    println(CompanyCommunication.getCopyrightLine())


    /****Companion Object*****/
    println(SomeClass.SomeCompanionName.accessPrivateVar())
    //OR
    println(SomeClass.accessPrivateVar())


}


//One and only one instance of class
/***use od Object keyword***/
//*****No Class Keyword
//Having constructor make no sense because object create and declare instance at same time.

object CompanyCommunication {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"

    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."
}

//****Kotlin dosenot have Statis keyword, We cannot access any function without create class instance
//campanion OBJECT can create inside class and we access with using instance

class SomeClass {

    //*******everything inside companion object is Static we can access them by using class name
    companion object SomeCompanionName{
        private val privateVar = 6

        fun accessPrivateVar () {

            println("I am a accessing privateVar: $privateVar")
        }
    }
}