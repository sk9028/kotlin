package com.senti.kotlin

/*
공용으로 사용할 객체는 오브젝트로 만들자

생성자없이 객체를 직접 만들어내는 object

 */

fun main(){

    println(Counter.count)   //0
    Counter.countup()
    Counter.countup()

    println(Counter.count)   //2

    Counter.clear()

    println(Counter.count)   //0


    var a=foodpoll("짜장")
    var b=foodpoll("짬뽕")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    println("${a.name} ${a.count}")   //2
    println("${b.name} ${b.count}")   //3
    println("총계 ${foodpoll.total}")  //5




}

object Counter{  //오브젝트로 사용된 객체는 치초 사용시 자동으로 생성되며 이후에는 코드 전체에서 공용으로 사용될 수 있다.
    var count = 0

    fun countup(){
        count++
    }

    fun clear(){
        count = 0

    }}


class foodpoll(val name:String){
    companion object{   //클래스 내부에서 오브젝트를 사용하는 것 companion object사용
        var total = 0
    }

    var count = 0

    fun vote(){
        total++
        count++
    }
}