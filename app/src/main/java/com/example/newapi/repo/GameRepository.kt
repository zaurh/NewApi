package com.example.newapi.repo

import com.example.newapi.data.remote.GameService
import com.example.newapi.domain.items.GameItem
import com.example.newapi.domain.items.SpecificGameItem
import com.example.newapi.domain.items.toGameItem
import com.example.newapi.domain.items.toSpecificGameItem
import javax.inject.Inject

class GameRepository @Inject constructor(private val gameService: GameService) {

    suspend fun getGames() :List<GameItem>{
        return gameService.getGames().map {
            it.toGameItem()
        }
    }

    suspend fun getGameById(id: Int) : SpecificGameItem{
        return gameService.getGamesById(id).toSpecificGameItem()
    }
}