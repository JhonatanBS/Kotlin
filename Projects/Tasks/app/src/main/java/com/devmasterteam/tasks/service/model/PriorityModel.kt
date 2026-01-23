package com.devmasterteam.tasks.service.model

import com.google.gson.annotations.SerializedName

data class PriorityModel (

    @SerializedName("Id")
    val id: Int,

    @SerializedName("Description")
    val description: String
)