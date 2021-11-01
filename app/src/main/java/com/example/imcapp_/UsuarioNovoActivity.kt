package com.example.imcapp_

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.RadioButton
import java.util.*

class UsuarioNovoActivity : AppCompatActivity() {

    lateinit var editNome: EditText
    lateinit var editEmail: EditText
    lateinit var editSenha: EditText
    lateinit var editProfissao: EditText
    lateinit var editAltura: EditText
    lateinit var editPeso: EditText
    lateinit var editDataNascimento: EditText
    lateinit var radioMasculino: RadioButton
    lateinit var radioFeminino: RadioButton

    override fun onCreate(savedInstanceState : Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo_usuario)

        editNome = findViewById(R.id.nome)
        editEmail = findViewById(R.id.email)
        editSenha = findViewById(R.id.senha)
        editProfissao = findViewById(R.id.profissao_dados)
        editAltura = findViewById(R.id.altura)
        editPeso = findViewById(R.id.peso)
        editDataNascimento = findViewById(R.id.data_nascimento)
        radioMasculino = findViewById(R.id.sexo_m)
        radioFeminino = findViewById(R.id.sexo_f)

        supportActionBar!!.title = "Nova Conta"

        //Criando Calendario (Obtendo data de hoje)
        val calendario = Calendar.getInstance()
        val dia = calendario.get(Calendar.DAY_OF_MONTH)
        val mes = calendario.get(Calendar.MONTH)
        val ano =  calendario.get(Calendar.YEAR)

        //Colocar um Listner de click no editText Data de Nascimento
        //Para abrir o Calendario(DatePicker)

        editDataNascimento.setOnClickListener {

            val datePicker = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{view,_ano,_mes,_dia ->


            var mesReal = _mes + 1

            var diaString = "$_dia"
            var mesString = "$mesReal"

            if(mesReal < 10) {
                mesString = "0$mesReal"
            }
                if(_dia < 10) {
                    diaString = "0$_dia"
                }

            editDataNascimento.setText  ("$diaString/$mesString/$_ano")

            }, ano,mes,dia)

            datePicker.show()

        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.novo_usuario, menu)

        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (validaCampos()) {
            // grava os dados

        } else {
            // gravou nada!!
        }

        return true
    }

    private fun validaCampos() : Boolean {
        var valido = true

        if(editEmail.text.isEmpty()) {
            editEmail.error = "E-mail é obrigatório!"
            valido = false
        }

        if(editSenha.text.isEmpty()) {
            editSenha.error = "Senha é obrigatório"
            valido = false
        }

        return valido
    }
}
}