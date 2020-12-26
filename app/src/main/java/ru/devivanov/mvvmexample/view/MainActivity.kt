package ru.devivanov.mvvmexample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import ru.devivanov.mvvmexample.App
import ru.devivanov.mvvmexample.R
import ru.devivanov.mvvmexample.viewmodel.MainViewModel
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    //В этой переменной будет хранится ссылка на экземпляр нашей ViewModel из класса App
    @Inject lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Подписываемся на изменения
        mainViewModel.lifeData.observe(this) {list ->
            var string = ""
            list.forEach {
                string += it
            }
            text_view.text = string
        }
        mainViewModel.liveNums.observe(this) {
            text_nums.text = it.toString()
        }
        //Этой кнойпкой будем забирать из базы списко
        button_get.setOnClickListener {
            mainViewModel.getDB()
        }
        //Этой кнопкой будем класть в базу строку
        button_put.setOnClickListener {
            val text = edit_text.text.toString()
            mainViewModel.putToDB(text)
        }
    }
}