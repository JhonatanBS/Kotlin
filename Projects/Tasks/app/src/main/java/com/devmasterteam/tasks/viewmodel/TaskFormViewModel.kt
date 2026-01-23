package com.devmasterteam.tasks.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.asLiveData
import com.devmasterteam.tasks.service.repository.PriorityRepository

class TaskFormViewModel(application: Application) : AndroidViewModel(application) {
    private val priorityRepository = PriorityRepository(application.applicationContext)

    val priorityList = priorityRepository.list().asLiveData()
}