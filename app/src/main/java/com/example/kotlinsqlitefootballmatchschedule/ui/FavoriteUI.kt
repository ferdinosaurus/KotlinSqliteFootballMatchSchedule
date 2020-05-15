package com.example.kotlinsqlitefootballmatchschedule.ui

import android.app.Activity
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ProgressBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinsqlitefootballmatchschedule.activity.FavoriteActivity
import com.example.kotlinsqlitefootballmatchschedule.adapter.EventAdapter
import com.example.kotlinsqlitefootballmatchschedule.adapter.FavoriteAdapter
import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel
import com.example.kotlinsqlitefootballmatchschedule.model.Event
import com.example.kotlinsqlitefootballmatchschedule.view.FavoriteView
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.sdk27.coroutines.onQueryTextListener

class FavoriteUI (activity: Activity): AnkoComponent<FavoriteActivity>, FavoriteView  {

    private var activity:Activity = activity
    private lateinit var recyclerView: RecyclerView

    lateinit var buttonPrev: Button
    lateinit var buttonNext: Button


    private var favoriteModelList: MutableList<FavoriteModel> = mutableListOf()
    private lateinit var progressBar: ProgressBar


    override fun createView(ui: AnkoContext<FavoriteActivity>) = with(ui) {
        linearLayout {

            padding = dip(16)
            lparams (width = matchParent, height = matchParent)
            orientation = LinearLayout.VERTICAL


            linearLayout {
                lparams(matchParent, wrapContent)
                orientation = LinearLayout.HORIZONTAL

                buttonPrev = button {
                    text = "prev"
                }.lparams{
                    width = dip(0)
                    height = matchParent
                    weight = 1F
                }


                buttonNext = button {
                    text = "next"
                }.lparams{
                    width = dip(0)
                    height = matchParent
                    weight = 1F
                }

            }

            progressBar = progressBar {
            }.lparams(matchParent, wrapContent)

            recyclerView = recyclerView {
                lparams(matchParent, wrapContent)

                layoutManager = LinearLayoutManager(context)
                adapter = FavoriteAdapter(context,favoriteModelList){
                    context.toast("id = "+it.idEvent)
                }
            }

        }
    }

    override fun showLoading() {
        progressBar.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        progressBar.visibility = View.GONE
    }

    override fun showNoFavorite() {
        recyclerView.visibility = View.GONE
    }

    override fun showFavorite(data: List<FavoriteModel>) {
        recyclerView.visibility = View.VISIBLE
        recyclerView.adapter = FavoriteAdapter(activity,data as MutableList<FavoriteModel>){
            activity.toast("data : "+it.idEvent)
        }
    }


}