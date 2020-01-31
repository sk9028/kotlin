package com.senti.kotlin

/*

--형변환 -> 다른 자료형으로 변환하는 방법
코틀린은 암시적 형변환(자동 형변환)을 지원하지 않는다 **

var a:Int = 54321

var b:Long = a.toLong()  -> 이렇게 to~~~하는 자료형으로 형변환을 시켜야함.


--배열
var intarr = arrayOf(1,2,3,4,5)

var nullarr = arrayOfNulls<int>(5)   -> null로 채워짐 <>안에는 자료형을 넣어주기

--할당된 값 사용방법
intarr[2]=8
println(intarr[4])


 */