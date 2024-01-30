package com.example.kong

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KongApplication

fun main(args: Array<String>) {
	runApplication<KongApplication>(*args)
}
