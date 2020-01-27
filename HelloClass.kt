package com.senti.kotlin

fun main(){

    //유사 기능(함수)들의 집합체(객체)
    //1. class - 자동차(시동, 운전), 사람(밥먹는다, 물마신다, 걷는다) , 동물(뛴다), 식물(자란다)
    //2. data class - set, get

    //1. 코딩
    //2. 호출
    //자바와는 다르게 생성자에 new를 안붙여줘도 된다.


    var cls1 = HelloClass()
    var cls2 = HelloClass(age = 10)

    println(cls2.age)

    var person = Person(age = 5,name = "senti")
    println(person.age)
    println(person.name)

    //컬렉션 심화(배열)
}

class HelloClass {
    var age:Int =0
    init {      //클래스 호출시 init이 시작 data클래스도 가능

    }

    //defalut 생성자, 보조 생성자
    constructor() //기본 생성자
    constructor(age: Int) {//보조 생성자  // set
        this.age=age
     }
}

data class Person(var age: Int, val name:String) //val 상수 var상수아님