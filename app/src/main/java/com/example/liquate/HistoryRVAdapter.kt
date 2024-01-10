package com.example.liquate

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HistoryRVAdapter(val list: ArrayList<String>): RecyclerView.Adapter<HistoryRVAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val history_list_text:TextView
        init {
            history_list_text=itemView.findViewById(R.id.history_list_rv_text)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.history_list_item, parent, false)
            return ViewHolder(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.history_list_text.text = "X Ltr"
    }
}