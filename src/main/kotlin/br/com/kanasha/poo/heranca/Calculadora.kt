package br.com.kanasha.poo.heranca

import java.math.BigDecimal
import java.math.RoundingMode

open class Calculadora {
    /*
    public
    private
    protected
     */
    protected var resultado: BigDecimal = BigDecimal.ZERO

    fun somar(a: BigDecimal){
        resultado += a
        mostrarResultado()
    }

    fun subtrair(a: BigDecimal){
        resultado -= a
        mostrarResultado()
    }

    fun multiplicar(a: BigDecimal){
        resultado *= a
        mostrarResultado()
    }

    fun dividir(a: BigDecimal){
        resultado = resultado.divide(a, 8, RoundingMode.HALF_UP)
        mostrarResultado()
    }

    protected fun mostrarResultado() {
        println("O resultado é: $resultado")
    }
}