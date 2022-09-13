package com.abramkinapps.android.composition.domain.repository

import com.abramkinapps.android.composition.domain.entity.GameSettings
import com.abramkinapps.android.composition.domain.entity.Level
import com.abramkinapps.android.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}