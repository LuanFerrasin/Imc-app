package com.example.imcapp_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.imcapp_.utils.Data.calcularIdade

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        val buttonEntrar = findViewById<Button>(R.id.btn_entrar)
        val buttonNovoUsuario = findViewById<Button>(R.id.button_nova_conta)
        val editEmail = findViewById<EditText>(R.id.email)
        val editSenha = findViewById<EditText>(R.id.senha)

        buttonEntrar.setOnClickListener{

            calcularIdade("2005/05/08")

            val arquivo = getSharedPreferences("usuario", MODE_PRIVATE)
            val email = arquivo.getString("email", "")
            val senha = arquivo.getString("senha", "")

            if(email == editEmail.text.toString() && senha == editSenha.text.toString()){

                val entrar = Intent(this, DashBoardActivity::class.java)
                startActivity(entrar)

            }else{
                Toast.makeText(this,"Senha ou Usuario Incorretos!!", Toast.LENGTH_SHORT).show()
            }


        }
        buttonNovoUsuario.setOnClickListener{
            val abrirNovaConta = Intent (this,UsuarioNovoActivity::class.java)
            startActivity(abrirNovaConta)
        }

    }
}