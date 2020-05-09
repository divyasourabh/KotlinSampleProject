package com.ds.kotlinsample

import com.ds.kotlinsample.functions.sampleInternalFunction
import com.ds.kotlinsample.functions.sampleNonInternalFunction

fun main(args: Array<String>) {
    println("In HelloWorld Module")

    println("Internal Access modifier Sample")

    println(sampleNonInternalFunction())

    println(sampleInternalFunction())


}