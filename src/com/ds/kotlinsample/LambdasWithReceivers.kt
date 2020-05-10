package com.ds.kotlinsample

fun main(args: Array<String>) {

    val employeeList = listOf(
        Employees("John","Smith",2016),
        Employees("ROhan","sohan",2013),
        Employees("gopal", "das", 2012))

    println("Lambdas With receviers sample")

    println("WITH")
    println(countTo100WithSimplify3())

    println("APPLY")
    println(countTo100WithSimplify4())
}



fun countTo100() : String {
    val numbers = StringBuilder()
    for(i in 1..99) {
        numbers.append(i)
        numbers.append(",")
    }
    numbers.append("100")
    return numbers.toString()
}

// WITH pass lambda and number

fun countTo100With() : String {
    val numbers = StringBuilder()
    return with (numbers) {
        for(i in 1..9) {
            numbers.append(i)
            numbers.append(",")
        }
        numbers.append("10")
        return numbers.toString()
    }
}



fun countTo100WithSimplify1() : String {
    val numbers = StringBuilder()
    return with (numbers) {
        for(i in 1..99) {
            append(i)
            append(",")
        }
        append("100")
        return toString()
    }
}



fun countTo100WithSimplify2() : String {
    return with (StringBuilder()) {
        for(i in 1..99) {
            append(i)
            append(",")
        }
        append("100")
        toString()
    }
}

/****As a Expression Body****/
fun countTo100WithSimplify3() =
    with (StringBuilder()) {
        for(i in 1..9) {
            append(i)
            append(",")
        }
        append("10")
        toString()
}

/****APPLY Operator****/
fun countTo100WithSimplify4() =
   StringBuilder().apply{
        for(i in 1..9) {
            append(i)
            append(",")
        }
        append("10")
    }.toString()


/*Kotlin :: apply
* In Kotlin, apply is an extension function on a particular type and sets its scope to object on which apply is invoked.
* Apply runs on the object reference into the expression and also returns the object reference on completion.
* It does not simply setting properties of course but do much more functionalities and capable of evaluating complex logic before returning.
* In the end, it returns the same object, with some modified changes.
*
* */

/*
* Kotlin :: with
* Like apply, with is also used to change properties of an instance. But here we don’t require a object reference to run, i.e. : we don’t need a dot operator for reference.
* */

/*Difference between apply and with

    with runs without an object whereas apply needs one object to run
    apply runs on the object reference, but with simply passes it as the argument
* */