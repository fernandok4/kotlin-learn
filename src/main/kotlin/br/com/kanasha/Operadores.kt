package br.com.kanasha

fun main() {
    // Sinal de Atribuição (=)
    val inteiro = 1
    val helloWorld = "Hello World Operadores"

    /* Operadores com Strings
        + -> Concatenar
     */
    println("Hello " + "World") // Vai resultar em Hello World normalmente
    println("Outra forma de concatenação é ${"Usando essa notação"}")

    /* Operadores Numéricos
        + -> Somar
        - -> Subtrair
        * -> Multiplicar
        / -> Dividir
        % -> Dividir e pegar o resto da divisão
     */
    println("########## Operadores Numéricos ##########")
    println("33 + 47   = ${33 + 47}")    // Deve resultar 33 + 47 = 80
    println("33 - 47   = ${33 - 47}")    // Deve resultar 33 - 47 = -14
    println("7 * 8     = ${7 * 8}")      // Deve resultar 7 * 8 = 56
    println("10 / 3    = ${10 / 3}")     // Deve resultar 10 / 3 = 3
    println("10.0 / 3.0 = ${10.0 / 3.0}") // Deve resultar 10.0 / 3.0 = 3.33333333
    println("10 % 3    = ${10 % 3}")     // Deve resultar em 1, pois o resto de 10 / 3 é 1

    /* Operadores de Comparação
        == -> Igual
        > -> Maior
        < -> Menor
        >= -> Maior ou Igual
        <= -> Menor ou Igual
     */
    println("########## Operadores de Comparação ##########")

    // ==
    println("1 == 1 -> ${1 == 1}") // Retorna true (verdadeiro)
    println("3 == 1 -> ${3 == 1}") // Retorna false (falso)

    // >
    println("5 > 1 -> ${5 > 1}") // Retorna true (verdadeiro)
    println("1 > 3 -> ${1 > 3}") // Retorna false (falso)

    // <
    println("1 < 3 -> ${1 < 3}") // Retorna true (verdadeiro)
    println("5 < 1 -> ${5 < 1}") // Retorna false (falso)

    // >=
    println("5 >= 1 -> ${5 >= 1}") // Retorna true (verdadeiro)
    println("5 >= 5 -> ${5 >= 5}") // Retorna true (verdadeiro)
    println("1 >= 3 -> ${1 >= 3}") // Retorna false (falso)

    // <=
    println("1 <= 3 -> ${1 <= 3}") // Retorna true (verdadeiro)
    println("5 <= 5 -> ${5 <= 5}") // Retorna true (verdadeiro)
    println("5 <= 1 -> ${5 <= 1}") // Retorna false (falso)

    // Também conseguimos fazer comparação de Strings:
    println("Fernando == Fernando -> ${"Fernando" == "Fernando"}") // Retorna true (verdadeiro)
    println("Fernando != Fernando -> ${"Fernando" != "Fernando"}") // Retorna false (falso)

    // Tomar cuidado com comparação de Array
    println(arrayOf(1, 2, 3).contentEquals(arrayOf(1, 2, 3))) // Maneira Certa

    val array1 = arrayOf(1, 2, 3)
    val array2 = arrayOf(1, 2, 3)
    println(array1 == array2)
}