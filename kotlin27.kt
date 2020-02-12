package com.senti.kotlin

/*
컬렉션에 사용하는 함수들, 두번째 이야기

associateBy
아이템에서 키를 추출하여 맵으로 변환하는 함수

groupBy
키가 같은 아이템 끼리 배열로 묶어 맵으로 만드는 함수

partition
아이템에 조건을 걸어 두개의 컬렉션으로 나누어 줌
참인지 거짓인지에 따라 두분류로 파티션을 나눠준다.

flatMap
아이템마다 만들어진 컬렉션을 합쳐서 반환하는 함수

getOrElse
인데스 위치에 아이템이 있으면 아이템을 반환하고
아닌 경우 지정한 기본값을 반환하는 함수

zip    -> 컬렉션a zip 컬렉션b 의 형태로 사용
컬렉션 두 개의 아이템을 1:1로 매칭하여 새 컬렉션을 만들어줌
 */

fun main(){
    //flatMap,getOrElse,zip 활용
    val numbers= listOf(-3,7,2,-10,1)

    println(numbers.flatMap { listOf(it*10,it+10) })  //-3에 대한 곱하기 10 , 더하기 10 , 7에대한 곱하기 10 더하기 10,~~~~출력

    println(numbers.getOrElse(1){50}) //7   1번째 위치는 7이기때문에 7출력
    println(numbers.getOrElse(10){50})//50   10번째 위치는 없기때문에 defalut값 50으로 설정한 값 출력

    val names = listOf("A","B","C","D")

    println(names zip numbers)   //[(A, -3),(B, 7)~~~] names과 numbers를 합쳐서 새 컬렉션으로 만듬


    //associate,Bygroup,Bypartition 활용
    data class person(val name : String, val birthyear : Int)

    val personlist = listOf(person("유나",1992),
        person("조이",1996),
        person("츄",1999),
        person("유나",2003))

    println(personlist.associateBy { it.birthyear })  //년도를 키로잡고 그 키에 해당하는 값을 출력

    println(personlist.groupBy { it.name })  // 유나끼리 묶임 , 키가 같은 아이템 끼리 배열로 묶어서 출력

    val(over98,under98) = personlist.partition { it.birthyear > 1998 }
    println(over98)  //98년도보다 크면 over98로
    println(under98) //작으면 under98로
}