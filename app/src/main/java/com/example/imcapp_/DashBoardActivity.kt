package com.example.imcapp_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DashBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
        supportActionBar!!.hide()

    }
}