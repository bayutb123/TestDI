package com.bayutb123.testdi.domain.repository

interface Repository {
    suspend fun getName():String
}