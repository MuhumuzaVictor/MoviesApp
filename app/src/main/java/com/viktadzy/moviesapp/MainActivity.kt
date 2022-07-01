package com.viktadzy.moviesapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    var adapter:movieAdapter?=null
    val listOfMovies= ArrayList<movies>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //load movies
        listOfMovies.add(movies("Man vs Bee","Release Info: June 24, 2022 \n" +
                "Genre: #Short \uD83E\uDD23 #Comedy \uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC67 #Family\n" +
                "Language:  #English\n" +
                "Country of Origin: \uD83C\uDDEC\uD83C\uDDE7 #United_Kingdom\n" +
                "Story Line: A man finds himself at war with a bee while housesitting a luxurious mansion. Who will win, and what irreparable damage will be done in the process?\n" +
                "Writers  Rowan Atkinson, Will Davies \n" +
                "Stars  Rowan Atkinson, Claudie Blakley, Jing Lusi ",R.drawable.manvsbee))
        listOfMovies.add(movies("Man from Toronto","..................",R.drawable.manfromtoronto))
        listOfMovies.add(movies("Ambulance","..................",R.drawable.ambulance))
        listOfMovies.add(movies("Last Seen Alive","..................",R.drawable.lastalive))
        listOfMovies.add(movies("Stranger Things","..................",R.drawable.strangerthings))
        listOfMovies.add(movies("Dr Strange","..................",R.drawable.drstrange))
        listOfMovies.add(movies("Interceptor","..................",R.drawable.interceptor))
        adapter =movieAdapter(this,listOfMovies)
        //assign our list to our gridview id
        findViewById<GridView>(R.id.movielist).adapter=adapter
    }
    class movieAdapter: BaseAdapter {
        var listOfMovies = ArrayList<movies>()
        var context: Context? = null

        constructor(context: Context, listOfMovies: ArrayList<movies>) : super() {


            this.context = context
            this.listOfMovies = listOfMovies
        }
        override fun getCount(): Int {
            return listOfMovies.size
        }

        override fun getItem(p0: Int): Any {
            return listOfMovies[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            val movie = this.listOfMovies[p0]
            var inflator =
                context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var movieView = inflator.inflate(R.layout.activity_moviesdisplay, null)
            movieView.findViewById<ImageView>(R.id.movie_image).setImageResource(movie.image!!)
            movieView.setOnClickListener {
                val intent = Intent(context, movieDetails::class.java)
                intent.putExtra("name", movie.name!!)
                intent.putExtra("des", movie.des!!)
                intent.putExtra("image", movie.image!!)
                context!!.startActivity(intent)


            }
            movieView.findViewById<TextView>(R.id.moviedisplay).text = movie.name!!
            return movieView
        }


    }
}