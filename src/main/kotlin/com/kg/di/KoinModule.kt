package com.kg.di

import com.kg.repository.HeroRepository
import com.kg.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}