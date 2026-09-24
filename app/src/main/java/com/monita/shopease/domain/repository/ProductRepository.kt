package com.monita.shopease.domain.repository

import com.monita.shopease.domain.model.Products
import kotlinx.coroutines.flow.Flow

interface ProductRepository {

    fun getProducts(): Flow<Result<List<Products>>>
    suspend fun getProductById(id: Int): Result<Products?>
    suspend fun getProductsByCategory(category: String): Result<List<Products>>
    suspend fun searchProducts(query: String): Result<List<Products>>
}