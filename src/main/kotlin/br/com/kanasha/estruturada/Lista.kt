package br.com.kanasha.estruturada

fun main() {
    var array = arrayOf(
        1, 2, 3, 4, 5, 6
    )
    println(array[1])
    array[1] = 9
    println(array[1])
//    array[6] = 7
    array += arrayOf(7)
    println(array[6])
    var lista = listOf(
        1, 2, 3, 4, 5, 6
    )
    lista += listOf(7)
    println(lista[6])

    val mutableList = mutableListOf(
        1, 2, 3, 4, 5, 6
    )
    mutableList.add(7)
    println(mutableList[6])
    printarTodosOsElementos(mutableList)
    printarTodosOsElementos(lista)
}

fun printarTodosOsElementos(lista: List<Int>){
    lista.forEachIndexed { index, i ->
        println("index: $index valor: $i")
    }
}