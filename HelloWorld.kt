package com.senti

fun main(){
    val hello1: String ="hello world"  //val -> final 상수
    var hello2: String ="hello world"  //var -> int string float double
    //String 뒤에 물음표가 없으면 null을 넣을 수 없다는 의미
    //var hello2: String? ="hello world"
    //코틀린은 세미콜론이 필요없음

    println(hello1)
    println(hello2)

    println(hello())

    hello()  //아래 선언한 함수 호출
}

fun hello(): String{ //자바로 치면 private String hello() {} 함수
    return "hello fun!"
}