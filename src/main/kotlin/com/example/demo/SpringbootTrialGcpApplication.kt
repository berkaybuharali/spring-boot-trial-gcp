package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class SpringbootTrialGcpApplication {

    @GetMapping("/a")
    fun getSth() = "Hi"
}
    fun main(args: Array<String>) {
        SpringApplication.run(SpringbootTrialGcpApplication::class.java, *args)
    }

