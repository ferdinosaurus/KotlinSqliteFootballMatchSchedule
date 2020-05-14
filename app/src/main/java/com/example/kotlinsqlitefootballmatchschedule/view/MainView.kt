package com.example.kotlinsqlitefootballmatchschedule.view

import com.example.kotlinsqlitefootballmatchschedule.model.LeagueParcelable


interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showLeagueList(data: List<LeagueParcelable>)


}