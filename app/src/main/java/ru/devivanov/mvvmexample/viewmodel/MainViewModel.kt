package ru.devivanov.mvvmexample.viewmodel

import androidx.lifecycle.MutableLiveData
import ru.devivanov.mvpexample.data.BaseDataBase

class MainViewModel(val dataBase: BaseDataBase) {
    //Создаем обозреваемый объект, когда в нем будут изменения, все подсписчики будут уведомлены
    val lifeData = MutableLiveData<List<String>>()
    //Забираем из базы данных список
    fun getDB() {
        lifeData.postValue(dataBase.returnBase())
    }
    //Добавляем в бд элемент
    fun putToDB(string: String) {
        dataBase.add(string)
    }
}