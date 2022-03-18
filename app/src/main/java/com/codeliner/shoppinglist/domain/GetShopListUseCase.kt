package com.codeliner.shoppinglist.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopList(): List<ShopItem> { //2203 не принимает параметров и возвращает список элементов
        return shopListRepository.getShopList()
    }
}