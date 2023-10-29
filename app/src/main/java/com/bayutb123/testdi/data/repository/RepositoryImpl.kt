package com.bayutb123.testdi.data.repository

import com.bayutb123.testdi.domain.repository.Repository

class RepositoryImpl : Repository {
    override suspend fun getName(): String {
        return "Bayu Tantra"
    }
}