package com.jw.kursakademiaandroida.core.di

import androidx.room.Room
import com.jw.kursakademiaandroida.core.data.AppDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dbModule = module {
    single {
        Room.databaseBuilder(androidContext(), AppDatabase::class.java, "room-database").build()
    }
}