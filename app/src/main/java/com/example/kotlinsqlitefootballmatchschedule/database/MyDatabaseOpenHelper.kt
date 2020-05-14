package com.example.kotlinsqlitefootballmatchschedule.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel.Companion.ID
import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel.Companion.ID_EVENT
import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel.Companion.INT_SCOREA
import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel.Companion.INT_SCOREH
import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel.Companion.STR_BADGEA
import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel.Companion.STR_BADGEH
import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel.Companion.STR_DATEEV
import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel.Companion.STR_EVENT
import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel.Companion.STR_LEAGUE
import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel.Companion.STR_SPORT
import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel.Companion.STR_TEAMA
import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel.Companion.STR_TEAMH
import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel.Companion.STR_TIMEEV
import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel.Companion.TABLE_FAVORITE
import org.jetbrains.anko.db.*

class MyDatabaseOpenHelper(ctx: Context) : ManagedSQLiteOpenHelper(ctx, "FavoriteTeam.db", null, 1) {
    companion object {
        private var instance: MyDatabaseOpenHelper? = null

        @Synchronized
        fun getInstance(ctx: Context): MyDatabaseOpenHelper {
            if (instance == null) {
                instance = MyDatabaseOpenHelper(ctx.applicationContext)
            }
            return instance!!
        }
    }

    override fun onCreate(db: SQLiteDatabase) {
        // Here you create tables
        db.createTable("TABLE_FAVORITE", true,
            "ID_" to INTEGER + PRIMARY_KEY + AUTOINCREMENT,
            "TEAM_ID" to TEXT + UNIQUE,
            "TEAM_NAME" to TEXT,
            "TEAM_BADGE" to TEXT)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // Here you can upgrade tables, as usual
        db.dropTable("TABLE_FAVORITE", true)
    }
}

// Access property for Context
val Context.database: MyDatabaseOpenHelper
    get() = MyDatabaseOpenHelper.getInstance(applicationContext)

private fun createTable(db: SQLiteDatabase) {
    db.createTable(
        TABLE_FAVORITE, true,
        ID to INTEGER + PRIMARY_KEY + AUTOINCREMENT,
        ID_EVENT to TEXT + UNIQUE,
        STR_DATEEV to TEXT,
        STR_TIMEEV to TEXT,
        STR_EVENT to TEXT,
        STR_SPORT to TEXT,
        STR_LEAGUE to TEXT,
        STR_TEAMH to TEXT,
        STR_TEAMA to TEXT,
        INT_SCOREH to INTEGER,
        INT_SCOREA to INTEGER,
        STR_BADGEH to TEXT,
        STR_BADGEA to TEXT
    )
}