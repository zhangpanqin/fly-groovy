package com.mflyyou.groovy

def closureWithOneArg = { str -> println str }
// 执行闭包
closureWithOneArg("张小凡")


def dependencies(Closure<String> closure) {
    def project = "111"
    println "模拟 gradle 配置"
    closure(project)
    println "模拟 gradle 配置"
}

dependencies({ str -> println str })
dependencies(closureWithOneArg)
dependencies { str -> println str }


def task(String name, Closure<String> closure) {
    closure(name)
}

task('aaa', { str -> println(str) })
task('bbb') { str -> println(str) }