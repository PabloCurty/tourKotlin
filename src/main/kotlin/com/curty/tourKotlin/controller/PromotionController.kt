package com.curty.tourKotlin.controller

import com.curty.tourKotlin.model.Promotion
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.ConcurrentHashMap

//Dependência vem no Spring web
@RestController
class PromotionController {

    //Dependency injection
    //lateinit initialize after
    //AutoWired inject the promotions object
    @Autowired
    lateinit var promotions: ConcurrentHashMap<Long, Promotion>

    //Kotlin -> No methods, only function
    //if I don`t say the return type and no return, they return void
    //if we have return we need to say the return type
    //to return array just insert colchets like in the next line
    @RequestMapping(value = ["/sayHello"], method = arrayOf(RequestMethod.GET))
    fun sayHello(): String{
        return "Hello";
    }

    @RequestMapping(value = ["/promotions"], method = arrayOf(RequestMethod.GET))
    fun getPromotion() = promotions[3]
}