package com.example.myapplicationproject

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var open_music=findViewById<Button>(R.id.play)
        var close_music=findViewById<Button>(R.id.stop)

        var mp3:MediaPlayer=MediaPlayer.create(this,R.raw.music)
        open_music.setOnClickListener {
            mp3.start()
        }

        close_music.setOnClickListener {
            mp3.stop()
        }

        var start=findViewById<Button>(R.id.start)
        start.setOnClickListener {
            var setActivityToIntent=Intent(this,Start::class.java)
            startActivity(setActivityToIntent)
        }
        var exist=findViewById<Button>(R.id.exist)
        exist.setOnClickListener {
            finish()
        }
}
}