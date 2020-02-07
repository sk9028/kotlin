package com.senti.kotlin

/*
함수의 argument를 다루는 방법과 infix 함수

오버로딩?
함수의 이름이 같아도 함수의 파라미터의 자료형과 갯수가 다르다면 서로 다르게 동작가능


default arguments?
파라미터를 받아야 하는 함수이지만 별다른 파라미터가 없더라도 기본값으로 동작할 떄 사용

named arguments?
노트북, 30, 학교 를 넣어야하는데 중간에 30을 기본값으로 하고싶을 때 사용

variable number of arguments(vararg)?  (배열처럼 for문으로 참조가능)
같은 자료형을 개수에 상관없이 패러미터로 받고싶을 때 사용

infix function?
마치 연산자처럼 쓸수 있는 함수

 */


fun main(){
    //infix function사용
    println(6 multiply 4) //좌측에 붙은 6이 infix함수가 적용되는 객체 자신 즉 this에 해당하고
                        //우측에 붙은 4가 패러미터인 x에 해당합니다.
    println(6.multiply(4)) //일반 클래스 함수처럼 사용가능함.
    //둘다 결과값은 24


    //vararg 사용
    sum(1,2,3,4)  //10

    //default arguments  사용
    deliveryitem("짬뽕")  // 짬뽕, 1개를 집에 배달하였습니다. 파라미터를 따로 지정하지 않아서 기본값으로 1과 집이 들어감
    deliveryitem("책",3)   //책, 3개를 집에 배달하였습니다. 주소를 지정하지않아서 집으로 들어감
    deliveryitem("노트북",30,"학교")//노트북, 30개를 학교에 배달하였습니다.

    //named arguments사용
    deliveryitem("선물",destination = "친구집") //중간에 count는 기본값으로 할당 할 수 있도록 destination을 named arguments로 지정해준다.**
    //선물 1개를 친구집에 배달하였습니다.

    //오버로딩 사용
    read(7)
    read("감사합니다.")
}

//오버로딩 사용함수
fun read(x:Int){
    println("숫자 $x 입니다")   //같은 read함수라도 이 함수는 정수형 read함수
}

fun read(x:String){
    println("문자열 $x 입니다.")  //이 함수는 문자열 read함수로 다르게 사용가능
}

//defalut arguments 사용함수
fun deliveryitem(name:String, count:Int =1, destination:String = "집"){  //파라미터를 특정하게 지정하지 않아도
                                                                        //count는 1, destination은 집으로 default설정 가능
    println("${name},${count}개를 ${destination}에 배달하였습니다")
}

//vararg 사용함수
fun sum(vararg numbers:Int){
    var sum = 0

    for(n in numbers){
        sum = sum+n
    }

    print(sum)
}

//infix function사용
infix fun Int.multiply(x:Int):Int = this * x     //함수 이름은 infix함수가 적용될 자료형.이름으로 지정