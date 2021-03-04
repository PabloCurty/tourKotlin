package com.curty.tourKotlin

import com.curty.tourKotlin.model.Promotion
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.util.concurrent.ConcurrentHashMap

@SpringBootApplication
class TourKotlinApplication{
	companion object{
		val initialPromotions = arrayOf(
			Promotion(
				1, "Traveling marvelous", "Cancun",
				true, 7, 4299.99),
			Promotion(
				2, "Radical travel, abseiling and climbing", "New Zealand",
				false, 12, 12299.00),
			Promotion(
				3, "Spiritual Traveling", "Thailand",
				false, 17, 15099.50),
			Promotion(
				4, "Family Travel", "Gramado",
				true, 5, 3500.00)
		)
	}
	//only one line and return, we can put with equal like a variable
	//Bean, when application initialize will be able in all classes, do not necessary put the word new
	@Bean
	fun promotions() = ConcurrentHashMap<Long, Promotion>(initialPromotions.associateBy(Promotion::id))
}

fun main(args: Array<String>) {
	runApplication<TourKotlinApplication>(*args)
}

//Create a hashmap to simulate a BD of promotions for now
//[{1,{Promotion(1, name, etc...)}},{2,{Promotion(3,name2, etc...)}}, etc...]