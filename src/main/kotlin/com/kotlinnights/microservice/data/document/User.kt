package com.kotlinnights.microservice.data.document

import com.kotlinnights.microservice.data.dto.UserDto
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class User(@Id var id: String?, val name: String, val email: String) {

    constructor(userDto: UserDto) : this(null, userDto.name, userDto.email)
}