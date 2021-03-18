package com.curty.tourKotlin.model

import com.fasterxml.jackson.annotation.JsonFormat
import java.util.*

data class JSONResponse (val message: String,
                         @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
                         val date: Date)