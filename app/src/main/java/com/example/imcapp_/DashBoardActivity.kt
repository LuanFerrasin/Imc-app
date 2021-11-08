package com.example.imcapp_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DashBoardActivity : AppCompatActivity() {

    lateinit var tvNome: TextView = findViewById(R.id.tv_dash_name)
    lateinit var tvProfissao: TextView = findViewById(R.id.tv_dash_profisssao)
    lateinit var tvAltura: TextView = findViewById(R.id.tv_dash_altura)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        preencherDashboard()
        supportActionBar!!.hide()
    }
    private fun preencherDashboard(){
        val arquivo = getSharedPreferences("usuario", MODE_PRIVATE)
        tvNome.text = arquivo.getString("nome", "")
        tvProfissao.text = arquivo.getString("profussao", "")
        tvAltura.text = arquivo.getFloat("altura", 0.0f).toString()
    }
}