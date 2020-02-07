package com.senti.kotlin

/*
제너릭으로 캐스팅 없이 다형성의 장점을 취해보자


함수나 클래스를 선언할 때 고정적인 자료형대신 실제적인 자료형으로 할당하는 방법


 */

fun main(){
    usinggeneric(a()).doshouting()  //a의 인스턴스를 받았으니 T는 a가 된다.  ->a가 소리칩니다
    usinggeneric(b()).doshouting()  //b의 인스턴스를 받았으니 T는 b가 된다.  ->b가 소리칩니다
    usinggeneric(c()).doshouting()  //c의 인스턴스를 받았으니 T는 c가 된다.  ->c가 소리칩니다

    doshouting(b())  //b가 소리칩니다
}

fun <T:a> doshouting(t:T){
    t.shout()
}

open class a{
    open fun shout(){
        println("a가 소리칩니다.")
    }
}

class b:a(){
    override fun shout() {
        println("b가 소리칩니다")
    }
}

class c:a(){
    override fun shout() {
        println("c가 소리칩니다")
    }
}

class usinggeneric<T:a>(val t:T){   //타입을 클래스 a로 받아서 변수 t에 저장하고
                                    // doshouting함수에 t.shout으로 a,b,c 클래스에 접근 가능
    fun doshouting(){
        t.shout()
    }
}