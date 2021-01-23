package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/testing")
class TestController {

    @Get
    fun helloWorldMap(): Map<String, String> {
        return mapOf("hello" to "world")
    }

}