package com.example.newapi.data.remote

import com.example.newapi.data.remote.models.GameModel
import com.example.newapi.data.remote.models.SpecificGameModel
import com.example.newapi.util.Constants.GAMES_ENDPOINT
import com.example.newapi.util.Constants.GAME_ID_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GameApi {
    @GET(GAMES_ENDPOINT)
    suspend fun getGames(): Response<List<GameModel>>

    @GET(GAME_ID_ENDPOINT)
    suspend fun getGameByID(@Query(value = "id") id : Int): Response<SpecificGameModel>
}