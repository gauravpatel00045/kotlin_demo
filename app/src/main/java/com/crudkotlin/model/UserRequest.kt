package com.crudkotlin.model

data class UserRequest(
    val email: String,
    val password: String,
    val username: String
)
