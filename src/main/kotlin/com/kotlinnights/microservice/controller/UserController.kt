package com.kotlinnights.microservice.controller

import com.kotlinnights.microservice.data.document.User
import com.kotlinnights.microservice.data.dto.UserDto
import com.kotlinnights.microservice.data.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
class UserController(@Autowired val userRepository: UserRepository) {

    @GetMapping("/user/{id}")
    fun getUser(@PathVariable id: String): User {
        val optional = userRepository.findById(id)
        return optional.get()
    }

    @PostMapping("/user")
    fun saveUser(@RequestBody userDto: UserDto) {
        userRepository.save(User(userDto))
    }


}