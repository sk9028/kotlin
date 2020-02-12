package com.senti.kotlin

/*
리스트에 이은 컬렉션 2탄 Set과 Map을 사용해보자
둘다  mutable 사용가능

set?
리스트와 달리 정렬되지 않으며 중복이 허용되지 않는 컬렉션입니다.
인덱스로 위치를 지정하여 객체를 참조할 수는 없으며
contains로 객체가 set안에 존재하는지만 확인하는 식으로만 사용한다.

요소의 추가 -> add(데이터)
 삭     제  -> remove(데이터)

map?
객체를 넣을 때 그 객체를 찾아낼 수 있는 key를 쌍으로 넣어주는 컬렉션입니다.
key와 value
고유한 키를 통해 객체를 참조하는 특징을 가지고 있다.
또한 같은키에 다른 값을 넣게되면 기존의 객체가 대체되니 주의해서 사용해야 한다.

요소의 추가 -> put(키,값)
 삭     제  -> remove(키)
 */

fun main(){
    //map의 활용
    val b = mutableMapOf("레드벨벳" to "음파음파",    //키와 밸류를 to로 이어주는 것을 볼 수 있다.
        "트와이스" to "fancy",
        "ITZY" to "icy")

    for(entry in b)
    {
        println("${entry.key},${entry.value}")    //레드벨벳 : 음파음파 ,트와이스 : fancy , ITZY : icy
    }

    b.put("오마이걸","번지")
    println(b)  //{레드벨벳=음파음파 ~~~오마이걸=번지}

    b.remove("ITZY")
    println(b)  //잇지 삭제되고 나머지 모든것 출력

    println(b["레드벨벳"]) //음파음파

    //set 활용
    val a= mutableSetOf("귤","바나나","키위")

    for(item in a)
    {
        println("${item}")    // 귤 바나나 키위
    }
    a.add("자몽")
    println(a)   // [귤,바나나,키위,자몽]

    a.remove("바나나")
    println(a) //[귤, 키위, 자몽]

    println(a.contains("귤")) //true

}