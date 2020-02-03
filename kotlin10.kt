package com.senti.kotlin

/*
오버라이딩과 추상화로 객체구조를 유연하게

상속시 기본적으로 수퍼 클래스에서의 함수를 서브클래스에서 사용 못하게 돼있다.
하지만 오버라이딩으로 사용하게 가능

수퍼클래스에서 open 이 붙은 함수는 서브클래스에서 override를 붙여 재구현 가능하다*****

추상화 == abstraction
선언부만 있고 기능이 구현되지 않음 추상함수이다.

추상함수를 포함한 추상클래스
추상클래스는 단독 클래스로 사용이 불가능하여서 반드시 서브클래스를 구현하여 상속받아서 사용해야함.****



인터페이스 -> 속성, 추상함수, 일반함수를 가질 수 있는 기능
추상함수는 생성자를 가질 수 있는 방면
인터페이스는 생성자를 가질 수 없으며

인터페이스에서 구현부가 있는 함수 -> open함수로 간주
인터페이스에서 구현부가 없는 함수 -> abstract 함수로 간주

별도의 키워드가 없어도 포함된 모든 함수를 서브클래스에서 구현 및 재정의가 가능

또한 한번에 여러 인터페이스를 상속받을 수 있으므로 좀 더 유연한 설계가 가능하다.


총정리
오버라이딩 -> 이미 구현이 끝난 함수의 기능을 서브클래스에서 변경해야 할때
추상화 -> 형식만 선언하고 실제 구현은 서브클래스에서
인터페이스 -> 서로 다른 기능들을 여러개 물려주어야 할때 유용한 기능
 */

fun main(){


    var t = tiger()   //오버라이딩 사용 클래스
    var r = rabbit()  //추상화 사용 클래스
    var d = Dog()   //인터페이스 사용 클래스

    t.eat()  //고기를 먹습니다.(오버라이딩를 통해서 음식을 먹습니다에서 고기를 먹습니다로 변경)

    r.eat()  //당근을 먹습니다.
    r.sniff() //킁킁

    d.eat()
    d.run()

}

open class animal1{
    open fun eat(){
        println("음식을 먹습니다.")
    }
}

class tiger : animal1(){
    override fun eat() {
        println("고기를 먹습니다.")
    }
}


abstract class animal2(){    //추상클래스
    abstract fun eat()   //추상화로 선언된건 {}괄호 안에 내용을 넣을 수 없다.
    fun sniff(){
        println("킁킁")
    }
}

class rabbit : animal2(){
    override fun eat() {
        println("당근을 먹습니다.")
    }
}


interface runner{
    fun run()
}

interface eater{
    fun eat(){
        println("음식을 먹습니다.")
    }
}

class Dog:runner,eater{   //인터페이스 클래스들을 Dog클래스에 합친 것
    override fun run() {
        println("우다다다 뜁니다.")
    }

    override fun eat(){
        println("허겁지겁 먹습니다.")
    }
}