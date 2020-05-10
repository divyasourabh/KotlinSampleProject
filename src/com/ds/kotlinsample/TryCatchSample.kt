package com.ds.kotlinsample

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main(args: Array<String>) {

    println("Try Catch Examples")

    //Try Catch can also evaluate as a expression like IF and WHEN
    println(getNumber("23"))
    println(getNumber1("Hello"))

    println(getNumber1("23.3") ?: throw IllegalArgumentException("Number is not an Int"))

    println("Nothing Sample function")

    notImplementedYet("Sample")
}

fun getNumber (str: String) : Int {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        100 // Returning ZERO
    } finally {
        println("I am in the finally blockmmm")
        2  //Returning value
    }
}

    fun getNumber1(str: String): Int? { //RETURNING NULLABLE Int
        return try {
            Integer.parseInt(str)
        } catch (e: NumberFormatException) {
            null // Returning null
            0
        } finally {
            println("I am in the finally block")
            2  //Returning value
        }
    }

fun notImplementedYet (something: String ) : Nothing { ///Never Return the value

    something ?: "Sample Text"

    throw IllegalArgumentException("Implement me! ${something}")
}

/*
*Unit:
Unit in Kotlin corresponds to the void in Java. Like void, Unit is the return type of any function that does not return any meaningful value,
and it is optional to mention the Unit as the return type. But unlike void, Unit is a real class (Singleton) with only one instance.
**/

/*
* Nothing:
*Nothing is a type in Kotlin that represents “a value that never exists”, that means just “no value at all”.
*  use Nothing whenever the functions don’t return anything.
* */

//https://medium.com/thoughts-overflow/kotlin-has-nothing-but-there-is-nothing-like-nothing-in-java-cab98e4f4d26
