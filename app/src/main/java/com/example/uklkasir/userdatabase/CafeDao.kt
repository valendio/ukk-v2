package com.example.uklkasir.userdatabase

import androidx.room.*

@Dao
interface CafeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertDetailTransaksi(detailTransaksi: DetailTransaksi)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMenu(menu: Menu)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMeja(meja: Meja)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTransaksi(transaksi: Transaksi)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User)

    @Query("SELECT * FROM User WHERE email = :mEmail AND password = :mPass")
    fun login(mEmail: String, mPass: String): List<User>

    @Query("SELECT * FROM Menu")
    fun getAllMenu()

    @Query("SELECT * FROM Transaksi")
    fun getAllTransaksi()

    @Query("SELECT * FROM Meja")
    fun getAllMeja()

    @Transaction
    @Query("SELECT * FROM Menu WHERE id_menu = :idMenu")
    fun getMenuAndDetailTransaksiWithIdMenu(idMenu: Int): List<DetailTransaksiAndMenu>

    @Transaction
    @Query("SELECT * FROM DetailTransaksi WHERE id_transaksi = :idTransaksi")
    fun getDetailTransaksiAndTransaksiWithIdTransaksi(idTransaksi: Int): List<TransaksiAndDetailTransaksi>

    @Transaction
    @Query("SELECT * FROM Meja WHERE id_meja = :idMeja")
    fun getMejaAndTransaksiWithIdMeja(idMeja: Int): List<MejaAndTransaksi>

    @Transaction
    @Query("SELECT * FROM User WHERE id_user = :idUser")
    fun getUserAndTransaksiWithIdUser(idUser: Int): List<UserAndTransaksi>
}