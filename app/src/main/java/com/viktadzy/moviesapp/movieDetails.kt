package com.viktadzy.moviesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class movieDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        val bundle =intent.extras
        findViewById<ImageView>(R.id.movieimage).setImageResource(bundle!!.getInt("image"))
        findViewById<TextView>(R.id.moviename).text=bundle!!.getString("name")
        findViewById<TextView>(R.id.moviedetails).text=bundle!!.getString("des")
    }
}