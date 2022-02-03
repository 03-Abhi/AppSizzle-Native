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

class DialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dial)
        val callBtn:Button = findViewById(R.id.call_btn)
        val number:TextView=findViewById(R.id.call_text)


        callBtn.setOnClickListener {
            if (number.length()==0) {
                Toast.makeText(this, "Enter Your Number First! ", Toast.LENGTH_SHORT).show()
            }
            else {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:$(number)")
                startActivity(intent)
            }

        }
    }
}