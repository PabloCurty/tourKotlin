package com.curty.tourKotlin.model

//variable that not change, it`s common in functional languages, declare VAL
//variable change, declare VAR
data class Promotion(
    val id: Long,
    val description: String,
    val local: String,
    val isAllInclusive: Boolean,
    val numberOfDays: Int,
    val price: Double

    //Kotlin generate all getters, setters, equals, hashcode and to string for this class
)