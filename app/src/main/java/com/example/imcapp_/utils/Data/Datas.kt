package com.example.imcapp_.utils.Data

import java.time.LocalDate
import java.time.Period

fun calcularIdade(dataNascimento: String): Int {

    //Obter a data Atual
    val hoje = LocalDate.now()

    Log.i("xpto", hoje.toString())

    val data = dataNascimento.split("-")
    Log.i("xpto", data.get(0))
    Log.i("xpto", data.get(1))
    Log.i("xpto", data.get(2))

    val nascimento = LocalDate.of(data.get(2).toInt(),
            data.get(1).toInt(),
            data.get(0).toInt())

    val idade = Period.between(nascimento, hoje).years

    Log.i("xpto", idade.toString())

    return 0
}