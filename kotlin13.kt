package com.senti.kotlin

/*
고차함수와 람다함수로 함수도 변수처럼 다뤄보자

고차함수??
함수를 마치 인스턴스처럼 취급하는 것
(자료형,자료형,...)->자료형
    파라미터          반환형


람다함수??
일반함수와 달리 그 자체가 고차함수인 것
별도의 연산자 없이 변수에 담을 수 있음

 */

fun main(){

    b(::a)  //일반 함수를 고차함수로 변경시켜 주는 연산자 ::(콜론 두개) 함수 이름 앞에 콜론을 두개 붙여줄 것

    val c :(String)->Unit ={str-> println("$str 람다함수")}
    b(c)
}

fun a(str:String){
    println("$str 함수 a")
}

fun b(funtion:(String)->Unit){   //Unit은 반환형에는 값이 없다는 형식을 표현
    funtion("b가 호출한")
}