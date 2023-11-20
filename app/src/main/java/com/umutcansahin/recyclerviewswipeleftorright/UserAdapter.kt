package com.umutcansahin.recyclerviewswipeleftorright

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.umutcansahin.recyclerviewswipeleftorright.databinding.UserAdapterItemBinding

class UserAdapter() : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    private val list = mutableListOf<UserModel>()
    fun updateList(newList:List<UserModel>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }

    inner class UserViewHolder(private val binding: UserAdapterItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(user: UserModel) {
            binding.apply {
                textviewName.text = user.name
                textviewId.text = user.id.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = UserAdapterItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return UserViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(list[position])
    }
}