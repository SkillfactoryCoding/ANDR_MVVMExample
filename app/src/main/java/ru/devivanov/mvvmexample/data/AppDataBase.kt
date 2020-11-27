package ru.devivanov.mvpexample.data

class AppDataBase : BaseDataBase {
    private val db = mutableListOf(
        "one",
        "two",
        "three"
    )
    //Возвращает список из базы целиком
    override fun returnBase(): List<String> {
        return db
    }
    //Добавляем один элемент в базу
    override fun add(string: String) {
        db.add(string)
    }
}