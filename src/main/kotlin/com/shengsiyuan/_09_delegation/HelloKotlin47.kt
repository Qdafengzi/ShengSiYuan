package com.shengsiyuan._09_delegation

//类委托

interface MyInterface {
    fun myPrint()
}

class MyInterfaceImpl(val str: String) : MyInterface {
    override fun myPrint() {
        println("welcome $str")
    }

}