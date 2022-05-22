package com.zybooks.recycleandme

import android.content.ContentValues
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
    }

    fun plasticIdentification(view: View)
    {
        var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.plastic_crinkle)
        mediaPlayer?.setOnCompletionListener(MediaPlayer.OnCompletionListener { mp ->
            if (mp != null) {
                mp.release()
                mediaPlayer = null
                Log.d(ContentValues.TAG, "release mediaplayer")
            }
        })
        mediaPlayer?.start()

        val intent = Intent(this, PlasticIdentificationNumbers::class.java)

        startActivity(intent)
    }
}