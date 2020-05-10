package com.ds.kotlinsample

import java.lang.NullPointerException

fun main(args: Array<String>) {

   // val str: String = null; //Error come Null cannot be a value of a Non NULL type STRING
    var strNullable: String? = null;

    if (true) {
        strNullable = "This can be Null"
    }

    if (strNullable != null) {
        strNullable.toUpperCase()
    }


    /*******   "?" is called Safety operator  , If safety operator is in series and any of variable got Null whole expression evaluate NULL********/
    /*
    * Explicitly mark NOT NULL if still variable come NUll then expresssion evaluate to Null
    * */
    strNullable?.toUpperCase()
    /*
    * if remove ? from strNullable then toUpperCase () Not found
    * */

    /*if still variable come NUll then expresssion evaluate to Null
    * */
    println("Value if null ${strNullable?.toUpperCase()}")


    /********Elvis Operator ?: ************/
    //This is to assign Default value
    //If value is null then assign default value

    var str =null
    var str2 = str ?: "This is the default value"

    println(str2)

    //Short of above   code
/*    if(str == null) {
        str2 = "This is the default value"
    } else {
        str2 = str
    }*/

    println("Casting operator 'as' ")
    var obj = 10
   // var objresult = obj as String // ClassCastException This will return Null of type mismatch to avoid it use as?
    //println(objresult)
    println("Safe Casting operator as? ")
    val something: Any = arrayOf(1,2,3,4)
    val str3 = something as? String  // if not cast successfully return null

    println(str3) // will print Null

    println("!! Safe operator")
    var str5: String? = "This is not Null"
    val str7 = str5!!.toUpperCase()

//********above code is short of
    /*if (str5 == null) {
        throw NullPointerException()
    } else {
        str7 = str5.toUpperCase()
    }*/

    println("?  operator tells that variable can NONNULL only")
    println("!!  operator tells that variable can be NULL ")


    /********This is let operator example*******/
    println("let operator")
    val str8: String? = "This is not null"

    if (str8 != null) {
        printText(str8)
    }

    //Above if condition can be replace by
    str8?.let { printText(it)} //Lambda Expression
    // "it" keyword is refer to variable str8
    //SO basically "it" is object who called this function


    println("arrayOfNulls")

    val nullableInts = arrayOfNulls<Int>(5)
    for (i in nullableInts){
        println(i)
    }

    val intArray = Array<Int?>(3) {i->(i*2)}
}

fun printText (text: String) {
    println(text)
}