package com.mrflaitx.shoppingapp40.domain.repository

import com.mrflaitx.shoppingapp40.domain.entity.ShopItem

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun removeShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    // refactor
    fun getShopList(): List<ShopItem>



}