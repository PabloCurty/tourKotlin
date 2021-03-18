package com.curty.tourKotlin

import com.curty.tourKotlin.model.Promotion
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.util.concurrent.ConcurrentHashMap

@SpringBootApplication
class TourKotlinApplication

fun main(args: Array<String>) {
	runApplication<TourKotlinApplication>(*args)
}

