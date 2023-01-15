package com.example.newapi.domain

import com.example.newapi.domain.items.SpecificGameItem
import com.example.newapi.repo.GameRepository
import javax.inject.Inject

class GetGameByIdUseCase @Inject constructor(private val gameRepository: GameRepository) {

    suspend operator fun invoke(id: Int): SpecificGameItem{
        return gameRepository.getGameById(id)
    }
}
