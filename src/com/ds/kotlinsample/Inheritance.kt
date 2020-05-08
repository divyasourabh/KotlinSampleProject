package com.ds.kotlinsample

fun main(args: Array<String>) {

    val laserPrinter = LaserPrinter("Brother 1234")
    laserPrinter.printmodel()

    val specialLaserPrinter = SpecialLaserPrinter("Special LAser Printer 1234")
    specialLaserPrinter.printmodel()
}

/*****By Default every thing in Kotlin is Public and Final*******/
//TO extend any class it should be Open

//open abstract class Printer(val modelName : String) { }

//If A class is abstract class no need to declare it as a Open
abstract class Printer(val modelName : String) {

    // We cannot override super class function as by default all are public FINAL in kotlin
    // no need to update with 'open' ketword

    open fun printmodel () = println("The model name of this printer is ${modelName}")

    //Abstract Functions are OPEN By Default
    abstract fun bestSellingPrice(): Double

}

open class LaserPrinter(modelName:String) : Printer(modelName) {

    override fun bestSellingPrice(): Double = 123.123

    //OVERRIDDING SUPER CALL FUNCTION
    // We cannot override super class function as by default all are public FINAL in kotlin
    // no need to update with 'overrride keyword
    override fun printmodel() = println("Overridding ${modelName}")

    /****NOTE: override keyword also make function OPEN***/
}

class SpecialLaserPrinter(modelname :String) :LaserPrinter(modelname){

    override fun printmodel() {
        println("SpecialLaserPrinter printing ${modelName}")
    }
}




open class Something{

    val someProperty : String

    constructor(someParameter: String){
        someProperty = someParameter
    }

}


class SomethingElse : Something {

    constructor(someOtherParameter: String) : super(someOtherParameter)

}


/*Primary constructor  need to call from secondary as well*/
open class SomethingExtra (val x : Int) {

    var someProperty : String = "something"

    constructor(someParameter: String, y : Int) :this(y){
        someProperty = someParameter
    }

}

class SomethingExtraElse : SomethingExtra {

    /***Parents Constructor call first then child constructor****/
    constructor(someOtherParameter: String, z : Int) : super(z)

}

/****Data class cannot be open so that means Data Class is Closed tiet.. cannot be Extended****/
/*open*/ data class DataClass (val number: Int) {}

/******READ MORE ABOUT IT******/