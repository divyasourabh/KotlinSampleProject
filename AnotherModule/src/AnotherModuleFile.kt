import com.ds.kotlinsample.Department
import com.ds.kotlinsample.Department.*
import com.ds.kotlinsample.forImportSample
import com.ds.kotlinsample.functions.sampleNonInternalFunction
import com.ds.kotlinsample.functions.upperFirstAndLast as ufla

//Import alias BY usinng "as" keyword
import com.ds.kotlinsample.forImportSampleCompanion as companionSample
import com.ds.kotlinsample.topLevelFunction

fun main(args: Array<String>) {

    println("In Another Module")

    println("Sample of access through import")

    println("AnotherModule File Running")

    println("${topLevelFunction()}")

    println("${forImportSample().importFun()}")

    /****** "AS" keyword sample********/
//    println("${forImportSampleCompanion.importCompanion()}")

    println("${companionSample.importCompanion()}")

    println(IT.getDeptInfo())

//    println("extension function import sample".upperFirstAndLast())
    /***Through "AS" Keyword ****/
    println("extension function import sample".ufla())

    println("Internal Access Modifier Sample")

    println(sampleNonInternalFunction())

//    println(sampleInternalFunction()) //*** Cannot be access internal Function from another MODULE

}