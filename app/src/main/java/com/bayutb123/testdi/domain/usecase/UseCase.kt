package com.bayutb123.testdi.domain.usecase

import com.bayutb123.testdi.domain.repository.Repository
import javax.inject.Inject

class UseCase @Inject constructor(
    private val repository: Repository
) {
    suspend fun getName() : String {
        return repository.getName()
    }
}