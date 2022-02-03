package com.example.intentsappd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentsappd.R
import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.EditText

class ShareText : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share_text)
        val share_btn = findViewById<Button>(R.id.share_btn)
        val share_text=findViewById<EditText>(R.id.share_text)
        share_btn.setOnClickListener {
            val shareIntent = Intent()
            shareIntent.action = Intent.ACTION_SEND
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, share_text.text.toString());
            startActivity(Intent.createChooser(shareIntent, "Share via"))
        }
    }
}