package com.zybooks.recycleandme

import android.content.ContentValues
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun startApp(view: View)
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

        val intent = Intent(this, HomeScreen::class.java)

        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.settings_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.settings) {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
            return true
        }

        return super.onOptionsItemSelected(item)
    }

}