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
        listOfMovies.add(movies("Man from Toronto","�\uD835\uDDFC\uD835\uDE03\uD835\uDDF6\uD835\uDDF2 \uD835\uDDE7\uD835\uDDF6\uD835\uDE01\uD835\uDDF9\uD835\uDDF2: \"THE MAN FROM TORONTO\"\n" +
                "\n" +
                "\uD835\uDDDA\uD835\uDDF2\uD835\uDDFB\uD835\uDDFF\uD835\uDDF2\uD835\uDE00: #Action\uD83D\uDD2B #Comedy\uD83E\uDD23\n" +
                "\n" +
                "\uD835\uDDE5\uD835\uDDF2\uD835\uDDF9\uD835\uDDF2\uD835\uDDEE\uD835\uDE00\uD835\uDDF2 \uD835\uDDD7\uD835\uDDEE\uD835\uDE01\uD835\uDDF2: Jun 24, 2022 \uD83C\uDDFA\uD83C\uDDF8 \n" +
                "\n" +
                "\uD835\uDDE3\uD835\uDDF9\uD835\uDDFC\uD835\uDE01: Hitman meets dead man.\n" +
                "\n" +
                "In a case of mistaken identity, the world's deadliest assassin, known as the Man from Toronto, and a New York City screw-up are forced to team up after being confused for each other at an Airbnb.\n",R.drawable.manfromtoronto))
        listOfMovies.add(movies("Ambulance","\uD835\uDDE0\uD835\uDDFC\uD835\uDE03\uD835\uDDF6\uD835\uDDF2 \uD835\uDDE7\uD835\uDDF6\uD835\uDE01\uD835\uDDF9\uD835\uDDF2: Ambulance\n" +
                " \n" +
                "\uD835\uDDDA\uD835\uDDF2\uD835\uDDFB\uD835\uDDFF\uD835\uDDF2\uD835\uDE00: #Action #Crime #Thriller\n" +
                "\n" +
                "\uD835\uDDE5\uD835\uDDF2\uD835\uDDF9\uD835\uDDF2\uD835\uDDEE\uD835\uDE00\uD835\uDDF2 \uD835\uDDD7\uD835\uDDEE\uD835\uDE01\uD835\uDDF2: 08 April 2022\n" +
                "\n" +
                "\uD835\uDDE3\uD835\uDDF9\uD835\uDDFC\uD835\uDE01: Decorated veteran Will Sharp, desperate for money to cover his wife's medical bills, asks for help from his adoptive brother Danny. A charismatic career criminal, Danny instead offers him a score: the biggest bank heist in Los Angeles history: \$32 million.",R.drawable.ambulance))
        listOfMovies.add(movies("Last Seen Alive","\uD835\uDDE0\uD835\uDDFC\uD835\uDE03\uD835\uDDF6\uD835\uDDF2 \uD835\uDDE7\uD835\uDDF6\uD835\uDE01\uD835\uDDF9\uD835\uDDF2: Last Seen Alive\n" +
                " \n" +
                "\uD835\uDDDA\uD835\uDDF2\uD835\uDDFB\uD835\uDDFF\uD835\uDDF2\uD835\uDE00: #Action #Thriller \n" +
                "\n" +
                "\uD835\uDDE5\uD835\uDDF2\uD835\uDDF9\uD835\uDDF2\uD835\uDDEE\uD835\uDE00\uD835\uDDF2 \uD835\uDDD7\uD835\uDDEE\uD835\uDE01\uD835\uDDF2: 03 June 2022\n" +
                "\n" +
                "\uD835\uDDE3\uD835\uDDF9\uD835\uDDFC\uD835\uDE01: Lisa who is with his soon-to-be ex-husband Will as he drives her to her parent's home but mysteriously disappears without a trace during a stop at a gas station.",R.drawable.lastalive))
        listOfMovies.add(movies("Stranger Things","Title: Stranger Things \n" +
                "Rating ⭐️: 8.7 / 10\n" +
                "(8.7 based on 994,505 user ratings) | 16 |  |\n" +
                "Release Info: Jul 15, 2016\n" +
                "Genre: \uD83C\uDFAD #Drama ✨ #Fantasy #Horror\n" +
                "Language: English \n" +
                "Country of Origin: \n" +
                "Story Line: When a young boy disappears, his mother, a police chief and his friends must confront terrifying supernatural forces in order to get him back.\n" +
                "Writers  Matt Duffer,Ross Duffer\n" +
                "Stars  Millie Bobby Brown,Finn Wolfhard,Winona Ryder",R.drawable.strangerthings))
        listOfMovies.add(movies("Dr Strange","Movie  ️Title \uD83C\uDFAC; Doctor Strange in the Multiverse of Madness 2022\n" +
                "\n" +
                "Genre: #Action \uD83C\uDF0B #Adventure ✨ #Fantasy\n" +
                "\n" +
                "Language:  #English\n" +
                "Country of Origin:  #United_States\n" +
                "\n" +
                "Story Line: Dr. Stephen Strange casts a forbidden spell that opens the doorway to the multiverse, including alternate versions of himself, whose threat to humanity is too great for the combined forces of Strange, Wong, and Wanda Maximoff.",R.drawable.drstrange))
        listOfMovies.add(movies("Interceptor","\uD835\uDDE0\uD835\uDDFC\uD835\uDE03\uD835\uDDF6\uD835\uDDF2 \uD835\uDDE7\uD835\uDDF6\uD835\uDE01\uD835\uDDF9\uD835\uDDF2 \uD83C\uDFAC: interceptor \n" +
                "\n" +
                "\uD835\uDDE3\uD835\uDDF9\uD835\uDDFC\uD835\uDE01:  An Army lieutenant uses her years of tactical training to save humanity from sixteen nuclear missiles launched at the U.S. as a violent coordinated attack simultaneously threatens her remote missile interceptor station.\n" +
                "\n" +
                "\n" +
                "\uD835\uDDDA\uD835\uDDF2\uD835\uDDFB\uD835\uDDFF\uD835\uDDF2\uD835\uDE00: #Action, #Adventure, #Drama, #Thriller \uD83D\uDC51\n" +
                "\n" +
                "\uD835\uDDE5\uD835\uDDF2\uD835\uDDF9\uD835\uDDF2\uD835\uDDEE\uD835\uDE00\uD835\uDDF2 \uD835\uDDD7\uD835\uDDEE\uD835\uDE01\uD835\uDDF2: March , 2022",R.drawable.interceptor))
        listOfMovies.add(movies("Adam Project","\uD835\uDDE0\uD835\uDDFC\uD835\uDE03\uD835\uDDF6\uD835\uDDF2 \uD835\uDDE7\uD835\uDDF6\uD835\uDE01\uD835\uDDF9\uD835\uDDF2: The Adam Project \n" +
                " \n" +
                "\uD835\uDDDA\uD835\uDDF2\uD835\uDDFB\uD835\uDDFF\uD835\uDDF2\uD835\uDE00: #Action #Adventure #Comedy #Sci-fi\n" +
                "\n" +
                "\uD835\uDDE5\uD835\uDDF2\uD835\uDDF9\uD835\uDDF2\uD835\uDDEE\uD835\uDE00\uD835\uDDF2 \uD835\uDDD7\uD835\uDDEE\uD835\uDE01\uD835\uDDF2: 11 March 2022\n" +
                "\n" +
                "\uD835\uDDE3\uD835\uDDF9\uD835\uDDFC\uD835\uDE01: Past meets future.\n" +
                "After accidentally crash-landing in 2022, time-traveling fighter pilot Adam Reed teams up with his 12-year-old self on a mission to save the future.",R.drawable.adamproject))
        listOfMovies.add(movies("Infinite Storm","\uD835\uDDE0\uD835\uDDFC\uD835\uDE03\uD835\uDDF6\uD835\uDDF2 \uD835\uDDE7\uD835\uDDF6\uD835\uDE01\uD835\uDDF9\uD835\uDDF2: Infinite Storm\n" +
                " \n" +
                "\uD835\uDDDA\uD835\uDDF2\uD835\uDDFB\uD835\uDDFF\uD835\uDDF2\uD835\uDE00: #Drama #Thriller\n" +
                "\n" +
                "\uD835\uDDE5\uD835\uDDF2\uD835\uDDF9\uD835\uDDF2\uD835\uDDEE\uD835\uDE00\uD835\uDDF2 \uD835\uDDD7\uD835\uDDEE\uD835\uDE01\uD835\uDDF2: 25 March 2022\n" +
                "\n" +
                "\uD835\uDDE3\uD835\uDDF9\uD835\uDDFC\uD835\uDE01: As an experienced climber ascends Mount Washington, she turns back before she reaches the summit as a huge blizzard approaches. However, on her way down, she encounters a stranded man and takes it upon herself to get them both down the mountain before nightfall arrives and they succumb to the elements. ",R.drawable.infinitestorm))
        listOfMovies.add(movies("Murder At Yellow Stone City","\uD835\uDC06\uD835\uDC04\uD835\uDC0D\uD835\uDC11\uD835\uDC04\uD835\uDC12: #Mystery\uD83D\uDCAD #Western\uD83C\uDFF3️\n" +
                "\n" +
                "\uD835\uDC11\uD835\uDC04\uD835\uDC0B\uD835\uDC04\uD835\uDC00\uD835\uDC12\uD835\uDC04 \uD835\uDC03\uD835\uDC00\uD835\uDC13\uD835\uDC04: Jun 24, 2022 \uD83C\uDDFA\uD83C\uDDF8 \n" +
                "\n" +
                "\uD835\uDC0F\uD835\uDC0B\uD835\uDC0E\uD835\uDC13: In a town of suspects, one man stands accused.\n" +
                "\n" +
                "A former slave who arrives in Yellowstone City, Montana, a desolate former boomtown now on the decline, looking for a place to call home. On that same day, a local prospector discovers gold - and is murdered. ",R.drawable.yellowstone))
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