package com.example.newapi.data.remote

import com.example.newapi.data.remote.models.GameModel
import com.example.newapi.data.remote.models.SpecificGameModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject


class GameService @Inject constructor(private val gameApi: GameApi) {

    suspend fun getGames(): List<GameModel>{
        return withContext(Dispatchers.IO){
            val games = gameApi.getGames()
            games.body() ?: emptyList()
        }
    }

    suspend fun getGamesById(id: Int): SpecificGameModel{
        return withContext(Dispatchers.IO){
            val game = gameApi.getGameByID(id)
            game.body()!!
        }
    }
}