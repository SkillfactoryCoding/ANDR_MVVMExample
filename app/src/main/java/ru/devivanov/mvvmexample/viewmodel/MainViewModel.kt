package ru.devivanov.mvvmexample.viewmodel

import androidx.lifecycle.MutableLiveData
import ru.devivanov.mvpexample.data.BaseDataBase
import javax.inject.Inject

class MainViewModel (private val dataBase: BaseDataBase) {
    //Создаем обозреваемый объект, когда в нем будут изменения, все подсписчики будут уведомлены
    val lifeData = MutableLiveData<List<String>>()
    val liveNums = MutableLiveData<Int>()
    //Забираем из базы данных список
    fun getDB() {
        val list = dataBase.returnBase()
        lifeData.postValue(list)
        liveNums.postValue(list.size)
    }
    //Добавляем в бд элемент
    fun putToDB(string: String) {
        dataBase.add(string)
    }
}