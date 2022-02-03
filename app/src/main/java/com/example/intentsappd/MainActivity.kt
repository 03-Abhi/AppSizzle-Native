package com.example.intentsappd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ToggleButton
import com.bumptech.glide.Glide


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val togL:ToggleButton=findViewById(R.id.btn_tap)

        val ivImg:ImageView=findViewById(R.id.imageView)

        togL.setOnCheckedChangeListener{_,isChecked->
            if(isChecked){
                Glide.with(this).asGif().load("https://c.tenor.com/9IVmLRYNCrQAAAAC/bhagam-bhag-aeyy-heyy.gif%22)").into(ivImg)


            }else{
                Glide.with(this).asGif().load("https://media2.giphy.com/media/l1AvzuRfatwZYKaM8/giphy.gif?cid=ecf05e474liexy6hhb8ejjiirbl1zlpyr2doji6cws9iym13&rid=giphy.gif&ct=g)").into(ivImg)

            }
        }


        val btns = findViewById<Button>(R.id.btn_share)
        btns.setOnClickListener {
            val intent = Intent(this , ShareText::class.java)
            startActivity(intent)}


            val btnm = findViewById<Button>(R.id.btn_map)
             btnm.setOnClickListener {
                 val intent = Intent(this, MapActivity::class.java)
                  startActivity(intent)}


                val btnd = findViewById<Button>(R.id.btn_dial)
                btnd.setOnClickListener {
             val intent = Intent(this, DialActivity::class.java)
             startActivity(intent)}




             }
             }



