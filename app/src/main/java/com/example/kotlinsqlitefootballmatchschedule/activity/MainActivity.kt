package com.example.kotlinsqlitefootballmatchschedule.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinsqlitefootballmatchschedule.database.database
import com.example.kotlinsqlitefootballmatchschedule.model.LeagueParcelable
import com.example.kotlinsqlitefootballmatchschedule.presenter.MainPresenter
import com.example.kotlinsqlitefootballmatchschedule.ui.MainUI
import com.example.kotlinsqlitefootballmatchschedule.view.MainView
import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity() , MainView {

    private lateinit var presenter: MainPresenter
    private lateinit var mainUI: MainUI
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        mainUI = MainUI(this)
        mainUI.setContentView(this)
        init()


    }

    private fun init(){
        //val request = ApiRepository()
        //val gson = Gson()
        //presenter = MainPresenter(this,request,gson)
        //presenter.getAllLeague()
        presenter = MainPresenter(this,this)
        presenter.setupData()

    }

    override fun showLoading() {
        mainUI.showLoading()
    }

    override fun hideLoading() {
        mainUI.hideLoading()
    }

    override fun showLeagueList(data: List<LeagueParcelable>) {
        mainUI.showLeagueList(data)

    }

}
