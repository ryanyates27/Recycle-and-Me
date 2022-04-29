package com.zybooks.recycleandme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PlasticIdentificationNumbers : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plastic_identification_numbers)
    }

    fun plasticIdentificationNumbers(view: View)
    {
        val intent = Intent(this, PID::class.java)

        startActivity(intent)
    }
}