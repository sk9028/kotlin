package com.senti.kotlin

/*
클래스의 생성자로 인스턴스를 생성하자

생성자 -> 새로운 인스턴스를 만들기위해 사용함

기본 생성자 -> 클래스를 만들 때 기본으로 선언
보조 생성자 -> 필요에 따라 추가적으로 선언 , 인스턴스 생성시 편의를 제공, 추가적인 구문 수행

예를 들어 100명의 사람을 만든다고 할때 90명 정도가 1997년생 이라면 90명은 보조 생성자로, 10명은 기본 생성자에 의해서 만드는 것이 효율적이다.


보조 생성자는 CONSTRUCTOR라는 키워드 사용

 */


fun main(){

    var a= Person1("박보영",1990)
    var b= Person1("전정국",1970)
    var c= Person1("장원영",1980)

    var d=Person1("이루다")
    var e=Person1("차은우")
    var f=Person1("류수정")
}

class Person1 (var name:String, val birthday:Int){
    init {
        println("${this.birthday}년생 ${this.name}님이 생성되었습니다.") //this는 인스턴스 자신의 속성이나 함수를 호출하기 위해 클래스 내부에서 사용
    }

    constructor(name:String):this(name,1997){
        println("보조 생성자가 사용되엇습니다.")
    }
}