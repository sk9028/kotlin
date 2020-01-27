package com.senti.kotlin

fun main(){
    //1.배열
    //2.loop 반복
    //3. 캐스팅(가볍게)


    //1. 배열 = {"","",""}  어떠한 갑들이 나열돼있는 것

    var arr1 = listOf("1","2")  //수정불가능 리스트
    var arr2 = mutableListOf("1","2") //수정가능 리스트 mutable이 붙으면 수정가능!!

    //2. 반복문 (향상된 반복문)

    for(item in arr1){
        println(item)    //결과는 1,2
    }
    for((index, item) in arr1.withIndex()){
        println("$index, $item")      //withindex는 몇번째 결과값인지 알고싶을 때 사용 그래서 결과는  0, 1 / 1, 2
    }

    //3. 캐스팅 오브젝트 -> 자바의 최상위 오브젝트 개념이 코틀린은 Any로 사용  -- auto casting
    var hello: Any = "hello"
    if(hello is String){
        var str: String = hello   //if문으로 들어오면 자동으로 코틀린은 캐스팅을 해준다
    }

}