package com.shengsiyuan._05_property

class MyExtensionProperty

val MyExtensionProperty.name: String
    get() = "hello"

fun main(args: Array<String>) {
    var myExtensionProperty = MyExtensionProperty()
    println(myExtensionProperty.name)
}