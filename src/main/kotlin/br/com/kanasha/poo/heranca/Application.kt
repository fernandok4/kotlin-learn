package br.com.kanasha.poo.heranca

import java.math.BigDecimal

class Application {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val calculadora = Calculadora()
            calculadora.somar(BigDecimal(2))
//            calculadora.potencia(8)

            val calculadoraCientifica = CalculadoraCientifica()
            calculadoraCientifica.somar(BigDecimal(2))
            calculadoraCientifica.potencia(8)
        }
    }
}