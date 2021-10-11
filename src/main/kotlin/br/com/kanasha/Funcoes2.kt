package br.com.kanasha

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    // String
    val nome = "Fernando de Oliveira Kanashiro"
    val tamanhoNome = nome.count() // Pega o tamanho da String
    println("tamanhoNome: $tamanhoNome")
    val splitNome = nome.split("") // Separa o nome caractere por caractere
    println("splitNome: $splitNome")
    val dropLastNome = nome.dropLast(4) // Remove as 4 ultimas letras do nome
    println("dropLastNome: $dropLastNome")
    val dropNome = nome.drop(4) // Remove as 4 primeiras letras do nome
    println("dropNome: $dropNome")
    val containsNome = nome.contains('d') // Verifica se contem a letra d na palavra
    println("containsNome: $containsNome")
    // Array
    val array = arrayOf(31, 22, 31, 1, 5, 6, 84, 8, 3, 10)
    val sumOfArray = array.sumOf { it }
    println("sumOfArray: $sumOfArray")
    val reverseArray = array.reversedArray()
    println("reverseArray: ${arrayToString(reverseArray)}")
    val sortArray = array.sortedArray()
    println("sortArray: ${arrayToString(sortArray)}")

    // BigDecimal
    val bigdecimal = BigDecimal("2")
    val powBigDecimal = bigdecimal.pow(3)
    println("powBigDecimal: $powBigDecimal")
    val divideBigDecimal = bigdecimal.divide(BigDecimal("3"), 8, RoundingMode.HALF_UP)
    println("divideBigDecimal: $divideBigDecimal")
}

fun arrayToString(array: Array<Int>) = array.fold("") { acc, i -> "$acc $i" }