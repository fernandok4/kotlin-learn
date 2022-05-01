package br.com.kanasha.poo.heranca

import java.math.MathContext
import java.math.RoundingMode

class CalculadoraCientifica: Calculadora() {

    fun potencia(a: Int){
        resultado = resultado.pow(a, MathContext(8, RoundingMode.HALF_UP))
        mostrarResultado()
    }
}