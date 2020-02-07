package com.senti.kotlin

/*
좀 특이한 클래스? Data Class 와 Enum Class

특별한 기능이나 형태를 가진 클래스

data class?
데이터를 다루는 데에 최적화된 클래스 5가지 기능을 내부적으로 자동으로 생성해준다

1. 내용의 동일성 판별 equals()의 자동구현
2. 객체의 내용에서 고유한 코드를 생성하는 hashcode()의 자동구현
3. 포함된 속성을 보기쉽게 나타내는 toString()의 자동구현
4. 객체를 복사하여 똑같은 내용의 새 객체를 만드는 copy()의 자동구현
5. 속성을 순서대로 반환하는 componentX()의 자동구현


enumerated type?
즉 열거형의 준말
enum 클래스내에 상태를 구분하기 위해서 쓰임

 */

fun main(){

    //enum클래스 활용
    var state = state.Sing
    println(state)   //Sing

    state=com.senti.kotlin.state.Sleep
    println(state.isSleeping())  //true

    state=com.senti.kotlin.state.Eat
    println(state.message)  //밥을 먹습니다


    //데이터 클래스의 리스트로 활용
    val list = listOf(data("보영",212),data("루다",306),data("아린",618))

    for((a,b)in list){  //a와 b를 순서대로 값을 불러오게 된다. e나 f나 아무거나 해도 상관없음
        //a가 가리키는 것은 name이고 b가 가리키는 것은 id임
        println("${a},${b}") //리스트에서 각각의 data 객체를 참조하여 보영,212  루다,306  아린, 618 이 출력
    }

    //데이터 클래스의 기능활용
    val a = general("보영",212)
    println(a==general("보영",212))   //false
    println(a.hashCode())   //681842940
    println(a)  //general@28a418fc

    val b = data("루다",306)

    println(b == data("루다",306)) //true
    println(b.hashCode())   //46909878
    println(b) //data(name=루다, id=306)

    println(b.copy()) //data(name=루다, id=306)
    println(b.copy("아린")) //data(name=아린, id=306)
    println(b.copy(id=618)) //data(name=루다, id=618)
}

//데이터 클래스 활용 함수
class general(val name:String, val id:Int)

data class data(val name:String, val id:Int)

//enum 클래스 활용 함수
enum class state(val message:String){  //열거형 클래스 이기때문에 콜론으로 나눠줘야함 함수를 추가하려면 마지막
                                        //열거자료에 세미콜론을 붙이면 된다.
    Sing("노래를 부릅니다"),
    Eat("밥을 먹습니다"),
    Sleep("잠을 잡니다");

    fun isSleeping() = this == state.Sleep
}

