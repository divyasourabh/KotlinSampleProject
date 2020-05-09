package com.ds.kotlinsample


fun main(args: Array<String>) {

    KotlinBicycle(10,20,30).printDescription();

    KotlinMountainBike(40,10,20,30).printDescription()

    KotlinRoadBike(80,10,20,30).printDescription()

    KotlinRoadBike(10,10,10,color = "Blue")

    KotlinRoadBike("Blue",10,10,10)

    KotlinRoadBike(KotlinRoadBike.availableColor[1],10,10,10)

    KotlinRoadBike.availableColor.forEach { println(it) }
}

open class KotlinBicycle (var cadence : Int, var speed : Int, var gear : Int) {

    fun applyBrake (decrement : Int) {
        speed -= decrement
    }

    fun speedUp (increment : Int) {
        speed += increment
    }

    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed")
    }
}

//****** Note: in KotlinMountainBike constructor cadence speed gear are not have VAR key because they are declare in KotlinBicycle
/// seat Heaight is declare VAR because it can be SET and GET

open class KotlinMountainBike (var seatHeight : Int, cadence : Int, speed: Int, gear : Int = 10 /* default value*/) : KotlinBicycle(cadence,speed, gear){

    override fun printDescription() {
        super.printDescription();
        println("The mountain bike has a seat height of $seatHeight  MM.")
    }
}

//If variable have Only GET method then declare with VAL only
class KotlinRoadBike (val tireWidth : Int, cadence : Int, speed: Int, gear : Int = 10/*default value*/) : KotlinBicycle(cadence,speed,gear){

    constructor(seatHeight: Int,cadence: Int,speed: Int,gear: Int = 10,color:String) : this(seatHeight, cadence, speed, gear) {
        println("This is the Secondary constructor and Color is  $color")
    }

    constructor(color:String, seatHeight: Int,cadence: Int,speed: Int,gear: Int = 10) : this(seatHeight, cadence, speed, gear) {
        println("This is the Secondary constructor and Color is  $color")
    }


    companion object {
        val availableColor= listOf("blue", "Red", "Black" , "Green")
    }

    override fun printDescription() {
        super.printDescription();
        println("The Road bike has a seat height of $tireWidth MM.");
    }
}