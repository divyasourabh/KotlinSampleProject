package com.ds.kotlinsample

import com.ds.javacode.DummyClass
import java.math.BigDecimal

fun main(args: Array<String>) {
    println("No special datatype or class of name Array in kotlin")
    println("Array instances can be created using the [arrayOf], [arrayOfNulls] and [emptyArray]")
    println("Array in koltin is collection Class")

    val names = arrayOf("Divya","Sourabh","Aswal")

    val long1 = arrayOf(1L,2L,3L)
    val long2 = arrayOf<Long>(1,2,3)
    val long3 = arrayOf(1,2,3,4)

    println(long1 is Array<Long>)
    println(long2 is Array<Long>)
    println(long3 is Array<Int>)

    println(long2[2])
    println("Lambda Expression Sample")

    /*Declaration of Collection Class array*/
    /*This is lambda Function which set FIVE even number start from ZERO in array*/
    val evenNumberArray = Array(5) {i -> i * 2}

    /*loop over evenNumber Array*/
    for (number in evenNumberArray) {
        println(number)
    }

    val allZerosArray = Array (100) {0}

    var someArray: Array<Int>
    someArray = arrayOf(1,2,3,4)

    println("Print SomeArray list")
    for(num in someArray) {
        println(num)
    }

    /*
    * we can initialize further also
    * */
    someArray = Array(6) { i -> ( i + 1 ) * 10} // Array of Size 6
    println("Print Some array after update")
    for(num in someArray) {
        println(num)
    }

//    println(someArray is Array<Any>) This is not true so showing error
    println(someArray is Array<Int>)

    val mixedArray =  arrayOf("hello",22,BigDecimal(10.5),'a')

    for (elmeent in mixedArray){
        println(elmeent)
    }

    println(mixedArray is Array<Any>)

    val myIntArray = arrayOf(3,4,53.34,"hello",45.34)

//    DummyClass().printNumber(myIntArray)
//    / * Type Mismatch array when we call java method which accept Int aaray and from kotlin try to pass ANY type Array */

    val myIntArrayIntCopy = intArrayOf(3,4,53,34,45)

    DummyClass().printNumber(myIntArrayIntCopy)

    var someOtherArray = IntArray(5)

    for (number in someOtherArray) {
        println(number)
    }

    DummyClass().printNumber(someOtherArray)

    /**Type MisMatch Required IntArray FOUND Array<Int>**/
//    DummyClass().printNumber(evenNumberArray)

    DummyClass().printNumber(evenNumberArray.toIntArray()) //This working FINE.


}