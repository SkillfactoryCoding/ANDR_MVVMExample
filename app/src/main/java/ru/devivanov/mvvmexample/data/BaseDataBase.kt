package ru.devivanov.mvpexample.data

interface BaseDataBase {
    fun returnBase(): List<String>
    fun add(string: String)
}