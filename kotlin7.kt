package com.senti.kotlin

/*
클래스의 기본 객체지향을 이해하자
클래스 -> 값과 그 값을 사용하는 기능들을 묶어놓은 것

$로 변수값에 접근 할 수 있다.
 */

fun main(){
    var a= person("박보영",1990)
    var b= person("전정국",1992)
    var c= person("장원영",1991)

    a.introduce()  //-> 안녕하세요 1990년생 박보영입니다
    b.introduce()
    c.introduce()
}


class person(var name:String, val birthday: Int){
    fun introduce(){
        println("안녕하세요 ${birthday}년생 ${name}입니다")
    }
}