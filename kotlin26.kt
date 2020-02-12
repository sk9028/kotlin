package com.senti.kotlin

/*
컬렉션에 사용하는 함수들, 첫번째 이야기

컬렉션함수?
리스트나 셋, 맵과 같은 컬렉션또는 배열에 일반함수 또는 람다함수 형태를 사용하여
for문 없이도 아이템을 순회하며 참조하거나 조건을 걸고 구조의 변경까지 가능한 여러가지 함수를 지칭한다.

 */

fun main(){
    val namelist = listOf("박수영","김지수","김다현","신유나","김지우")

    namelist.forEach{print(it+ " ")}    //namelist 멤버들 출력
    println()

    println(namelist.filter { it.startsWith("김") })  //김씨 멤버들 출력

    println(namelist.map { "이름 : "+it })  //[이름 : 박수영, ~~~~ 이름: 김지우]

    println(namelist.any{it=="김지연"}) //false  김지연이라는 이름이 없어서 false

    println(namelist.all { it.length==3 })   //true 이름이 전부 3글자 이기때문에 true

    println(namelist.none{it.startsWith("이")}) //true 이씨가 하나도 없어서 true

    println(namelist.first{it.startsWith("김")}) //김지수 김씨성을 가진 첫번째 사람을 반환

    println(namelist.last{it.startsWith("김")}) //김지우 김씨 성을 가진 마지막 사람

    println(namelist.count{it.contains("지")})// 2  이름에 지가 들어간 사람의 수를 세는 것
}