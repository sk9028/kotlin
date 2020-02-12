package com.senti.kotlin
import kotlin.coroutines.*


/*
코루틴을 통한 비동기 처리

코루틴을 사용할때는 import kotlinx.coroutines.*을 임포트 해야함

globalscope
프로그램 어디서나 제어, 동작이 가능한 기본 범위

coroutinescope
특정한 목적의 dispatcher를 지정하여 제어 및 동작이 가능한 범위

Dispatchers.Defalut -> 기본적인 백그라운드 동작
Dispatchers.IO -> I/O에 최적화 된 동작
Dispatchers.Main -> 메인 스레드에서 동작

launch 와 async의 차이?
반환값이 있는지의 여부
launch는 반환값이 없는 job 객체
async는 반환값이 있는 deffered 객체
둘다 람다함수의 형태를 가짐



delay(milisecond:Long)
루틴을 잠시 대기시키는 함수

job.join()
job의 실행이 끝날때까지 대기하는 함수

deferred.await()
defferred의 실행이 끝날때까지 대기하는 함수
또한 deferred의 결과도 반환함

세 함수들은 코루틴 내부 또는 runBlocking{}과 같은
루틴의 대기가 가능한 구문 안에서만  동작이 가능함

withTimeoutOrNull()함수
제한시간안에 수행되면 결과값을 아니면 NULL값을 반환하는 것
이 함수도 runBlocking 안에서만 동작함


 */

import kotlinx.coroutines.*

fun main() {
    val scope = GlobalScope

    scope.launch {
        for(i in 1..5)
        {
            println(i)
        }
    }
}
