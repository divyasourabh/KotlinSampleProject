package com.ds.kotlinsample

fun main(args: Array<String>) {
    println("packages structure can be ramdom no restriction in KOtlin. But it is recommended to follow directory structure practice")
}

fun topLevelFunction () : String = "I am toplevel function in kotliSample"

class forImportSample{
    fun importFun()="i am importfun of forImportSample"
}

class forImportSampleCompanion{
    companion object {
        fun importCompanion() = "IN forImportSampleCompanion"
    }
}