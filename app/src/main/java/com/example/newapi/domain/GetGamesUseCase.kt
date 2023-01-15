package com.example.newapi.domain

import com.example.newapi.domain.items.GameItem
import com.example.newapi.repo.GameRepository
import javax.inject.Inject

class GetGamesUseCase @Inject constructor(private val gameRepository: GameRepository) {

    suspend operator fun invoke(): List<GameItem>{
        return gameRepository.getGames()
    }
}