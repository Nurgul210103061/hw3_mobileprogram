package com.example.recyclerview1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Socialmedia>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.telegram,
            R.drawable.discord,
            R.drawable.instagram,
            R.drawable.gmail,
            R.drawable.tiktok,
            R.drawable.webex,
            R.drawable.whatsapp
        )
        heading = arrayOf(
            "Telegram.Telegram is a cloud-based mobile and desktop messaging app with a focus on security and speed.",
            "Discord.Discord is the easiest way to talk over voice, video, and text. Talk, chat, hang out, and stay close with your friends and communities.",
            "Instagram.Instagram - A simple, fun & creative way to capture, edit & share photos, videos & messages with friends & family.",
            "Gmail.Gmail offline lets you read, reply, delete, and search your Gmail messages when you're not connected to the internet.",
            "Tiktok.TikTok - trends start here. On a device or on the web, viewers can watch and discover millions of personalized short videos.",
            "Webex.Get calling, meetings, messaging, webinars, event management, polling, and more—in one unified platform, at one low cost",
            "WhatsApp.WhatsApp is free and offers simple, secure, reliable messaging and calling"
        )
        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Socialmedia>()
        getUserdata()
    }

    private fun getUserdata() {
        for (i in imageId.indices){
            val social = Socialmedia(imageId[i],heading[i])
            newArrayList.add(social)
        }
        newRecyclerView.adapter = MyAdapter(newArrayList)
    }
}


