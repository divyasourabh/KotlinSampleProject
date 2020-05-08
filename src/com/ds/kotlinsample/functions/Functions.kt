package com.ds.kotlinsample.functions

/**Default return type of FUnction is Unit****/

fun main(args: Array<String>) {

    println(labelMultiply(3,4,"The result is: "))
    println(multiply())
    println(labelMultiplySimplification1(3,2,"The result is: "))
    println(labelMultiplySimplification2(3,5,"The result is: "))

    println(Employee("DivyaSourabh").printUpperCase())

    println(Employee(10,20).multiply("Result is "))
    println(Employee(10,20).multiply())
    println(Employee(op2 = 10,op1 = 20).multiply("Changing Order Result = "))

    //You only have one type of vararg parameter and should be in Start
    println(Employee(op2 = 10,op1 = 20).multiplyAnyNumber( 2,2,2,2,label = "Result of vararg = "))


    val employee2 = Employee("Two")
    val employee3 = Employee("Three")
    val employee4 = Employee("Four")
    val employee5 = Employee("Five")

    val manyEmployee = arrayOf(employee2,employee3,employee4,employee5)


    /// '*' operator is known as the Spread Operator : Unnpacking the element from the Array
    printEmployee(*manyEmployee)

    //Spread operator can be used for unpacking multiple list in array of lists

    printText(employee2.firstName,employee3.firstName,employee4.firstName,employee5.firstName)



}

fun labelMultiply(operand1:Int,operand2: Int,lable:String) : String /*Return Type*/ {

    return ("$lable ${operand1*operand2}")
}

fun multiply() = 3 * 5
fun multiply1() : Int = 3 * 5
//fun multiply2() : Unit = 3 * 4 //ERROR because it is return INT

fun labelMultiplySimplification1(operand1:Int,operand2: Int,lable:String) : String /*Return Type*/ = ("$lable ${operand1*operand2}") //Block Body in b/w { }

//here Kotlin Complier intelligent enough to infer that return type is String so we can remove
fun labelMultiplySimplification2(operand1:Int,operand2: Int,lable:String) = ("$lable ${operand1*operand2}") // Expression body

fun printText(vararg text :String) {
    for (str in text){
        print(str)
    }
}

fun printEmployee(vararg employee :Employee) {
    for (employe in employee){
        println(employe.firstName)
    }
}


class Employee (var firstName:String) { //Primar Constructor

    var op1: Int
    var op2: Int

    constructor(op1:Int, op2:Int) :this ("DivyaSourabh"){ //Secondary Constructor calling primary constructor through this keyword
        this.op1 = op1
        this.op2 = op2
    }

//    intisalisation block

    init {
        op1 = 0
        op2 = 0
    }


    /***By Default function is public final ****/
    fun multiply(label :String = " Default the Answer is ") = "$label ${op1*op2}"

    fun multiplyAnyNumber(vararg operands: Int, label :String = " Any Number Multiple result is ") :String {

        var result: Int = 1;
        for (op in operands) {
            result = result * op
        }
        return "$label ${result}"
    }

    fun printUpperCase() = firstName.toUpperCase()


}