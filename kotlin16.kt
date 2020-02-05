package com.senti.kotlin

import java.util.*

/*
익명객체와 옵저버 패턴으로 이벤트를 받아보자.

이벤트가 일어나는 곳을 감시하는 감시자의 역할을 만든다고 하여 옵저버 라고 부른다

안드로이드의 예로는
키의 입력
터치의 발생
데이터의 수신 등
함수로 직접 요청하진 않지만 시스템, 루틴에 의해서 즉각적으로 처리가능하게 만든걸 옵저버 패턴이라고 한다.

자바로 따지면 리스너라고 생각하면 된다.

 */

fun main(){

    EventPrinter().start()
}

interface EventListener{
    fun onEvent(count:Int)
}

class counter(var listener: EventListener){   //5의 배수마다 이벤트가 발생하도록 도와주는 함수

    fun count(){
        for(i in 1..100){
            if(i%5==0)listener.onEvent(i)
        }
    }
}

class EventPrinter: EventListener{     //5의 배수를 출력해주기 위한 함수 ,일반 클래스에 이벤트 리스너 상속받는 방법
    override fun onEvent(count: Int){
        print("${count}-")  //5-10-15-20-25....
    }

    fun start(){
        val counter = counter(this)
        counter.count()
    }
}


class EventPrinter{        //익명 객체 생성방법
    fun start(){
        val counter = Counter(object :EventListener{
            override fun onEvent(count: Int){
                print("${count}-")    //5-10-15-20...
            }
        }
        }
    }
}