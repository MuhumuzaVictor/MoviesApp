package com.viktadzy.moviesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Downloadpage : AppCompatActivity() {
    private val web : WebView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_downloadpage)

        val web = findViewById<WebView>(R.id.myweb)
        web.webViewClient = WebViewClient()//responsible for loading the url defined below
        web.loadUrl("https://www.thenetnaija.net/videos/movies")
        val webSettings = web.settings
        webSettings.javaScriptEnabled = true


    }
    override fun onBackPressed() { //enables someone to remain on the site
        if (web!!.canGoBack()) {
            web.goBack()
        }
        super.onBackPressed()
    }
    }
