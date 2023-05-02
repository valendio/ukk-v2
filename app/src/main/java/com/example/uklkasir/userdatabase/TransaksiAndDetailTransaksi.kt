package com.example.uklkasir.userdatabase

import androidx.room.Embedded
import androidx.room.Relation

data class TransaksiAndDetailTransaksi(
    @Embedded val detailTransaksi: DetailTransaksi,
    @Relation(
        parentColumn = "id_transaksi",
        entityColumn = "id_transaksi"
    )
    val transaksi: Transaksi
)
