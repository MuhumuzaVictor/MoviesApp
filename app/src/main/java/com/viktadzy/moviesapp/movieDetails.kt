package com.viktadzy.moviesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class movieDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        val button:Button= findViewById(R.id.downloadbutton)
        button.setOnClickListener {
        val intent=Intent(this,Downloadpage::class.java)
            startActivity(intent)
        }

        val bundle =intent.extras
        findViewById<ImageView>(R.id.movieimage).setImageResource(bundle!!.getInt("image"))
        findViewById<TextView>(R.id.moviename).text=bundle!!.getString("name")
        findViewById<TextView>(R.id.moviedetails).text=bundle!!.getString("des")

    }
}