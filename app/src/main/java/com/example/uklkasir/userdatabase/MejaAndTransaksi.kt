package com.example.uklkasir.userdatabase

import androidx.room.Embedded
import androidx.room.Relation

data class MejaAndTransaksi(
    @Embedded val transaksi: Transaksi,
    @Relation(
        parentColumn = "id_meja",
        entityColumn = "id_meja"
    )
    val meja: Meja
)