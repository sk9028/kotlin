package com.senti.kotlin

/*
흐름제어와 논리연산자

return -> 함수를 종료하고 값을 반환

break , continue
break-> 즉시 반복문을 종료하고 다음구문으로 넘어가라
continue -> 다음 반복으로 넘어가라

label
-> 다중 반복문에서 한번에 벗어날 수 있도록 코틀린에서 추가된 기능
30번 코드줄에서 loop@라고 loop는 자기가 설정한 이름이고 @(골뱅이)기호를 사용해서
어느 반복문으로 빠져나올 것인지 반복문 앞에다가 붙여주고
빠져나올 조건문 뒤에 break@loop 이런식으로 붙여주면 조건이 참일때 중복 반복에서 빠져나올 수 있다.



논리연산자
&&,||,!
&& -> 둘다 true일때 true
|| -> 둘중 하나라도 true면 true
! -> 참이면 거짓 거짓이면 참
 */

fun main(){
    for (i in 1..10){
        if(i==3)break
        println(i)  //결과 1,2
    }

    for (i in 1..10){
        if(i==3)continue
        println(i)  //결과 1,2,4,5,6,7,8,9,10  3빼고 다나옴
    }


    loop@for(i in 1..10){
        for (j in 1..10){
            if (i==1&&j==2)break@loop
            println("i: $i j: $j")

        }
    }


    println(true&&false)    //false
    println(true||false)    //true
    println(!true)          //false
    println(!false)         //true
}