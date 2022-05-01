package br.com.kanasha.poo.encapsulamentoII

import java.time.LocalDate

class Pessoa(
    val cpf: String,
    val nome: String,
    val dtNascimento: LocalDate
){
    val idade = LocalDate.now().year - dtNascimento.year
    var email = ""
        set(value){
            if(!Regex("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}\$").matches(value)){
                throw Exception("Ops! Email invalido.")
            }
            field = value
        }

    fun falar(mensagem: String){
        println("$nome falou: $mensagem")
    }
}