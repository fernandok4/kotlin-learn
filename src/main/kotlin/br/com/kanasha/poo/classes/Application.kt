package br.com.kanasha.poo.classes

import java.time.LocalDate

class Application {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val fernando = Pessoa("12345678910", "Fernando", LocalDate.of(1998, 12, 7))
            fernando.falar("Olá mundo da programação orientada a objetos!")
        }
    }
}