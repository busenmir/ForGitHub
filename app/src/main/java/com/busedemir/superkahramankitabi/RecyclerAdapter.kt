package com.busedemir.superkahramankitabi

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter (val kahramanListesi : ArrayList<String>, val kahramangorselleri : ArrayList<Bitmap>): RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH>() {
    class SuperKahramanVH(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }
//View holder oluşunca yapılacak işlemler. SuperkahramanVH döndürmemizi istiyor.
// bir kod ile xml bağlayacağımız zaman INFLATER, LAYOUTINFLATER yapıları kullanmalıyız.
//
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return SuperKahramanVH((itemView))
    }
// oluşturduğumuz viewholder sınıfına ulaşarak ilgili işlemler yapabiliyoruz.
    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {

        holder.itemView.recycleView.text = kahramanListesi.get(position)
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,TanitimActivity::class.java)
            intent.putExtra("superkahramanismi",kahramanListesi.get(position))
            holder.itemView.context.startActivity(intent)
        }

    }
// GETITEMCOUNT rw içinde kaç sıra olacak ? return 5 demek işi çözebilir ama anlık çözümdür.
//
    override fun getItemCount(): Int {
        return kahramanListesi.size
    }

}