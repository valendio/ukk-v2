package com.example.uklkasir.itemdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Item(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    @ColumnInfo(name = "nama") var nama: String,
    @ColumnInfo(name = "harga") var harga: Int,
    @ColumnInfo(name = "tipe") var tipe: String
)