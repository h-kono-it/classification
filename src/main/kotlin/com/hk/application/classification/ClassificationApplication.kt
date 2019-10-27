package com.hk.application.classification

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ClassificationApplication

fun main(args: Array<String>) {
	runApplication<ClassificationApplication>(*args)
}
