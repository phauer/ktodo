package com.phauer.ktodo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KtodoApplication

fun main(args: Array<String>) {
    runApplication<KtodoApplication>(*args)
}
