package com.example.kotlinsqlitefootballmatchschedule.view

import com.example.kotlinsqlitefootballmatchschedule.model.Event
import com.example.kotlinsqlitefootballmatchschedule.model.Team

interface EventDetailView{
    fun showLoading()
    fun hideLoading()
    fun showNoEvent()
    fun showDetailEvent(data: Event)
    fun showDetailHome(data: Team)
    fun showDetailAway(data: Team)

}