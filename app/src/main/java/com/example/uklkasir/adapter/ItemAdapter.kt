package com.example.uklkasir.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uklkasir.R
import com.example.uklkasir.itemdatabase.Item

class ItemAdapter(var list: List<Item>): RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        var namaItem: TextView
        var hargaItem: TextView

        init {
            namaItem = view.findViewById(R.id.namaItem)
            hargaItem = view.findViewById(R.id.hargaItem)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_template, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaItem.text = list[position].nama
        holder.hargaItem.text = list[position].harga.toString()
    }

    override fun getItemCount(): Int {
        return list.size
    }
}