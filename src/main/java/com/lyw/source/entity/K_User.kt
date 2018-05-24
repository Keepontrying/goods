package com.lyw.source.entity

import kotlin.jvm.internal.iterator

class K_User(var userName:String, var age : Int)


fun main(args: Array<String>) {
    var user = K_User("liang", 18)
    println(user.userName)
    println(user.age)
    println("hello : ${args.size}")
    println(args)

    var s = """dfasldkfja
                dfasdfas
                asdfasfas"""

    var lst = s.split("\n")
    var mmu = lst.toMutableList()
    mmu.add("test")
    println(mmu.indexOf("test"))

    var b : Boolean = mmu.contains ("test")
    var iter = lst.iterator()
    while (iter.hasNext()){
        println(iter.next())
    }




}