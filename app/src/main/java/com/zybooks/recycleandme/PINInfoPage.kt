package com.zybooks.recycleandme

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.zybooks.recycleandme.databinding.ActivityPininfoPageBinding

class PINInfoPage : AppCompatActivity() {

    private lateinit var binding: ActivityPininfoPageBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pininfo_page)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val intentValue = intent.getStringExtra("Data")
        findViewById<TextView>(R.id.pinTextView).apply{
            text = intentValue.toString()
        }

    }

}