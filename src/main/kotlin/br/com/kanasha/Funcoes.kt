package br.com.kanasha

import java.math.BigDecimal

fun main() {
    val precoDosProdutos = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )
    val precoDosProdutos2 = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )
    val precoDosProdutos3 = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )
    // for
    val precoProduto = somarPrecoProdutos(precoDosProdutos)
    val precoProduto2 = somarPrecoProdutos(precoDosProdutos2)
    val precoProduto3 = somarPrecoProdutos(precoDosProdutos3)
    println("Preço Total: $precoProduto")
    println("Preço Total: $precoProduto2")
    println("Preço Total: $precoProduto3")
}

fun somarPrecoProdutos(produtos: Array<BigDecimal>): BigDecimal {
    var precoTotal = BigDecimal.ZERO
    for(preco in produtos){
        precoTotal += preco
    }
    return precoTotal
}