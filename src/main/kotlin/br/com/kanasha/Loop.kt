package br.com.kanasha

import java.math.BigDecimal

fun main() {
    val precoDosProdutos = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )
    // for
    var precoTotal = BigDecimal.ZERO
    for(preco in precoDosProdutos){
        precoTotal += preco
    }
    println("Preço Total: $precoTotal")
    // while
    var contador = 0
    precoTotal = BigDecimal.ZERO
    while (contador < precoDosProdutos.size){
        precoTotal += precoDosProdutos[contador]
        contador += 1
    }
    println("Preço Total: $precoTotal")
    // doWhile
    contador = 0
    precoTotal = BigDecimal.ZERO
    do {
        precoTotal += precoDosProdutos[contador]
        contador += 1
    } while (contador < precoDosProdutos.size)
    println("Preço Total: $precoTotal")
}