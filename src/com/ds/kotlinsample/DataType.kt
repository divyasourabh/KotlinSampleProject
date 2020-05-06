package com.ds.kotlinsample

import com.ds.javacode.DummyClass

fun main(args: Array<String>) {

    println("VAR vs VAL")
    var number1: Int
    number1 = 10
    number1 = 30 // it will work as Var is mutable variable

    println("Data Type sample")
    val number2: Int
    number2 = 10
//    number2 = 20 //Wont work VAL if final

    var myShort: Short =1221
    var myByte: Byte = 111
    /*Converting*/
    myShort = myByte.toShort()

    var myLOng = 22L
    var myInt = 10

    /*CAST INT INTO LONG*/
    myLOng = myInt.toLong()

    val myFloat: Float = 2345.234F
    println("This is a float: ${myFloat is Float}")

    val char = 'b'
    val myCharInt = 65 //ASCII Value of A
    println("Char Int : " + myCharInt.toChar())

    val isOnVacation = true
    /*
    * Kotlin only have class no primitive type data type
    *  but Kotlin complier convert Class type to
    * primitive that is why below code work
    * */
    println("Result from Dummy Java Class:  " + DummyClass().isVacationTime(isOnVacation))

    var myAny: Any
    println("Any is the root of the Kotlin class hierarchy. Every Kotlin class has [Any] as a superclass.")
    println("Check ANY Class implementation")

    fun unitReturnSample():Unit {
        println("The type with only one value: the `Unit` object. This type corresponds to the `void` type in Java.")
    }

    println("unitSampleFunction Return value:  " + unitReturnSample())
}