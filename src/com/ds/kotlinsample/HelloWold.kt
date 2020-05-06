package com.ds.kotlinsample

typealias EmployeeSet = Set<Employee>


/*No Default Class definition in Kotlin, Class declaration done by Complier*/
fun main(args: Array<String>) {
    println("Hello World!")

    val names = arrayListOf("Json","Divya","Sourabh")
    println(names[2])

    /*Throw Key dose Not exist in Kotlin..Kotlin have only unchecked Exceptions*/
    /*Kotlin dont have Tarnary Operator ?:  */
//    for (int i = 0; i< 20 ; i++) this form of FOR loop dose not exist in Kotlin
    println("Typealias")
    val employee: EmployeeSet// Now empleyee variable is of type Set<Employee>

    /*No NEW keyword in Kotlin*/
    val employee1 = Employee("Divya1", 100)
    val employee2 = Employee("Divya2", 200)
    val employee4 = Employee("Divya2", 200)
    val employee5 = employee2

//    employee1 = employee2 //Wont work as employee1 is VAL final variable
    val employee3 = Employee("Divya3", 300)

    println(employee1.name)
    println(employee1.id)

    println("Check Equality")
    /********  ==  is Null safe ********/
    println(employee2 == employee4)
    println(employee2 != employee4)

    /*Referencial Equality*/
    println("Check Referencial Equality")
    println(employee2 === employee5)
    println(employee2 !== employee5)

    if (employee1 == employee2){
        println(true)
    } else {
        println(false)
    }

    /*
    * Bit wise operator in kotlin use by word not by symbol
    * OR
    * AND
    * XOPletlet
    * */

    /*
    * is Operator for checking Instance Of in Kotlin
    * */

    val something: Any
    something = employee1
    /*This can be write as val something: Any = employee1*/

    println("Smart Casting: Checking instance Of")
    if (something is Employee){
        println(true)

//        val newEmployee = something as Employee
        /*
         * In Kotlin no need to Cast complier automatically do
         * */
        println(something.name)
    }else{
        print(false)
    }

    println("String Template: Using $ sign")
    println(employee1)

    val change = 4.22
    println("Your change is $change")
    println("Your change is $$change")

    println("Triple coted String")
    println("""Hello Kotlin World
        | you will rpelace Java
        | from andorid""".trimMargin())

    println("**Another Way with trimMargin()**")
    println("""Hello Kotlin World
        *you will rpelace Java
        *from andorid""".trimMargin("*"))

}



class Employee(var name: String, val id: Int) {

    /*Checking Structureal equality*/

    override fun equals(obj: Any?): Boolean {

        if(obj is Employee) {
            return name == obj.name && id == obj.id
        }

        return false
    }

    override fun toString(): String {
        /*Dollar sign is use to print value of variable*/
        return "Employee(name=$name', id=$id)"
    }
}