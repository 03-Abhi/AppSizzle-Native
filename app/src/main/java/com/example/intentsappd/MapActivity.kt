package com.example.intentsappd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentsappd.R
import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
        val locate_btn = findViewById<Button>(R.id.locate_btn)
        val location:TextView=findViewById(R.id.locate_text)
        locate_btn.setOnClickListener {
            if (location.length()==0) {
                Toast.makeText(this, "Enter Location To Be Searched  First! ", Toast.LENGTH_SHORT).show()
            }
            else {

                val intent = Intent(
                Intent.ACTION_VIEW ,
                Uri.parse("geo:0,0?q=${location.text.toString()}")
            )
            startActivity(intent)
        }
    }
}}