package com.senti.kotlin

/*
컬렉션 객체 리스트로 원하는 순서로 목록에 데이터를 담아보자

List?
데이터를 모아 관리

List<>  -> 생성시에 넣은 객체를 대체 추가 삭제 할 수 없음

MutableList<>   -> 생성시에 넣은 객체를 대체 추가 삭제 할 수 있음

리스트를 선언시
listOf(1,2,3) 또는
mutableListOf("A","B","C")

mutableListOf의 추가 삭제가 가능함
요소의 추가 ->  add(데이터) ,  add(인덱스,데이터)
요소의 삭제 ->  remove(데이터),    remove(인덱스)
무작위 섞기 ->  shuffle()
정   렬     ->  sort()



 */

fun main(){

    val a= listOf("사과","딸기","배")
    println(a[1])


    for(fruit in a)
    {
        print("${fruit}:")
    }

    println()

    val b = mutableListOf(6,3,1)
    println(b)   //[6,3,1]

    b.add(4)
    println(b)  //[6,3,1,4]

    b.add(2,8)
    println(b)  //[6,3,8,1,4]

    b.removeAt(1)
    println(b)   //[6,8,1,4]

    b.shuffle()
    println(b)  //[6,1,8,4]

    b.sort()
    println(b)   //[1,4,6,8]
}