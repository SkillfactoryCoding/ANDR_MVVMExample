package ru.devivanov.mvvmexample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import ru.devivanov.mvpexample.data.AppDataBase
import ru.devivanov.mvpexample.data.BaseDataBase
import ru.devivanov.mvvmexample.viewmodel.MainViewModel

@HiltAndroidApp
class App: Application()