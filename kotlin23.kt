package com.senti.kotlin

/*
중첩클래스와 내부클래스 - 왜 클래스안에 클래스를 넣는가?

중첩 클래스 -> Nested Class
하나의 클래스가 다른 클래스의 기능과 강하게 연관되어 있다는 의미를 전달하기 위함
**실질적으로 서로 내용을 공유할 수 없는 별개의 클래스

사용시에는
외부클래스이름.중첩클래스이름 으로 사용
class outer{
    class nested{

    }
}
outer.nested()  -> 이런식으로 사용

내부 클래스 -> inner class
외부 클래스의 객체가 있어야만 생성과 사용이 가능한 클래스입니다.
**외부 클래스의 속성과 함수의 사용이 가능

 */

fun main(){

    outer.nested().introduce()   // nested class

    val outer = outer()
    val inner = outer.inner()

    inner.introduceinner()  //inner class
    inner.introduceouter()  //outer class

    outer.text = "changed outer class"
    inner.introduceouter()  //changed outer class

}

class outer{
    var text = "outer class"

    class nested{
        fun introduce(){
            println("nested class")
        }
    }

    inner class inner{
        var text = "inner class"

        fun introduceinner(){
            println(text)
        }

        fun introduceouter(){
            println(this@outer.text)  //외부클래스를 접근하기 위해서 this@를 사용
        }
    }
}