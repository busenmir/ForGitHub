package com.busedemir.superkahramankitabi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tanitim.*

class TanitimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)

        val intent = intent
        val secilenKahramanİsmi = intent.getStringExtra("superkahramanismi")
        textView.text=secilenKahramanİsmi
    }
}