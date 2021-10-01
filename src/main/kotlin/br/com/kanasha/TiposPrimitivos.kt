package br.com.kanasha

import java.math.BigDecimal

fun main() {
    // Byte, Short, Int e Long
    val byte = 127
    val short = 32767
    val int = 2147483647
    val long = 9223372036854775807

    // Float e o Double
    val float = 1.38423f
    val double = 1.38423
    val bigDecimal = BigDecimal("1.38423")

    // Boolean
    val boolean = false
    val boolean2 = true

    // Char
    val char = 'E'

    // String
    val string = "Fernando"

    // Array
    val array = arrayOf(0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20)

    /* Por ser uma linguagem de tipagem estática, o Kotlin não deixa mudarmos uma variavel do tipo Boolean para o tipo Int
    var boolean3 = false
    boolean3 = 5
     */


    /*
    Kotlin é uma linguagem de tipagem estatica, porém, o compilador é inteligente o suficiente para entender qual é o tipo
    da variavel que você está criando a partir do valor que você passou para ela.
     */
}