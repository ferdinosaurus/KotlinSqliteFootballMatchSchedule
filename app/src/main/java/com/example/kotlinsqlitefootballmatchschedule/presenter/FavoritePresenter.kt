package com.example.kotlinsqlitefootballmatchschedule.presenter

import android.app.Activity
import com.example.kotlinsqlitefootballmatchschedule.database.dao.FavoriteDao
import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel
import com.example.kotlinsqlitefootballmatchschedule.view.FavoriteView

class FavoritePresenter(private val activity: Activity,private val view: FavoriteView) {
    var favoriteDao:FavoriteDao = FavoriteDao(activity)
    fun getAllFavorite() {
        view.showLoading()
        var favoriteModelList:List<FavoriteModel> =  favoriteDao.getAll();
        view.showFavorite(favoriteModelList)
        view.hideLoading()
    }

    fun getFavoriteByStatus(status: String?) {
        view.showLoading()
        var favoriteModelList:List<FavoriteModel> =  favoriteDao.getAllByStatus(status as String)
        view.showFavorite(favoriteModelList)
        view.hideLoading()
    }
    
}