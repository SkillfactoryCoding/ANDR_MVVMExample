package ru.devivanov.mvvmexample

import android.app.Application
import ru.devivanov.mvpexample.data.AppDataBase
import ru.devivanov.mvpexample.data.BaseDataBase
import ru.devivanov.mvvmexample.viewmodel.MainViewModel

class App: Application() {
    //Переменные для наших компонентов
    lateinit var dataBase: BaseDataBase
    lateinit var mainViewModel: MainViewModel

    override fun onCreate() {
        super.onCreate()
        instance = this
        //Инициализируем наши компоненты
        dataBase = AppDataBase()
        mainViewModel = MainViewModel(dataBase)
    }
    //Здесь у нас экземпляр нашего класса Application через который у нас будет доступ к нашим компонентам
    companion object {
        lateinit var instance: App
            private set
    }
}