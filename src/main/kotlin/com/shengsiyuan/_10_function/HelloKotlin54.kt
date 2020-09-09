package com.shengsiyuan._10_function

fun myPrint0(name: String): Unit {
    println(name)
    return Unit
}

fun myPrint1(name: String) {
    println(name)
}

// 单表达式
fun myPrint2(name: String): Unit = println(name)
fun myPrint3(a: Int, b: Int): Int = a + b

/*
    显式返回类型
    拥有方法体的函数必须要显示指定返回类型，除非函数返回Unit，
    这是返回类型就可以省略掉。
    Kotlin并不会推断拥有块体的函数的返回值，因为这种函数可能拥有非常复杂的控制流程，
    返回类型对于阅读代码的人来说就不是那么明显了（有时，对于编译器来说亦如是）
 */

fun myPrint4(a: Int, b: Int): Int {
    return a + b
}