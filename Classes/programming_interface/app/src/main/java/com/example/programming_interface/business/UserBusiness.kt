package com.example.programming_interface.business

class UserBusiness {
    fun checkCredentials(email: String, password: String): Boolean {
        return email.isNotEmpty() && password.isNotEmpty()
    }
}