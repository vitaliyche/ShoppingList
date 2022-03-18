package com.codeliner.shoppinglist.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem (shopItem: ShopItem) { //2203 принимает shopItem и ничего не возвращает
        shopListRepository.addShopItem(shopItem)
    }
}