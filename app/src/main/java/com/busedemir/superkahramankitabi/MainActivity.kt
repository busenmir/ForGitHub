package com.busedemir.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recycler_row.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var superKahramanisimleri = ArrayList<String>()
        superKahramanisimleri.add("Batman")
        superKahramanisimleri.add("Superman")
        superKahramanisimleri.add("Ironman")
        superKahramanisimleri.add("Ergün")
        superKahramanisimleri.add("Buse")

        // verimsiz BİTMAP oluşturmak

        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironma)
        val ergunBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ergun)
        val buseBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.buse)


        var superKahramanGorselleri = ArrayList<Bitmap>()
        superKahramanGorselleri.add(batmanBitmap)
        superKahramanGorselleri.add(supermanBitmap)
        superKahramanGorselleri.add(ironmanBitmap)
        superKahramanGorselleri.add(ergunBitmap)
        superKahramanGorselleri.add(buseBitmap)

        val layoutManager = LinearLayoutManager(this)
        RecyclerView.layoutManager = layoutManager



        val adapter = RecyclerAdapter(superKahramanisimleri,superKahramanGorselleri)
        RecyclerView.adapter=adapter


    }


}