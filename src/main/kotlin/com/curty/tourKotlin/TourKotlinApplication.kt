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

//Create a hashmap to simulate a BD of promotions for now
//[{1,{Promotion(1, name, etc...)}},{2,{Promotion(3,name2, etc...)}}, etc...]