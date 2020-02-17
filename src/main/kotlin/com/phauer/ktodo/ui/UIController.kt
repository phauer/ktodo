package com.phauer.ktodo.ui

import kotlinx.html.body
import kotlinx.html.div
import kotlinx.html.h1
import kotlinx.html.head
import kotlinx.html.html
import kotlinx.html.link
import kotlinx.html.script
import kotlinx.html.stream.appendHTML
import kotlinx.html.title
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UIController {

    @RequestMapping("/")
    fun getUI(): String {
        return buildString {
            appendln("<!DOCTYPE html>")
            appendHTML().html {
                head {
                    title("KToDo")
                    script { src = "https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" }
                    link(href = "https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css", type = "text/css", rel = "stylesheet")
                }
                body {
                    div(classes = "container mt-3") {
                        div(classes = "jumbotron") {
                            h1(classes = "title") { +"KToDo" }
                        }
                    }
                }
            }
        }
    }

}