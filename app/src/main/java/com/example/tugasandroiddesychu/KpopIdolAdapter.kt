package com.example.tugasandroiddesychu

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class KpopIdolAdapter(private val context: Context, private val kpopidol: List<kpopidol>, val listener:(kpopidol) -> Unit)
    :RecyclerView.Adapter<KpopIdolAdapter.KpopIdolViewHolder>(){

    class KpopIdolViewHolder(view: View):RecyclerView.ViewHolder(view) {

        val imgkpopidol = view.findViewById<ImageView>(R.id.img_item_photo)
        val namekpopidol = view.findViewById<TextView>(R.id.tv_item_name)
        val descriptionkpopidol = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(kpopidol: kpopidol, listener: (kpopidol) -> Unit){
            imgkpopidol.setImageResource(kpopidol.imgkpopidol)
            namekpopidol.text = kpopidol.namekpopidol
            descriptionkpopidol.text = kpopidol.descriptionkpopidol

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KpopIdolViewHolder {
        return KpopIdolViewHolder(
            LayoutInflater.from(Context).inflate(R.layout.item_kpopidol, parent, false)
        )
    }

    override fun getItemCount(): Int = kpopidol.size

    }

    override fun onBindViewHolder(holder: KpopIdolViewHolder, position: Int) {
        holder.bindView(kpopidol[position], listener)
    }

}