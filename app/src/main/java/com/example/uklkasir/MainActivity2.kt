package com.example.uklkasir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Spinner
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.uklkasir.adapter.ItemAdapter
import com.example.uklkasir.itemdatabase.ItemDatabase

class MainActivity2 : AppCompatActivity() {
    lateinit var recycler: RecyclerView
    lateinit var adapter: ItemAdapter
    lateinit var itemDb: ItemDatabase
    lateinit var addButton: ImageButton

    var nama: String = ""
    var role: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        recycler = findViewById(R.id.recycler)
        addButton = findViewById(R.id.buttonAdd)

        nama = intent.getStringExtra("name")!!
        role = intent.getStringExtra("role")!!
        Toast.makeText(applicationContext, "Logged in as " + nama, Toast.LENGTH_SHORT).show()

        if(role != "Admin"){
            addButton.isEnabled = false
            addButton.visibility = View.INVISIBLE
        }

        addButton.setOnClickListener{
            val moveIntent = Intent(this@MainActivity2, AddItemActivity::class.java)
            startActivity(moveIntent)
        }

        itemDb = ItemDatabase.getInstance(applicationContext)
        val list = itemDb.itemDao().getAll()
        adapter = ItemAdapter(list)
    }
}