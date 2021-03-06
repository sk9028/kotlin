package com.senti.kotlin

/*
스코프 함수로 좀 더 간결하게 코드를 작성하자

1. 람다함수도 여러구문을 수행할 수 있음
여러 줄일 경우는 마지막 코드의 결과값이 반환형을 결정함.

2. 람다함수에 패러미터가 없다면?
실행할 구문들만 나열하면 된다.

3. 파라미터가 하나뿐이라면 it사용



스코프 함수에는?
apply -> 인스턴스를 생성 후 변수에 담기전에 초기화 과정에서 많이 쓰임 ,변수를 초기화 할때 함수도 같이 사용할 수 있는 장점으로 코드의 간결화
run -> 인스턴스 대신 마지막 구분의 결과값을 반환
with -> run과 동일한 기능이지만 단지 인슽턴스를 참조연산자대신 파라미터로 받는 것만 다름
also -> 처리가 끝나면 인스턴스를 반환
let -> 처리가 끝나면 최종값을 반환

apply/also  -> 처리가 끝나면 인스턴스를 반환  , 참조연산자 없이 인스턴스의 변수화 함수를 사용가능
run/let -> 처리가 끝나면 최종값을 반환 , 파라미터로 인스턴스를 넘긴것처럼 it을 통해 인스턴스 사용 가능

스코프 내에서 코드의 가독성을 높이기 위해 위와 같은 함수들을 사용하는 것임


 */


fun main(){

    var price = 5000

    var a = book("디모의 코틀린",10000).apply {  //함수 호출 뒤에 .apply를 붙여주면 됨
        name = "[초특가]" + name
        discount()
    }

    a.run {
        println("상품명 : ${name},가격 : ${price}원 ") //상품명 : [초특가]디모의 코틀린, 가격 : 5000원 ,apply로 초기화된 변수를 run으로 실행결과를 보는것이라고 생각하기.
    }

    a.let{
        println("상품명 : ${it.name},가격 : ${it.price}원 ") //상품명 : [초특가]디모의 코틀린, 가격 : 8000원
    }
}

class book(var name : String,var price:Int){
    fun discount(){
        price -= 2000
    }
}
