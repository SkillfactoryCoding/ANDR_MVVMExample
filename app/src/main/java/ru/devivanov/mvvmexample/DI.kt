package ru.devivanov.mvvmexample

import org.koin.dsl.module
import ru.devivanov.mvpexample.data.AppDataBase
import ru.devivanov.mvpexample.data.BaseDataBase
import ru.devivanov.mvvmexample.viewmodel.MainViewModel

object DI {
    val mainModule = module {
        single<BaseDataBase> { AppDataBase() }
        single { MainViewModel(get()) }
    }
}