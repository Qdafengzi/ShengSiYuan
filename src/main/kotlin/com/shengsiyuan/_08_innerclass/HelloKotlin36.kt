package com.shengsiyuan._08_innerclass

//嵌套类
class OuterClass {
    private val str: String = "hello world"

    class NestedClass {
        fun nestedMethod() = "welcome"
    }
}

fun main(args: Array<String>) {
    println(OuterClass.NestedClass().nestedMethod())
}