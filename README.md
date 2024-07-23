# Desafio de Reajuste de Salários

A empresa ABC decidiu implementar um novo sistema de aumento salarial para seus funcionários. O desafio é calcular o novo salário de um funcionário com base em seu salário atual e aplicar o percentual de reajuste correspondente, conforme a tabela abaixo:

| Faixa de Salário        | Percentual de Reajuste |
|-------------------------|------------------------|
| Até R$ 400.00           | 15%                    |
| R$ 400.01 a R$ 800.00   | 12%                    |
| R$ 800.01 a R$ 1200.00  | 10%                    |
| R$ 1200.01 a R$ 2000.00 | 7%                     |
| Acima de R$ 2000.00     | 4%                     |

## Objetivo

Dado o salário atual de um funcionário, o objetivo é calcular e exibir:
1. O novo salário após aplicar o reajuste.
2. O valor do reajuste ganho.
3. O percentual de reajuste aplicado.

## Entrada

O programa deve ler um valor de ponto flutuante representando o salário atual, com duas casas decimais. Este valor pode ser maior ou igual a zero.

## Saída

O programa deve imprimir três linhas com as seguintes informações:
1. **Novo salário**: O salário após o reajuste, formatado com duas casas decimais.
2. **Reajuste ganho**: O valor do reajuste aplicado, formatado com duas casas decimais.
3. **Percentual de reajuste**: O percentual de reajuste aplicado, seguido pelo símbolo `%`.

### Exemplo de Entrada e Saída

| Exemplo de Entrada | Exemplo de Saída        |
|--------------------|-------------------------|
|                    | Novo salario: 460.00    |
| 400.00             | Reajuste ganho: 60.00   |
|                    | Em percentual: 15 %     |
|--------------------|-------------------------|
|                    | Novo salario: 880.01    |
| 800.01             | Reajuste ganho: 80.00   |
|                    | Em percentual: 10 %     |
|--------------------|-------------------------|
|                    | Novo salario: 2140.00   |
| 2000.00            | Reajuste ganho: 140.00  |
|                    | Em percentual: 7 %      |
