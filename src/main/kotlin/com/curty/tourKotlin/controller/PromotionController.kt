package com.curty.tourKotlin.controller

import com.curty.tourKotlin.model.Promotion
import com.curty.tourKotlin.service.PromotionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.concurrent.ConcurrentHashMap

//Dependência vem no Spring web
@RestController
@RequestMapping(value = ["/promotion"])
class PromotionController {

    //Dependency injection
    //lateinit initialize after
    //AutoWired inject the promotions object, reference on the same name of function promotions in TourKotlinApplication
    //@Autowired
    //lateinit var promotions: ConcurrentHashMap<Long, Promotion>

    @Autowired
    lateinit var promotionService: PromotionService

    //Kotlin -> No methods, only function
    //if I don`t say the return type and no return, they return void
    //if we have return we need to say the return type
    //to return array just insert colchets like in the next line
    @RequestMapping(value = ["/sayHello"], method = arrayOf(RequestMethod.GET))
    fun sayHello(): String{
        return "Hello";
    }

    //functional programing
    //same name of variable in URL localhost:8080/promotions?localFilter=Gramado
    //@RequestMapping(value = ["/promotions"], method = arrayOf(RequestMethod.GET))
    @GetMapping("/promotions")
    fun getAll(@RequestParam(required = false, defaultValue = "") localFilter: String) =
        promotionService.searchByLocal(localFilter)

    //@RequestMapping(value = ["/promotion/{id}"], method = arrayOf(RequestMethod.GET))
    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long) = promotionService.getById(id)

    //@RequestMapping(value = ["/promotion"], method = arrayOf(RequestMethod.POST))
    @PostMapping()
    fun create(@RequestBody promotion: Promotion) = promotionService.create(promotion)

    //@RequestMapping(value = ["promotion/{id}"], method = arrayOf(RequestMethod.DELETE))
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) = promotionService.delete(id)

    //@RequestMapping(value = ["promotion/{id}"], method = arrayOf(RequestMethod.PUT))
    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody promotion: Promotion) =
        promotionService.update(id, promotion)
}