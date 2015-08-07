package com.danieldisu

import kotlin.platform.platformStatic

public class Application{
    companion object{
        platformStatic public fun main(args: Array<String>) {
            println(sayHello("kotlin enthusiast"))
        }
    }
}

fun sayHello(name: String): String {
    return "Hello fellow $name"
}
