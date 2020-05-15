package com.example.kotlinsqlitefootballmatchschedule.presenter

import android.app.Activity
import com.example.kotlinsqlitefootballmatchschedule.database.dao.FavoriteDao
import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel
import com.example.kotlinsqlitefootballmatchschedule.view.FavoriteView

class FavoritePresenter(activity: Activity, private val view: FavoriteView) {
    private var favoriteDao:FavoriteDao = FavoriteDao(activity)
    fun getAllFavorite() {
        view.showLoading()
        val favoriteModelList:List<FavoriteModel> =  favoriteDao.getAll()
        view.showFavorite(favoriteModelList)
        view.hideLoading()
    }
}