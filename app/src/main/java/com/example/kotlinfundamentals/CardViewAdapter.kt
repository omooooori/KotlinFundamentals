package com.example.kotlinfundamentals

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.card.view.*

class CardViewAdapter(context: Context,
                      cardList: ArrayList<Card>): BaseAdapter() {

    var cardList = ArrayList<Card>()
    var inflater: LayoutInflater

    init {
        this.inflater = LayoutInflater.from(context)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {

        var view: View?
        val viewHolder: ViewHolder

        if (convertView == null) {
            view = inflater.inflate(R.layout.card, null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        return view
    }

    override fun getItem(position: Int): Any {
        return cardList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return cardList.size
    }

    private class ViewHolder(view: View) {

        init {
            var colorImage: ImageView = view.card_view_image
            var colorName: TextView = view.card_view_text
        }
    }
}