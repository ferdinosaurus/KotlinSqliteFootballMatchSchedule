package com.example.kotlinsqlitefootballmatchschedule.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class Event : Parcelable {

    @SerializedName("idEvent")
    var idEvent: String? = null

    @SerializedName("idSoccerXML")
    var idSoccerXML:String?=null

    @SerializedName("idAPIfootball")
    var idAPIfootball:String?=null


    @SerializedName("strEvent")
    var strEvent: String? = null

    @SerializedName("strEventAlternate")
    var strEventAlternate: String? = null

    @SerializedName("strFilename")
    var strFilename: String? = null

    @SerializedName("strSport")
    var strSport: String? = null

    @SerializedName("idLeague")
    var idLeague: String? = null

    @SerializedName("strLeague")
    var strLeague: String? = null

    @SerializedName("strSeason")
    var strSeason: String? = null

    @SerializedName("strDescriptionEN")
    var strDescriptionEN: String? = null

    @SerializedName("strHomeTeam")
    var strHomeTeam: String? = null

    @SerializedName("strAwayTeam")
    var strAwayTeam: String? = null

    @SerializedName("intHomeScore")
    var intHomeScore: String? = null

    @SerializedName("intRound")
    var intRound: String? = null

    @SerializedName("intAwayScore")
    var intAwayScore: String? = null

    @SerializedName("intSpectators")
    var intSpectators: String? = null

    @SerializedName("strHomeGoalDetails")
    var strHomeGoalDetails: String? = null

    @SerializedName("strHomeRedCards")
    var strHomeRedCards: String? = null

    @SerializedName("strHomeYellowCards")
    var strHomeYellowCards: String? = null

    @SerializedName("strHomeLineupGoalkeeper")
    var strHomeLineupGoalkeeper: String? = null

    @SerializedName("strHomeLineupDefense")
    var strHomeLineupDefense: String? = null

    @SerializedName("strHomeLineupMidfield")
    var strHomeLineupMidfield: String? = null

    @SerializedName("strHomeLineupForward")
    var strHomeLineupForward: String? = null

    @SerializedName("strHomeLineupSubstitutes")
    var strHomeLineupSubstitutes: String? = null

    @SerializedName("strHomeFormation")
    var strHomeFormation: String? = null

    @SerializedName("strAwayRedCards")
    var strAwayRedCards: String? = null

    @SerializedName("strAwayYellowCards")
    var strAwayYellowCards: String? = null

    @SerializedName("strAwayGoalDetails")
    var strAwayGoalDetails: String? = null

    @SerializedName("strAwayLineupGoalkeeper")
    var strAwayLineupGoalkeeper: String? = null

    @SerializedName("strAwayLineupDefense")
    var strAwayLineupDefense: String? = null

    @SerializedName("strAwayLineupMidfield")
    var strAwayLineupMidfield: String? = null

    @SerializedName("strAwayLineupForward")
    var strAwayLineupForward: String? = null

    @SerializedName("strAwayLineupSubstitutes")
    var strAwayLineupSubstitutes: String? = null

    @SerializedName("strAwayFormation")
    var strAwayFormation: String? = null

    @SerializedName("intHomeShots")
    var intHomeShots: String? = null

    @SerializedName("intAwayShots")
    var intAwayShots: String? = null

    @SerializedName("dateEvent")
    var dateEvent: String? = null

    @SerializedName("dateEventLocal")
    var dateEventLocal: String? = null

    @SerializedName("strDate")
    var strDate: String? = null

    @SerializedName("strTime")
    var strTime: String? = null

    @SerializedName("strTimeLocal")
    var strTimeLocal: String? = null

    @SerializedName("strTVStation")
    var strTVStation: String? = null

    @SerializedName("idHomeTeam")
    var idHomeTeam: String? = null

    @SerializedName("idAwayTeam")
    var idAwayTeam: String? = null

    @SerializedName("strResult")
    var strResult: String? = null

    @SerializedName("strCircuit")
    var strCircuit: String? = null

    @SerializedName("strCountry")
    var strCountry: String? = null

    @SerializedName("strCity")
    var strCity: String? = null

    @SerializedName("strPoster")
    var strPoster: String? = null

    @SerializedName("strFanart")
    var strFanart: String? = null

    @SerializedName("strThumb")
    var strThumb: String? = null

    @SerializedName("strBanner")
    var strBanner: String? = null

    @SerializedName("strMap")
    var strMap: String? = null

    @SerializedName("strTweet1")
    var strTweet1: String? = null

    @SerializedName("strTweet2")
    var strTweet2: String? = null

    @SerializedName("strTweet3")
    var strTweet3: String? = null

    @SerializedName("strVideo")
    var strVideo: String? = null

    @SerializedName("strPostponed")
    var strPostponed: String? = null

    @SerializedName("strLocked")
    var strLocked: String? = null


}