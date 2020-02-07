package com.senti.kotlin

/*
다형성의 특징 수퍼클래스와 서브클래스간의 변환이 가능한 이유


다형성?
목이 말라서 음료를 마셔야하는데 기호에 맞게 콜라나,물이나 마실 수 있다.
여기서 콜라는 콜라자체로 될 수도있고 음료로 분류도 된다.
여러가지 뜻으로 해석되는 것을 다형성이라고 한다.

업캐스팅과 다운캐스팅
as   -> 다운캐스팅을 할 수 있는지 판별하지 않고 다운캐스팅을 실행
is   -> 다운캐스팅을 할 수 있는지 판별하고 다운캐스팅을 실행
 */

fun main(){

    var a=drink()
    a.Drink()   //음료를 마십니다.

    var b:drink=cola()
    b.Drink()   //음료중에 콜라를 마십니다.

    if(b is cola){
        b.washdishes()
    }

    var c=b as cola
    c.washdishes()
    b.washdishes()    //b가 as를 통해서 다운캐스팅 됐기때문에 바로 사용 가능함
}

open class drink{
    var name ="음료"

    open fun Drink(){
        println("${name}를 마십니다.")
    }
}

class cola:drink(){
    var type = "콜라"

    override fun Drink() {
        println("${name}중에 ${type}를 마십니다.")
    }

    fun washdishes(){
        println("${type}로 설거지로 합니다.")
    }
}