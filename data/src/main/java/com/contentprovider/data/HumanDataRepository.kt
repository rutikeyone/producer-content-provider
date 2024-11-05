package com.contentprovider.data

import android.net.Uri
import com.contentprovider.core.common.Container
import com.contentprovider.data.models.HumanModel
import kotlinx.coroutines.flow.Flow

interface HumanDataRepository {

    suspend fun insert(model: HumanModel): Uri

    suspend fun update(model: HumanModel): Int

    suspend fun delete(model: HumanModel): Int

    suspend fun readAll(): List<HumanModel>

    fun observeAll(silently: Boolean = false): Flow<Container<List<HumanModel>>>
}