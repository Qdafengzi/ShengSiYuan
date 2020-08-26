package com.shengsiyuan._09_delegation

import kotlin.reflect.KProperty

//属性委托

class MyDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String =
        "$thisRef,your delegate property name is ${property.name}"

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) =
        println("$thisRef, new value i $value")
}

class MyPropertyClass {
    var str: String by MyDelegate()
}

fun main(args: Array<String>) {
    val myPropertyClass = MyPropertyClass()
    myPropertyClass.str = "hello world"
    println(myPropertyClass.str)
}