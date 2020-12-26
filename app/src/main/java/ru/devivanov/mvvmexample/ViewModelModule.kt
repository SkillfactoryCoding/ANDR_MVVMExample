package ru.devivanov.mvvmexample.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import ru.devivanov.mvpexample.data.AppDataBase
import ru.devivanov.mvpexample.data.BaseDataBase
import ru.devivanov.mvvmexample.viewmodel.MainViewModel

@Module
@InstallIn(ActivityComponent::class)
object ViewModelModule {
    @Provides
    fun provideRepo(): BaseDataBase = AppDataBase()

    @Provides
    fun provideViewModel(base: BaseDataBase): MainViewModel = MainViewModel(base)
}