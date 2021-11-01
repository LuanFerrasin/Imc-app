package com.example.imcapp_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        val buttonEntrar = findViewById<Button>(R.id.btn_entrar)
        val buttonNovaConta = findViewById<Button>(R.id.nova_conta)

        buttonEntrar.setOnClickListener{
            val abrirDashboard = Intent (this,DashBoardActivity::class.java)
            startActivity(abrirDashboard)
        }
        buttonEntrar.setOnClickListener{
            val abrirNovaConta = Intent (this,UsuarioNovoActivity::class.java)
            startActivity(abrirNovaConta)
        }

    }
}