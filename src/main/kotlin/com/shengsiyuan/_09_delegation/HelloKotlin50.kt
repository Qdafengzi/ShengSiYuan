package com.shengsiyuan._09_delegation

import kotlin.properties.Delegates

// 非空属性

class MyPerson {
    var address: String by Delegates.notNull<String>()
}

fun main(args: Array<String>) {
    val myPerson = MyPerson()
    myPerson.address = "suzhou"
    println(myPerson.address)
}