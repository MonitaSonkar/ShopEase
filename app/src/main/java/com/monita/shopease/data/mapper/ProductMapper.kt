package com.monita.shopease.data.mapper

import com.monita.shopease.data.remote.dto.ProductDto
import com.monita.shopease.domain.model.Products

fun ProductDto.toDomain(): Products{
    return Products(id=id,title=title,description=description,price=price,discountPercentage=discountPercentage,rating=rating,stock=stock,brand=brand,category=category,thumbnail=thumbnail,images=images)
}