package com.codeliner.shoppinglist.domain

data class ShopItem( //2203 этот класс является основной нашей бизнес логики
    val id:Int,
    val name: String,
    val count: Int,
    val enabled: Boolean
) //2203 теперь необходимо написать саму бизнес-логику
//S - класс должен отвечать за что-то одно


