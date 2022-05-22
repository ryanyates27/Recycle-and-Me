package com.zybooks.recycleandme

import android.content.ContentValues.TAG
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.media.SoundPool
import android.media.AudioAttributes
import android.util.Log
import android.widget.ImageButton


class PlasticIdentificationNumbers : AppCompatActivity()
{
    lateinit var PETtextView: TextView
    lateinit var HDPEtextView: TextView
    lateinit var PVCtextView: TextView
    lateinit var LDPEtextView: TextView
    lateinit var PPtextView: TextView
    lateinit var PStextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plastic_identification_numbers)

        PETtextView = findViewById(R.id.PETtext)
        HDPEtextView = findViewById(R.id.HDPEtext)
        PVCtextView = findViewById(R.id.PVCtext)
        LDPEtextView = findViewById(R.id.LDPEtext)
        PPtextView = findViewById(R.id.PPtext)
        PStextView = findViewById(R.id.PStext)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }


    fun onButtonClickedPET(view: View)
    {

        var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.plastic_crinkle)
               mediaPlayer?.setOnCompletionListener(MediaPlayer.OnCompletionListener { mp ->
                   if (mp != null) {
                       mp.release()
                       mediaPlayer = null
                       Log.d(TAG, "release mediaplayer")
                   }
               })
        mediaPlayer?.start()

            val i = Intent(this, PINInfoPage::class.java).apply {
                putExtra("Data", PETtextView.text.toString())
            }
            startActivity(i)

    }

    fun onButtonClickedHDPE(view: View)
    {
        var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.plastic_crinkle)
        mediaPlayer?.setOnCompletionListener(MediaPlayer.OnCompletionListener { mp ->
            if (mp != null) {
                mp.release()
                mediaPlayer = null
                Log.d(TAG, "release mediaplayer")
            }
        })
        mediaPlayer?.start()


        val i = Intent(this, PINInfoPage::class.java).apply {
            putExtra("Data", HDPEtextView.text.toString())
        }
        startActivity(i)

    }

    fun onButtonClickedPVC(view: View)
    {
        var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.plastic_crinkle)
        mediaPlayer?.setOnCompletionListener(MediaPlayer.OnCompletionListener { mp ->
            if (mp != null) {
                mp.release()
                mediaPlayer = null
                Log.d(TAG, "release mediaplayer")
            }
        })
        mediaPlayer?.start()


        val i = Intent(this, PINInfoPage::class.java).apply {
            putExtra("Data", PVCtextView.text.toString())
        }
        startActivity(i)

    }

    fun onButtonClickedLDPE(view: View)
    {
        var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.plastic_crinkle)
        mediaPlayer?.setOnCompletionListener(MediaPlayer.OnCompletionListener { mp ->
            if (mp != null) {
                mp.release()
                mediaPlayer = null
                Log.d(TAG, "release mediaplayer")
            }
        })
        mediaPlayer?.start()


        val i = Intent(this, PINInfoPage::class.java).apply {
            putExtra("Data", LDPEtextView.text.toString())
        }
        startActivity(i)

    }

    fun onButtonClickedPP(view: View)
    {
        var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.plastic_crinkle)
        mediaPlayer?.setOnCompletionListener(MediaPlayer.OnCompletionListener { mp ->
            if (mp != null) {
                mp.release()
                mediaPlayer = null
                Log.d(TAG, "release mediaplayer")
            }
        })
        mediaPlayer?.start()


        val i = Intent(this, PINInfoPage::class.java).apply {
            putExtra("Data", PPtextView.text.toString())
        }
        startActivity(i)

    }

    fun onButtonClickedPS(view: View)
    {
        var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.plastic_crinkle)
        mediaPlayer?.setOnCompletionListener(MediaPlayer.OnCompletionListener { mp ->
            if (mp != null) {
                mp.release()
                mediaPlayer = null
                Log.d(TAG, "release mediaplayer")
            }
        })
        mediaPlayer?.start()


        val i = Intent(this, PINInfoPage::class.java).apply {
            putExtra("Data", PStextView.text.toString())
        }
        startActivity(i)

    }
}