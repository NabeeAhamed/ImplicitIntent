package com.nabeel.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnDial: Button
    lateinit var btnsms: Button
    lateinit var btnbrowser: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnDial = findViewById(R.id.btnDial)
        btnsms = findViewById(R.id.btn_sms)
        btnbrowser =findViewById(R.id.btn_browser)

        with(btnDial) {
            setOnClickListener(View.OnClickListener {
                val intent = Intent(Intent.ACTION_DIAL)

                intent.data = Uri.parse("tel:" + btnDial.getText())
                startActivity(intent) })

        btnsms.setOnClickListener(View.OnClickListener {
            val intent=Intent(Intent.ACTION_MAIN)
            with(intent) {
             getStringExtra(Intent.CATEGORY_APP_MESSAGING)
                startActivity(this)
            }
        })



        }
        btnbrowser.setOnClickListener (View.OnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse("https://www.google.com/")
            startActivity(intent)})
        }}














