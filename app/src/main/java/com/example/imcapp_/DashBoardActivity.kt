package com.example.imcapp_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DashBoardActivity : AppCompatActivity() {

    lateinit var tvNome: TextView
    lateinit var tvProfissao: TextView
    lateinit var tvAltura: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        tvNome = findViewById(R.id.tv_dash_name)
        tvProfissao = findViewById(R.id.tv_dash_profisssao)
        tvAltura = findViewById(R.id.tv_dash_altura)

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