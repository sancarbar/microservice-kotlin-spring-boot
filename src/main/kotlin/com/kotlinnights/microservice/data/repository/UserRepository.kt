package com.kotlinnights.microservice.data.repository

import com.kotlinnights.microservice.data.document.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User, String> {

    fun findUserByEmail(email: String)

}