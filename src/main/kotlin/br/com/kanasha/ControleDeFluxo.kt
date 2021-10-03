package br.com.kanasha

fun main() {
    // if (se)
    val tipoDeRota = "AVIÃO" // A_PE, CARRO, ONIBUS E TREM
    if(tipoDeRota == "A_PE"){
        println("Traçando rota a pé")
    } else {
        // Não é recomendavel fazer ifs encadeados (É má prática.)
        if(tipoDeRota == "CARRO"){
            println("Traçando rota a carro")
        } else {
            if(tipoDeRota == "ONIBUS"){
                println("Traçando rota de onibus")
            } else {
                if(tipoDeRota == "TREM"){
                    println("Traçando rota de trem")
                } else {
                    println("Rota não implementada")
                }
            }
        }
    }
    // when (quando)
    when(tipoDeRota){
        "A_PE" -> println("Traçando rota a pé")
        "CARRO" -> println("Traçando rota a carro")
        "ONIBUS" -> println("Traçando rota de onibus")
        "TREM" -> println("Traçando rota de trem")
        else -> println("Rota não implementada")
    }
}