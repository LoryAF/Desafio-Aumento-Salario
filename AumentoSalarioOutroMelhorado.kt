package br.com.aumentosalario.meucodigo.segundatentativa

import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    println("Informe seu salário atual: R$")
    val salario = input.nextDouble()

    println("\nSalário atual: R$%.2f".format(salario))

    val reajuste = when {
        salario > 2000 -> 4
        salario > 1200 -> 7
        salario > 800 -> 10
        salario > 400 -> 12
        else -> 15
    }

    val novoSalario = salario * (1 + reajuste/100.0)

    System.out.printf("\nNovo salario: R$%.2f\n", novoSalario)
    System.out.printf("Reajuste ganho:R$ %.2f\n", salario * reajuste/100.0)
    println("Em percentual: $reajuste %")
}