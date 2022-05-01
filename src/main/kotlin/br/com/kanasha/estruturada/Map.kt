package br.com.kanasha.estruturada

import kotlin.random.Random
import kotlin.system.measureNanoTime

fun main() {
    val map1 = mapOf(
        1 to "Muito Ruim",
        2 to "Ruim",
        3 to "Razoavel",
        4 to "Bom",
        5 to "Muito Bom"
    )
    val mutable1 = mutableMapOf(
        1 to "Muito Ruim",
        2 to "Ruim",
        3 to "Razoavel",
        4 to "Bom"
    )
    mutable1[5] = "Muito Bom"
    println(map1[1])
    println(mutable1[1])
    // ==============================================================================
    val listaCodigos = Array(100000) { Random.nextInt(1, 6) }
    val listMap = listOf(
        Pair(1, "Muito Ruim"),
        Pair(2, "Ruim"),
        Pair(3, "Razoavel"),
        Pair(4, "Bom"),
        Pair(5, "Muito Bom")
    )
    val time1 = measureNanoTime {
        for(codigo in listaCodigos){
            val categoria = listMap.find { it.first == codigo }!!
            categoria.second
        }
    }
    val time2 = measureNanoTime {
        for(codigo in listaCodigos){
            val categoria = map1[codigo]
            categoria
        }
    }
    println(time1)
    println(time2)
}