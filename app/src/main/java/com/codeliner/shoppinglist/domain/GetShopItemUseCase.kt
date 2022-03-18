package com.codeliner.shoppinglist.domain

class GetShopItemUseCase (private val shopListRepository: ShopListRepository) {
    fun getShopItem(shopItemId: Int): ShopItem { //2203 принимает id и возвращает ShopItem
        return shopListRepository.getShopItem(shopItemId)
    }
}