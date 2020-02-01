package com.senti.kotlin

/*
반복문과 증감연산자

조건형 반복문 -> while , do...while문
while문은 조건을 판별하고 반복하지만
do...while문은 최초 한번은 조건없이 do에서 구문을 실행한 후 while로 조건을 판별한다.

범위형 반복문 -> for
for문은 기본적으로 값을 1씩 증가시키며 반복하게 된다.



증감연산자 ++a , a++ 변수의 값을 1증가
감소연산자는 --를 붙인다.


 */

fun main(){

    var a= 0

    while(a<5){
        println(a++)
    }

    do {
        println(a++)
    }while (a<5)


    for(i in 0..9){
        print(i)        // -> 0123456789
    }

    for(i in 0..9 step 3){
        print(i)        // -> 0369
    }

    for(i in 9 downTo 0){
        print(i)        //->9876543210
    }

    for(i in 9 downTo 0 step 3){
        print(i)        //->9630
    }

    for(i in 'a'..'e'){
        print(i)        //->abcde
    }
}