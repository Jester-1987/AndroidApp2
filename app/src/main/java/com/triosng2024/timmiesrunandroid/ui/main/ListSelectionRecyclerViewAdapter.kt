package com.triosng2024.timmiesrunandroid.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import models.TaskList
import com.triosng2024.timmiesrunandroid.databinding.ListSelectionViewHolderBinding

class ListSelectionRecyclerViewAdapter(val lists : MutableList<TaskList>,
    val clickListener: ListSelectionRecyclerViewClickListener) :
    RecyclerView.Adapter<ListSelectionViewHolder>(){

    val listTitles = arrayOf("Medium Double Double", "Timbits", "Donuts")

    interface ListSelectionRecyclerViewClickListener{
        fun listItemClicked(list: TaskList)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {
        val binding = ListSelectionViewHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListSelectionViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        holder.binding.itemNumber.text = (position + 1).toString()
        holder.binding.itemString.text = lists[position].name
        holder.itemView.listItemClicked(lists[position])
    }

    fun listsUpdated() {
        notifyItemInserted(lists.size-1)
    }
}
