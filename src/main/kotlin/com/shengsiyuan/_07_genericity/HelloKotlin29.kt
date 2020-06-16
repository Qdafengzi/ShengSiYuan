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

    var myClass = MyClass<String>("abc")
    myTest(myClass)
}

//out 关键字 协变
class MyClass<T>(t: T) {
    private var t: T

    init {
        this.t = t
    }

    fun get(): T {
        return this.t
    }
}

fun myTest(myClass: MyClass<String>) {
    var myObject: MyClass<String> = myClass
    println(myObject.get())
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

    effective java
    //协变 用于读取
    Collection<String> 是Collection<? extends Object> 的子类型 而不是Collection<Object>的子类型

    //逆变 用于写入
    List<? super String>

    我们如果只从中读取数据，而不往里面写入内容，那么这样的对象叫做生产者
    如果我们只向里面写入数据，而不从里面读取数据，这样的对象叫消费者

    生产者使用? extends E
    消费者使用? super E
*/