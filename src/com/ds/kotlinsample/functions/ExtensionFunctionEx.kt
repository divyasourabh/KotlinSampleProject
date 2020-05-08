package com.ds.kotlinsample.functions

fun main(args: Array<String>) {

    //Normal Function
    println(Utils().upperFirstAndLast("this is in all lower case"))

    val str = "this is in all lower case"

    //Using Extension Function
    println("Extension Function  ${str.upperFirstAndLast()}")

}


/*****Extension Functions********/
//As we dont have String class code so we cannot add function there so
//what we will do we just add Class name and '.' before function name
//Extension Function CAN be used instead of extend the classes
//For refernece check Utils class

fun String.upperFirstAndLast () : String {

//    val upperFirst = this.substring(0,1).toUpperCase() + this.substring(1)

    //This Can be drop from above line as this is illusion of string class function.
    //String Str is receiever Object so it will automatically substituted

    val upperFirst = substring(0,1).toUpperCase() + substring(1)

    return upperFirst.substring(0,upperFirst.length-1) + upperFirst.substring(upperFirst.length-1,upperFirst.length).toUpperCase()
}


/***InLine Function******/
//Add inline keyword before fun keyword
//Inline function work best with lambda parameter
//Inline might decide by JVM
//Inline Function body will be directly generated into byte code whoever is function call rather then function call