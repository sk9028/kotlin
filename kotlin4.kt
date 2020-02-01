package com.senti.kotlin

/*
조건문과 비교연산자

< , <=, >, >=, !=, ==

when 하나의 변수를 여러개의 값과 비교가능
즉  when의 조건에 맞을 때 동작대신 값을 반환하는 것
아래 dowhen 함수로서도 사용가능하고 다른 기능으로도 사용가능하다.


 */


fun main(){
    var a=7

    if(a>10){
        println("a는 10보다 크다")
    }
    else {
        println("a는 10보다 작거나 같다")
    }

    dowhen(1)
    dowhen("Dimo")
    dowhen(12L)
    dowhen(3.14159)
    dowhen("kotlin")
}

fun dowhen(a:Any){
    var result = when(a){
        1-> println("정수 1입니다.")
        "Dimo" -> println("디모의 코틀린 강좌입니다.")
        is Long -> println("Long 타입 입니다.")
        !is String -> println("String 타입 입니다")
        else -> println("어떤 조건도 만족하지 않습니다.")
    }
    println(result)
}

/*
실행결과
a는 10보다 작거나 같다.
정수 1입니다
디모의 코틀린 강좌입니다.
Long 타입 입니다.
String 타입 입니다
어떤 조건도 만족하지 않습니다.
 */