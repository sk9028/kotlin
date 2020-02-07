package com.senti.kotlin

/*
코틀린에서 문자열을 다루는 법
문자열의 입력과 자료를 다룰때 꼭 알아야 할 기능들은?


 */

fun main(){

    var test3="kotlin.kt"
    var test4="java.java"

    //시작이 java인 것
    println(test3.startsWith("java"))    //false
    println(test4.startsWith("java"))   //true

    //끝문자가.kt인 것
    println(test3.endsWith(".kt"))  //true
    println(test4.endsWith(".kt"))  //false

    //lin이 들어간 문자열인 것
    println(test3.contains("lin"))  //true
    println(test4.contains("lin"))  //false





    //문자열 판별 함수
    val nullString:String?=null
    val emptyString=""
    val blankString=" "
    val normalString="A"

    println(nullString.isNullOrEmpty())   //true
    println(emptyString.isNullOrEmpty())   //true
    println(blankString.isNullOrEmpty())  //false  공백은 빈공간으로 쳐주지 않음
    println(normalString.isNullOrEmpty())  ///false


    //isNullOrEmpty()함수 -> null이거나 empty이면 true를 반환

    println(nullString.isNullOrBlank())   //true
    println(emptyString.isNullOrBlank())   //true
    println(blankString.isNullOrBlank())  //true   공백을 빈공간으로 쳐줌
    println(normalString.isNullOrBlank())  //false

    //isNullOrBlank  -> 비어있도로 되지만 공백문자만 있어도 true를 반환


    // 문자열 다루는 함수
    val test1 = "Test.Kotlin.String"

    println(test1.length)   // 18

    println(test1.toUpperCase())  //소문자 변환
    println(test1.toLowerCase())   //대문자로 변환

    val test2 = test1.split(".") //.을 기준으로 잘라준다.
    println(test2) //[Test, Kotlin, String]

    println(test2.joinToString())   //그냥 합쳐짐  //Test, Kotlin, String
    println(test2.joinToString("-"))   //-문자를 넣어 합쳐짐 Test-Kotlin-String

    println(test1.substring(5..10))  //시작..끝  //Kotlin

}