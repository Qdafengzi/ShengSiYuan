package com.shengsiyuan._07_genericity

//泛型 generics 变量类型的参数化

class MyGeneric<T>(t: T) {
    var variable: T

    init {
        this.variable = t
    }
}

fun main(args: Array<String>) {
    var myGeneric: MyGeneric<String> = MyGeneric<String>("hello world")
    println(myGeneric.variable)

    var myGeneric2 = MyGeneric("hello world")//Kotlin类型推断
    println(myGeneric2.variable)
}

// 协变（covariant）和逆变（controversial）
/*
    List<Object>
    List<String>
    List<string> list = new ArrayList();
    List<Object> list2 = list; //编译失败

    list2.add (new Date( ) )
    String str = list.get(0);
    通配符的出现 解决上面问题
    List<? extends Object> list . ..


    interface Collection<E> {
        void addAll(Collection<E> items)
    }

    interface Collection<E> {//实际
        void addAll(Collection<? extends E> items)
    }

    void copyAll(Collection<Object> to, Collection<String> from) {
    to.addAll(from)
    }
*/