package com.busedemir.superkahramankitabi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tanitim.*

class TanitimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)
// buraya hangi intentla gelindiyse onu alıyordur.
        val intent = intent
        // pulanan stringi get ile geçilen sayfada alıyoruz.
        val secilenKahramanİsmi = intent.getStringExtra("superkahramanismi")
        textView.text=secilenKahramanİsmi

        val secilenKahraman= SingletonClass.SecilenKahraman
        val secilenGorsel = secilenKahraman.gorsel
        imageView.setImageBitmap(secilenGorsel)
    }
}