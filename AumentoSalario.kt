package br.com.aumentosalario.meucodigo.primeiratentativa

import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)

    println("Informe seu salário atual: R$")
    val salario = input.nextDouble()

    println("\nSalário atual: R$%.2f".format(salario))

    if (salario <= 400.00) {
        valores(salario, 15)
    } else if (salario in 400.01..800.00) {
        valores(salario, 12)
    } else if (salario in 800.01..1200.00){
        valores(salario, 10)
    } else if (salario in 1200.01..2000.00){
        valores(salario,7)
    } else {
        valores(salario, 4)
    }

}

fun valores(salario: Double, percentualReajuste: Int) {
    val percentual = percentualReajuste/100.0
    val reajuste = salario * percentual
    val newSalario = salario + reajuste
    mensagem(newSalario, reajuste, percentualReajuste)
}

fun mensagem(newSalario: Double, reajuste: Double, percentualReajuste:Int) {
    println("\nNovo salario: R$%.2f".format(newSalario))
    println("Reajuste ganho: R$%.2f".format(reajuste))
    println("Em percentual: $percentualReajuste%")
}




