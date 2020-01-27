package com.senti.kotlin

fun main(){

    //map - key,value 짝  JSON   name -> senti
    //{"name":"senti"} 왼쪽이 키 오른쪽에 값  json의 경우

    var map1 = mapOf(Pair("name","senti"))  //코틀린에서 키와 값 만들기 mutable과 다르게 타입이 자동으로 정해짐

    var map2 = mutableMapOf<String,String>() //type을 따로 정할수 있음 대신 키와 값을 따로 put해줘야 함
    map2.put("name","senti")
    map2.put("age","1") //값은 여러개 넣을 수 있음

    //map1.put - 즉 map1은 수정을 할 수가 없다. 수정하려면 mutable사용하기

    for(map in map2){
        println(map) //결과 -> name=senti , age=1
        map2.keys // 키들의 결과값만 출력 -> name, age
        map2.values // 값들만 출력 -> senti , 1
    }

    for(map in map1){
        println(map)
        map.key // 키 값만 출력  -> name
        map.value //값만 출력  -> senti
    }


}