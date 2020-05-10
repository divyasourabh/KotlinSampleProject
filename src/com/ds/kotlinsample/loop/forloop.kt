package com.ds.kotlinsample.loop

fun main(args: Array<String>) {

    //Range Operator ".." Two dots

    val range = 1..5

    for(i in range) {
        println(i)
    }
    val stepRangeOperator = 0..22
    println("Step operator in for loop")
    for(i in stepRangeOperator step 5) {
        println(i)
    }

    println("Down To Operator")
    for (p in 20 downTo 14) {
        println(p)
    }

    println("Down To and Step Operator")
    for (p in 20 downTo 10 step 5) {
        println(p)
    }

    println("Down To and Step Operator")
    for (p in 20 downTo 10 step 5) {
        println(p)
    }

    println("Until Operator") //Excluded 3
    for (p in 1 until 3) {
        println(p)
    }

    /******Use of until with for loop*******/
    val str = "Hello world"
    for(p in 0 until str.length) {
        print("${str.get(p)}   ")
    }
    println()
    val charRange = 'a'..'z'

    val stringRange = "ABD".."XYZ"

    println(3 in range)

    println('q' in charRange)

    println("CCC" in stringRange)

    println("CCCCCC" in stringRange)

    println("ZZZZZZZZZZ" in stringRange)

    val backwardRange = 5.downTo(1)

    val r = 5..1

    println(5 in backwardRange)

    val stepRange = 3..10
    val stepThree = stepRange.step(3)
    println("Step Range")
    for (m in stepThree) {
        println(m)
    }

    println("Reverse Range")
    val reversedRange = stepRange.reversed()
    val stepThreeReverse = reversedRange.step(3)
    for (n in reversedRange) {
        println(n)
    }
    println("Reverse Step Three")
    for (n in stepThreeReverse) {
        println(n)
    }

    println("Printing Array list with for loop")
    val colors = arrayOf("RED", "BLUE", "GREEN", "YELLOW", "PINK")
    for (color in colors){
        println(color)
    }

    println("Example of array.INDICES")
    for (index in colors.indices){
        println(colors[index])
    }

    println("NOT IN Sample")
    println("RED" !in colors)
    println("WHITE" !in colors)

    val sampleStr = "GoodMorning"
    println('r' in sampleStr)
    println('p' in sampleStr)

    println("JLoop Smaple")

    iloop@ for (i in 1..3){
       jloop@ for (j in 1..3) {
            kloop@ for (k in 1..3) {
                if (k ==3) {
                    println("K===3")
                    break@jloop
                }
            }
        }
    }
}