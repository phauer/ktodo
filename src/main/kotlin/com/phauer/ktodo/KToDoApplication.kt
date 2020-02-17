package com.phauer.ktodo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KToDoApplication

fun main(args: Array<String>) {
    runApplication<KToDoApplication>(*args)
}
