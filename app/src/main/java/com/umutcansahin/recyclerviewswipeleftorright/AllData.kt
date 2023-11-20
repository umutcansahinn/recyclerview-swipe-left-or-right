package com.umutcansahin.recyclerviewswipeleftorright

object AllData {
    private val list = mutableListOf<UserModel>()
    fun getAllData(): MutableList<UserModel> {
        list.apply {
            add(UserModel("ali", 1))
            add(UserModel("kadir", 2))
            add(UserModel("umut", 3))
            add(UserModel("fatma", 4))
            add(UserModel("ayse", 5))
            add(UserModel("ahmet", 6))
            add(UserModel("merve", 7))
            add(UserModel("buse", 8))
            add(UserModel("tülin", 9))
            add(UserModel("busra", 10))
            add(UserModel("ali", 11))
            add(UserModel("kadir", 12))
            add(UserModel("umut", 13))
            add(UserModel("fatma", 14))
            add(UserModel("ayse", 15))
            add(UserModel("ahmet", 16))
            add(UserModel("merve", 17))
            add(UserModel("buse", 18))
            add(UserModel("tülin", 19))
            add(UserModel("busra", 20))
        }
        return list
    }

    fun addNewItem() {
        list.apply {
            add(UserModel("mehmet1",21))
            add(UserModel("mahmut1",22))
            add(UserModel("melike1",23))
            add(UserModel("menekse1",24))
            add(UserModel("meltem1",25))
            add(UserModel("maviş1",26))
            add(UserModel("mülayim1",27))
        }
    }
}