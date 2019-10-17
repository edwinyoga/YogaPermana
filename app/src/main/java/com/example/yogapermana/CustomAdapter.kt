package com.example.yogapermana

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import java.util.ArrayList


class CustomAdapter(private val context: Context, private val imageModelArrayList: ArrayList<ImageModel>) : BaseAdapter() {

    override fun getViewTypeCount(): Int {
        return count
    }

    override fun getItemViewType(position: Int): Int {

        return position
    }

    override fun getCount(): Int {
        return imageModelArrayList.size
    }

    override fun getItem(position: Int): Any {
        return imageModelArrayList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val holder: ViewHolder

        if (convertView == null) {
            holder = ViewHolder()
            val inflater = context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.listviewitem, null, true)
            holder.holderNama = convertView!!.findViewById(R.id.nama) as TextView
            holder.holderIcon = convertView.findViewById(R.id.icon) as ImageView


            convertView.tag = holder
        } else {

            holder = convertView.tag as ViewHolder
        }

        holder.holderNama!!.setText(imageModelArrayList[position].getNamaa())
        holder.holderIcon!!.setImageResource(imageModelArrayList[position].getIconn())

        return convertView
    }

    private inner class ViewHolder {

        var holderNama: TextView? = null
        internal var holderIcon: ImageView? = null

    }

}