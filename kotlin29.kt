package com.senti.kotlin

/*
이보다 쉬운 비트연산 강좌는 없었다.

비트연산?
정수형을 10진법 -> 2진법으로 으로 바꿔주는 것
주로 플래그 값을 처리하거나
네트워크등에서 프로토콜의 데이터양을 줄이기위해 사용

0101010101010    맨앞에 최상위 비트 맨끝이 최하위 비트
최상의 비트가 0이면 양수 1이면 음수
 */


fun  main(){

    var bitdata:Int = 0b10000

    bitdata = bitdata or(1 shl 2)
    println(bitdata.toString(2))  //10100

    var result = bitdata and(1 shl 4)
    println(result.toString(2))   //10000

    println(result shr 4)   //1

    bitdata = bitdata and((1 shl 4).inv())
    println(bitdata.toString(2))  //100

    println((bitdata xor(0b10100)).toString(2)) //10000
}