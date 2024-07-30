package com.example.t4intent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val instagramButton = findViewById<CardView>(R.id.btnInsta)
        val facebookButton = findViewById<CardView>(R.id.btnFacebook)
        val amazonButton = findViewById<CardView>(R.id.btnAmazon)
        val flipkartButton = findViewById<CardView>(R.id.btnFlipkart)
        val myntramButton = findViewById<CardView>(R.id.btnMyntra)
        val meeshoButton = findViewById<CardView>(R.id.btnMeesho)
        val jiociemaButton = findViewById<CardView>(R.id.btnJiocinema)
        val hostarButton = findViewById<CardView>(R.id.bthHotstar)

        instagramButton.setOnClickListener {
            val intent = Intent(this,instagramwebView::class.java)
            startActivity(intent)
        }
        facebookButton.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.facebook.com/login")
            startActivity(intent)
        }
        amazonButton.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.amazon.in")
            startActivity(intent)
        }
        flipkartButton.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.flipkart.com")
            startActivity(intent)
        }
        myntramButton.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.myntra.com/")
            startActivity(intent)
        }
        meeshoButton.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.meesho.com/")
            startActivity(intent)
        }
        hostarButton.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.hotstar.com/in/home?ref=%2Fin")
            startActivity(intent)
        }
        jiociemaButton.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.jiocinema.com/")
            startActivity(intent)
        }








    }
}