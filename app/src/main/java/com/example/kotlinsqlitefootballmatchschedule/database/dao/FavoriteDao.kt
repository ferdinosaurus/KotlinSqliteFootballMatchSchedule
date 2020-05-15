package com.example.kotlinsqlitefootballmatchschedule.database.dao

import android.app.Activity
import android.util.Log
import com.example.kotlinsqlitefootballmatchschedule.database.database
import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel
import com.example.kotlinsqlitefootballmatchschedule.model.Event
import org.jetbrains.anko.db.classParser
import org.jetbrains.anko.toast

import org.jetbrains.anko.db.insert
import org.jetbrains.anko.db.select

import java.lang.Exception

class FavoriteDao(activity:Activity){

    private var activity:Activity = activity

    fun insertData(event:Event,status:String){
        try{
            activity.database.use {
                insert(
                    FavoriteModel.TABLE_FAVORITE,
                    FavoriteModel.ID_EVENT to event.idEvent,
                    FavoriteModel.STR_DATEEV to event.dateEvent,
                    FavoriteModel.STR_TIMEEV to event.strTime,
                    FavoriteModel.STR_EVENT to event.strEvent,
                    FavoriteModel.STR_STATUS to status,
                    FavoriteModel.STR_SPORT to event.strSport,
                    FavoriteModel.STR_LEAGUE to event.strLeague,
                    FavoriteModel.STR_TEAMH to event.strHomeTeam,
                    FavoriteModel.STR_TEAMA to event.strAwayTeam,
                    FavoriteModel.INT_SCOREH to event.intHomeScore,
                    FavoriteModel.INT_SCOREA to event.intAwayScore)
            }
            activity.toast("masuk")
        }catch (e:Exception){
            activity.toast(e.toString())
        }
    }

    fun getAll():List<FavoriteModel>{
        var favoriteModelList:ArrayList<FavoriteModel> = arrayListOf()
        try{

            activity.database.use {

                val result = select(FavoriteModel.TABLE_FAVORITE)
                result.toString()
                val favoriteTemp = result.parseList(classParser<FavoriteModel>())

                favoriteModelList.addAll(favoriteTemp)

            }
        }catch (e:Exception){
            Log.d("dataFavorite",e.toString())
            activity.toast(e.toString())
        }
        return favoriteModelList
    }

    fun getAllByStatus(status: String):List<FavoriteModel>{
        var favoriteModelList:ArrayList<FavoriteModel> = arrayListOf()
        try{

            activity.database.use {

                val result = select(FavoriteModel.TABLE_FAVORITE)
                    .whereArgs(FavoriteModel.STR_STATUS+" = {status}",
                "status" to status
                )
                result.toString()
                val favoriteTemp = result.parseList(classParser<FavoriteModel>())

                favoriteModelList.addAll(favoriteTemp)

            }
        }catch (e:Exception){
            Log.d("dataFavorite",e.toString())
            activity.toast(e.toString())
        }
        return favoriteModelList
    }


}