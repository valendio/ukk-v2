package com.example.uklkasir.userdatabase

import androidx.room.Embedded
import androidx.room.Relation

data class DetailTransaksiAndMenu(
    @Embedded val detailTransaksi: DetailTransaksi,
    @Relation(
        parentColumn = "id_menu",
        entityColumn = "id_menu"
    )
    val menu: Menu
)