package com.codeliner.shoppinglist.domain

interface ShopListRepository { //3.4 интерфейс репозитория. умеет работать с данными: добавлять, удалять, редактировать и т.п.
//3.4 как он будет это делать - мы не знаем, но он точно умеет это делать
    fun addShopItem (shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>
}