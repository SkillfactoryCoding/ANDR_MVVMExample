package ru.devivanov.mvvmexample.di

import dagger.Component
import ru.devivanov.mvvmexample.di.modules.ViewModelProviderModule
import ru.devivanov.mvvmexample.view.MainActivity
import javax.inject.Singleton

//Указываем к какому скоупу он относится
@Singleton
//Указываем, что это компонент
@Component(
    //Передаем какие модуле будут жить в этом компоненте
    modules = [
        ViewModelProviderModule::class
    ]
)
interface AppComponent {
    //Укзываем метода, который будет инжектить зависимости в определнное место
    fun inject(mainActivity: MainActivity)
}