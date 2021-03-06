package com.jw.kursakademiaandroida.core.di

import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

const val GRID_SPAN_COUNT = 2

val appModule = module {
    factory { LinearLayoutManager(androidContext()) }
    factory { GridLayoutManager(androidContext(), GRID_SPAN_COUNT) }
    factory { DividerItemDecoration(androidContext(), LinearLayoutManager.VERTICAL) }

}
