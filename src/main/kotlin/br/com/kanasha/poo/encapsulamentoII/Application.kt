package br.com.kanasha.poo.encapsulamentoII

import java.time.LocalDate

class Application {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val fernando = Pessoa("1234568910", "Fernando", LocalDate.of(1998, 12, 7))
            fernando.email = "teste@gmail.com"
            fernando.falar("Funcionou!")
        }
    }
}