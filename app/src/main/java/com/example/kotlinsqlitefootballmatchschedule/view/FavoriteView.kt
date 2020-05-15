package com.example.kotlinsqlitefootballmatchschedule.view

import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel
import com.example.kotlinsqlitefootballmatchschedule.model.Event


interface FavoriteView{
    fun showLoading()
    fun hideLoading()
    fun showNoFavorite()
    fun showFavorite(data: List<FavoriteModel>)
}