package com.example.view.phonekt.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.view.phonekt.R
import com.example.view.phonekt.note.NoteEntity
import com.example.view.phonekt.note.NoteModel

class NoteAdapter(val noteList: ArrayList<NoteEntity>) : RecyclerView.Adapter<NoteAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.note_item,parent,false)


        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.tile.text=noteList.get(position).title
        holder.day.text=noteList.get(position).day

        holder.itemView.setOnLongClickListener{
            remove(holder.adapterPosition)
            false
        }

    }

    override fun getItemCount(): Int {
        return noteList.size
    }

    fun remove(position: Int) {
        try {
            noteList.removeAt(position)
            notifyItemRemoved(position)
        }catch (ex: IndexOutOfBoundsException){
            ex.printStackTrace()
        }
    }

    class CustomViewHolder(itemveiw: View) : RecyclerView.ViewHolder(itemveiw) {
        val tile = itemveiw.findViewById<TextView>(R.id.tv_title)
        val day = itemveiw.findViewById<TextView>(R.id.tv_date)

    }
}