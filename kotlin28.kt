package com.senti.kotlin

/*
변수의 고급기술 상수,lateinit,lazy

const val  -> 상수 선언 (기본 자료형만 가능함)
* 클래스의 속성이나 지역변수로 사용할 수 없음
* 상수의 이름은 대문자와 언더바만 사용하도록 한다

변수대신 상수를 사용하는 이유?
객체를 생성하는데 시간이 더 소요되어 성능의 하락이 있기 때문이다.
그래서 고정적으로 사용하는 값은 상수로 지정하는 것이 효율이 좋다.

lateinit var?
초기값 할당 전까지 변수를 사용할 수 없음
기본 자료형에는 사용할 수 없음

lazy?
맨 마지막에 있는 값으로 값이 초기화된다.
아래 lazy예제를 보면 마지막에 넣은 숫자 7이 number변수에 할당된 것을 확인할 수 있다.
 */

fun main(){
    //lazy활용
    val number:Int by lazy {
        println("초기화를 합니다")
        7
    }
    println("코드를 시작합니다")
    println(number)  //7
    println(number)  //7


    //lateinit 활용
    val a = lateinitsample()

    println(a.getlateinittext()) //기본값
    a.text = "새로 할당한 값"
    println(a.getlateinittext())  //새로 할당한 값

    //상수 활용
    val Foodcourt = foodcourt()   //foodcourt객체 생성

    Foodcourt.searchprice(foodcourt.FOOD_CREAM_PASTA)  //크림파스타의 가격은 13000원 입니다
    Foodcourt.searchprice(foodcourt.FOOD_PIZZA) //피자의 가격은 15000원 입니다
    Foodcourt.searchprice(foodcourt.FOOD_STEAK)//스테이크의 가격은 25000원 입니다.
}


//상수 활용 클래스
class foodcourt{
    fun searchprice(foodname:String){
        val price = when(foodname)
        {
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }

        println("${foodname}의 가격은 ${price}원 입니다")
    }

    companion object{    //자주 사용되는 상수의 예
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"
    }
}


class lateinitsample(){
    lateinit var text:String

    fun getlateinittext():String{
        if (::text.isInitialized){  //초기화가 되었는지 확인하기 위해서 변수앞에 ::를 붙이고 뒤에는.isinitialized를 붙여준다
            return text
        }
        else{
            return "기본값"
        }
    }
}