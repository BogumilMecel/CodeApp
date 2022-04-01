package com.gmail.bodziowaty6978.kodyzabka.feature_code.domain.repository

import com.gmail.bodziowaty6978.kodyzabka.feature_code.domain.model.Code
import kotlinx.coroutines.flow.Flow

interface CodeRepository {

    fun getNotes():Flow<List<Code>>

    suspend fun insertCode(code:Code)

    suspend fun deleteCode(code:Code)

}