package com.appsunlimited.githubuserapi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.appsunlimited.githubuserapi.R
import com.appsunlimited.githubuserapi.data.User
import com.bumptech.glide.Glide

class MainAdapter (val list: ArrayList<User>): RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    var onItemClickListener: ((User) -> Unit)? = null

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(user: User) {
            with (itemView) {
                Glide.with(this).load(user.avatarUrl).into(itemAvatar)
                ItemLogin.text = user.login
                itemDescription.text = user.htmlUrl

            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list.get(position))
        holder.itemView.setOnClickListener{
            onItemClickListener?.invoke(list[position])
        }
    }
}