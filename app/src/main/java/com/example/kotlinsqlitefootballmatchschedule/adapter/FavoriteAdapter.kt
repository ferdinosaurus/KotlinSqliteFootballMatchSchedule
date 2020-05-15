package com.example.kotlinsqlitefootballmatchschedule.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinsqlitefootballmatchschedule.database.model.FavoriteModel
import com.example.kotlinsqlitefootballmatchschedule.ui.FavoriteItemUI
import kotlinx.android.extensions.LayoutContainer
import org.jetbrains.anko.AnkoContext

class FavoriteAdapter(private val context: Context, private val items: MutableList<FavoriteModel>, private val listener:(FavoriteModel) ->Unit )
    : RecyclerView.Adapter<FavoriteAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(FavoriteItemUI().createView(AnkoContext.create(context,parent)))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position],listener)
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
        LayoutContainer {

        private var tvName: TextView = itemView.findViewById(FavoriteItemUI.tvEventName)
        private var tvDate: TextView = itemView.findViewById(FavoriteItemUI.tvEventDate)



        fun bindItem(items: FavoriteModel, listener: (FavoriteModel) -> Unit) {
            tvName.text = items.strEvent
            tvDate.text = items.dateEvent
            containerView.setOnClickListener { listener(items) }
        }
    }
}