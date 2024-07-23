package br.com.aumentosalario.meucodigo.segundatentativa

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    println("Informe seu salário atual: R$")
    val salario = input.nextDouble()

    println("\nSalário atual: R$%.2f".format(salario))

    val percentualReajuste = when (salario) {
        in Double.MIN_VALUE..400.00 -> 15
        in 400.01..800.00 -> 12
        in 800.01..1200.00 -> 10
        in 1200.01..2000.00 -> 7
        else -> 4
    }

    valores(salario, percentualReajuste)
}

fun valores(salario: Double, percentualReajuste: Int) {
    val percentual = percentualReajuste / 100.0
    val reajuste = salario * percentual
    val newSalario = salario + reajuste

    mensagem(newSalario, reajuste, percentualReajuste)
}

fun mensagem(newSalario: Double, reajuste: Double, percentualReajuste: Int) {
    println("\nNovo salário: R$%.2f".format(newSalario))
    println("Reajuste ganho: R$%.2f".format(reajuste))
    println("Em percentual: $percentualReajuste%")
}