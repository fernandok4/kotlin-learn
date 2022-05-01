package br.com.kanasha.estruturada

import java.text.SimpleDateFormat
import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*

fun main() {
    // Conhecendo os tipos datas no Kotlin
    val date = Date()
    val localDate = LocalDate.now()
    val localDateTime = LocalDateTime.now()

    // Como parsear de string para data?
    var yesterday = LocalDate.from(DateTimeFormatter.ofPattern("dd/MM/yyyy").parse("20/11/2021"))
    var yesterdayTime = LocalDateTime.from(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").parse("20/11/2021 04:00"))
    val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
    var yesterdayDate = simpleDateFormat.parse("20/11/2021")
    println(yesterday)
    println(yesterdayTime)
    println(yesterdayDate)

    // Como formatar a data da maneira desejada?
    val simpleDateFormat2 = SimpleDateFormat("yyyyMMdd")
    println(DateTimeFormatter.ofPattern("yyyyMMdd").format(yesterday))
    println(DateTimeFormatter.ofPattern("yyyyMMddHHmm").format(yesterdayTime))
    println(simpleDateFormat2.format(yesterdayDate))

    // Fazendo operações com datas
    // Somar Data e Subtrair Data
    yesterday = yesterday.plusDays(7)
    yesterdayTime = yesterdayTime.plusDays(3)
    println(yesterday)
    println(yesterdayTime)
    yesterdayDate = Date(yesterdayDate.toInstant().plus(7, ChronoUnit.DAYS).toEpochMilli())
    println(yesterdayDate)
    // Comparação de Datas
    println(yesterday.isAfter(yesterdayTime.toLocalDate()))
    println(yesterdayTime.isAfter(yesterday.atStartOfDay()))
    println(date.after(yesterdayDate))
    // Comparação dia da semana
    while (yesterday.dayOfWeek == DayOfWeek.SUNDAY || yesterday.dayOfWeek == DayOfWeek.SATURDAY){
        yesterday = yesterday.plusDays(1)
    }
    println(yesterday)
    val calendar = Calendar.getInstance()
    calendar.time = yesterdayDate
    while(calendar.get(Calendar.DAY_OF_WEEK) == 1 || calendar.get(Calendar.DAY_OF_WEEK) == 7){
        yesterdayDate = Date(yesterdayDate.toInstant().plus(1, ChronoUnit.DAYS).toEpochMilli())
        calendar.time = yesterdayDate
    }
    println(yesterdayDate)
}