package com.example.uklkasir.userdatabase

import androidx.room.Embedded
import androidx.room.Relation

data class UserAndTransaksi(
    @Embedded val user: User,
    @Relation(
        parentColumn = "id_user",
        entityColumn = "id_user"
    )
    val transaksi: Transaksi
)
