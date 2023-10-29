package com.bayutb123.testdi.di

import com.bayutb123.testdi.data.repository.RepositoryImpl
import com.bayutb123.testdi.domain.repository.Repository
import com.bayutb123.testdi.domain.usecase.UseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideName(): String = "Bayu Tantra"

    @Provides
    fun provideRepository(): Repository {
        return RepositoryImpl()
    }

    @Provides
    fun provideUseCase(repository: Repository) : UseCase{
        return UseCase(repository)
    }
}