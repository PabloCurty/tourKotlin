package com.curty.tourKotlin.service

import com.curty.tourKotlin.model.Promotion

interface PromotionService {
    fun create(promotion: Promotion)
   // i don't know if the return will be a promotions or null, because it could not be in a DB
    //return promotion optional with a ????
    fun getById(id: Long): Promotion?
    fun delete(id: Long)
    fun update(id: Long, promotion: Promotion)
    fun searchByLocal(local: String): List<Promotion>
}