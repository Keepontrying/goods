@file:JvmName("DemoUtils")

package com.lyw.source.controller

fun funnymen(param: String) = param + "te"


fun main(args : Array<String>){
    var t = funnymen("liangyuwu")
    println(t)
}

