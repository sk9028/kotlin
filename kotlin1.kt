package com.senti.kotlin

//오늘은 자료형과 변수를 배워볼게요

/*
주석을
여러줄로
달아볼까요?
 */

/*
var 일반변수
val 상수

클래스에 변수선언시 속성
로컬에 변수선언시 로컬변수

warning  -> 불필요한 구문이 있거나 잠재적 문제가 있을 수 있음
error -> 구문상에 심각한 문제가 생겨 컴파일 자체가 불가능한 상태

코트린은 기본변수에서 null을 허용하지 않으며 또한 변수에 값으 할당하지 않은상태로 사용하면 에러가 남
하지만 자료형 뒤에 물음표를 붙이게 되면 null을 허용하는 nullable 변수로 선언해 줄 수 있다
예시 -> var a:Int? = null


기본 자료형은 자바와 거의 동일
--기본 자료형
var intValue:Int = 1234      -> 10진수
var LongValue:Long = 1234L    -> Long타입의 10진수
var intValueByHex:int = 0x1af  -> 16진수
var intValueByBin:int = 0b10110110  -> 2진수
코틀린은 8진수를 사용하지 않음.

--실수 자료형
var doubleValue:Double = 123.5
var doubleValuewithExp:Double= 123.5e10
var FloatValue:Float = 123.5f

--문자형 -> 작은 따옴표로 감싸서 표시, 특수문자 지원
var charvalue:Char = 'a'
varkoreancharvalue:Char = '가'

--논리형
var booleanvalue:Boolean = true 또는 false

--문자열  -> 따옴표 내에 문자열을 써주면 됨.
val stringvalue = "one line striing test"

val multilinestringvalue = """"multiline       -> 여러줄의 문자열은 따옴표 3개 붙이면 됨 줄바꿈이나 특수문자까지 그대로 문자열로 사용가능
string
test"""
 */


fun main(){
    //println("끝에 세미콜론을 붙이지 않습니다.")
    var a: Int =123
    println(a)
}



