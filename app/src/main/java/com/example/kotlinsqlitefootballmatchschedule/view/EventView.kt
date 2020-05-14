package com.example.kotlinsqlitefootballmatchschedule.view

import com.example.kotlinsqlitefootballmatchschedule.model.Event


interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showNoEvent()
    fun showEvent(data: List<Event>)
}