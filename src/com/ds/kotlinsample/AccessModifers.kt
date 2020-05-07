package com.ds.kotlinsample


//Public, Private, Protector, Internal
//Default is public
//Class can be private that means, everything in that class can be access from same class only
// In kotlin multiple class in One file
//In kotlin file Name can be different from class Name
//Internal visible with in same Module only
//In kotlin all classes are public and final by default

fun main(args: Array<String>) {

    val student = Student()
    println(student)

    val customer = Customer("Divya", "Sourabh")
    println(customer.firstName)
    println(customer.lastName)

    val customer2 =Customer("Divya","Sourabh", true)
    println(customer2.firstName)
    println(customer2.lastName)
    println(customer2.fullTime)

    val simplifiedCustomer =SimplifiedCustomer("Divya","Sourabh", true)
    println(simplifiedCustomer.firstName)
    println(simplifiedCustomer.lastName)
    println(simplifiedCustomer.fullTime)

    val primaryConstructorLessDemo = PrimaryConstructorLessDemo()
    primaryConstructorLessDemo.dummy = "Hello"
    println(primaryConstructorLessDemo.dummy)

    val ownGetterSetterCustomer = OwnGetterSetterCustomer("Divya","Sourabh", true)
    println(ownGetterSetterCustomer.firstName)
    ownGetterSetterCustomer.lastName = "Sourabh Aswal"
    println(ownGetterSetterCustomer.lastName)
    println(ownGetterSetterCustomer.fullTime)

    val car = Car("RED","Toyota",12324)
    println(car)

    //Properties can be set in any order
    val car1 = car.copy(name = "Blue",year = 2020)
    println(car1)

    val car2 = car.copy();


    println("Compare car vs car1 = ${car==car1}")
    println("Compare car vs car2 =  ${car==car2}")

}

private class Student {

}

//Declaring Primary Cosntructor
//Init Block is run when instance is created and it run in conjection with primary constructor
//Primary constructor dosenot contain code, they are declare outside the clury braces


//Simplification 3 removing constructor key word
//But we cannot remove Constructor key word if we use Annoation or Access modifier

/***********Compare JAVA Customer with this Kotlin class*************/

class Customer /*protected*/ /*constructor*/(var firstName: String, val lastName: String) {

/********** IN this one line we declaring Constructor, we declaring properties in primary constructor and assiging value to the parameter to constructor properties*/

    /**Simplification 2 removing doubling by puting var and val in constructor only***/
//    val firstName:String = firstName
//    val lastName: String = lastName


    /******Splification 1 */
    //Combined the assigment with declaration

//    init {
//        this.firstName = firstName
//        this.lastName = lastName
//    }

    /******Adding Another Constructor*******/

    // 1.PRIMARY CALL EXPECTED
    //aLL THE SECONDARY SHOULD DELEGATES TO THE primary COnsctructor
    // Primary constructor call Secondary constructor through : this(firstName,lastName)

    /****Secondary constructor Do not create Properties for US so cannot use VAR and VAL keyword in it we have to create explicitly*/

    var fullTime: Boolean = true

    constructor(/*val*/ firstName: String, /*val*/  lastName: String, /*val*/ fullTime: Boolean): this (firstName,lastName) {
        this.fullTime = fullTime
    }


    /****check SimplifiedCustomer version**********/

}


/****For public properties Kotlin create Default Getter and Setter*******/
/****Conditionn is that in Kotlin getter and setter have same OR lesser access modifer tha the property actually have****/
class SimplifiedCustomer (var firstName: String, val lastName: String, public var fullTime: Boolean = true ) {

}

class OwnGetterSetterCustomer (var firstName: String, lastName: String, public var fullTime: Boolean = true ) {

    var lastName = lastName
    /***Backing field****/
    //************referencing backing field*********
    get() {
        println("Running the custom get")
        return field //field identifier
    }
    set(value) {
        println("Running Custom Set")
        field = value
    }
}


class PrimaryConstructorLessDemo {
    /****Showing that primary constructor is not Complusory*******/

    var dummy:String

    constructor() {
        dummy = "Hello"
    }
}


data class Car  (val name:String, val model: String, val year:Int) {
    //toStrinng, equals() hascode() copy() functions ONLY for parameter define in primary constructor signature
    // Primary Constructor has to have atleast One Paramater
    //All the paramaters in primary constructor is VAL or VAR
    //
}

