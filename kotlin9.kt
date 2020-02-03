package com.senti.kotlin

/*
클래스의 상속으로 속성과 기능을 확장

상속 -> 기존 클래스를 확장하여 코드관리를 편리하게 하기 위함.

부모 -> 수퍼
자식 -> 서브

상속받을 수 있는 클래스로 만들어주려면 클래스 앞에 open 키워드를 붙여줘야 함.
 */

fun main(){

    var a= animal("별이",5,"개")
    var b = dog("별이",5)
    var c= cat("야옹이",4)


    a.introduce()  // 저는 개 별이이고, 5살 입니다.
    b.introduce()  // 저는 개 별이이고, 5살 입니다.
    c.introduce() //저는 고양이 야옹이이고, 4살 입니다.

    b.bark()    //멍멍
    c.bark()    //야옹야옹
}

open class animal(var name:String, var age:Int, var type:String){
    fun introduce(){
        println("저는 ${type} ${name}이고 ${age}살 입니다.")
    }
}

class dog(name:String , age: Int):animal(name,age,"개"){  // : 뒤는 상속받는 클래스의 정보를 입력

    fun bark(){   // dog크래스 에서만 사용 가능한 함수.
        println("멍멍")
    }
}

class cat(name: String,age: Int):animal(name,age,"고양이"){
    fun bark(){
        println("야옹야옹")
    }
}