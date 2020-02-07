package com.senti.kotlin

/*
null값을 처리하는 방법? 동일한지를 확인하는 방법?
null체크할때 if문으로 하면 사용하는데 있어서 불편함이 있기 때문에 아래아 같은 연산자들을 사용하는 것.

?.    -> 참조 연산자를 실행하기전에 먼저 객체가 null인지 확인부터하고 객체가 null이라면 뒤따라오는 구문 실행 하지않음
?:    -> 객체가  null이 아니라면 그대로 사용하지만 null이라면 연산자 우측에 객체로 연산됨
!!.   -> 참조 연사자를 사용할때 null여부를 컴파일시 확인하지 않도록 하여 런타임시 널포인터 이셉션이 나오도록 의도적으로 방치하는 연산자

내용의 동일성 판별
a == b

객체의 동일성 판별
a === b
 */


fun main(){

    //객체와 내용의 동일성 활용
    var A=product("콜라",1000)
    var B=product("콜라",1000)
    var C = A
    var D=product("사이다",1000)

    println(A == B)    //true
    println(A === B)   //false

    println(A == C)     //true
    println(A === C)    //true

    println(A  == D)    //false
    println(A === D)    //false




    //null판별 연산자 활용
    var a:String?=null
    println(a?.toUpperCase())     // a가 null이기 때문에 toupperCase를 실행하지 않고 null 출력 -> null

    println(a?:"default".toUpperCase())   //null대신 DEFAULT대체 하고 touppercase로 인해 대문자로 바뀜 -> DEFALUT

    println(a!!.toUpperCase())  //구문이 실행되면서 null임을 확인하고 exception이 발생하여 에러가 나고 프로그램 중단


    var b:String? ="Kotlin Exam"    //null일때는 스코프함수 run이 실행되지 않지만 kotlin exam은 실행되는 모습
    b?.run {
        println(toUpperCase())   //대문자로 바뀜
        println(toLowerCase())  //소문자로 바뀜
    }
}


class product(val name:String , val price:Int){
    override fun equals(other: Any?): Boolean {
        if(other is product){   // 패러미터로 넘어온 객체가 product라면
            return other.name  == name && other.price == price  //이름과 가격이 같은지를 boolean 값으로 반환하고
        }
        else{
            return false  //아니라면 false를 반환
        }
    }
}