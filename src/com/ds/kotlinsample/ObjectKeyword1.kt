package com.ds.kotlinsample

import com.sun.org.apache.xpath.internal.operations.Bool
import java.time.Year

fun main(args: Array<String>) {
    //Only one instance of company communication will create when first time class is use
    println(CompanyCommunication.getTagLine())
    println(CompanyCommunication.getCopyrightLine())


    /****Companion Object*****/
    println(SomeClass.SomeCompanionName.accessPrivateVar())
    //OR
    println(SomeClass.accessPrivateVar())

    /******Calling Singleton Class*******/
    val someClassPrivate = SomeClassPrivate.justAssign("I am Singleton")
    val someClassPrivate2 = SomeClassPrivate.upperOrLowerCase("I am Singleton", false)
    println(someClassPrivate.someString)
    println(someClassPrivate2.someString)

//    val someClassPrivateObj = SomeClassPrivate() // ERROR trying to create object of singleton class
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
    //Campanion Object can have Name as well
//    companion object{

    companion object SomeCompanionName{

        private val privateVar = 6

        fun accessPrivateVar () {
            println("I am a accessing privateVar: $privateVar")
        }
    }
}


//RepalceConstructorWithCampaion
class SomeClass2 (val str:String){



    //******below code handle through campanion Object
/*      val someString : String

    constructor(str: String) {
        someString = str
    }

    constructor(str: String, isUpperCase : Boolean) {
        if (isUpperCase) {
            someString = str.toUpperCase()
        } else {
            someString = str.toLowerCase()
        }
    }
*/

    companion object SomeCompanionName{

        private val privateVar = 6

        fun accessPrivateVar () {
            println("I am a accessing privateVar: $privateVar")
        }


        //Below is hte code that doing same thar secondary constructor doing

        fun justAssign (str:String) = SomeClass2(str)
        fun upperorLowerCase (str: String, lowerCase: Boolean) : SomeClass2 {
            if (lowerCase) {
                return SomeClass2(str.toLowerCase())
            } else {
                return SomeClass2(str.toUpperCase())
            }
        }
    }
}


/******Singleton Object Creation with private constructor********/

class SomeClassPrivate private constructor(val someString : String) {

    companion object {

        fun justAssign(str:String) = SomeClassPrivate(str)

        fun upperOrLowerCase(str:String, lowerCase:Boolean) : SomeClassPrivate {
            if (lowerCase) {
                return SomeClassPrivate(str.toLowerCase())
            } else {
                return SomeClassPrivate(str.toUpperCase())
            }
        }
    }

}


