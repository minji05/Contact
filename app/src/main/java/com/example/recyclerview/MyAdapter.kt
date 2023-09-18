package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemContact0Binding
import com.example.recyclerview.databinding.ItemContact1Binding

class MyAdapter(private val item: List<Contact>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        private const val VIEW_TYPE_0 = 0
        private const val VIEW_TYPE_1 = 1
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            VIEW_TYPE_0 -> {
                val binding = ItemContact0Binding.inflate(inflater, parent, false)
                Contact0ViewHolder(binding)
            }
            else -> {
                val binding = ItemContact1Binding.inflate(inflater, parent, false)
                Contact1ViewHolder(binding)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val contact = item[position]
        when (holder) {
            is Contact0ViewHolder -> {
                holder.bind(contact)
                holder.itemView.setOnClickListener {
                    // 아이템 클릭 이벤트 처리
                    contact.Bookmark = !contact.Bookmark
                    notifyItemChanged(position)
                }
            }
            is Contact1ViewHolder -> {
                holder.bind(contact)
                holder.itemView.setOnClickListener {
                    // 아이템 클릭 이벤트 처리
                    contact.Bookmark = !contact.Bookmark
                    notifyItemChanged(position)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (item[position].Bookmark) VIEW_TYPE_0 else VIEW_TYPE_1
    }
    inner class Contact0ViewHolder(private val binding: ItemContact0Binding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(contact: Contact) {
            binding.contactImg.setImageResource(contact.Img)
            binding.contactName.text = contact.Name
            binding.contactCall.text = contact.Call
            binding.contactMark.setImageResource(R.drawable.mark)

        }
    }

    inner class Contact1ViewHolder(private val binding: ItemContact1Binding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(contact: Contact) {
            binding.contactImg.setImageResource(contact.Img)
            binding.contactName.text = contact.Name
            binding.contactCall.text = contact.Call
            binding.contactMark.setImageResource(R.drawable.nomark)
        }
    }

}