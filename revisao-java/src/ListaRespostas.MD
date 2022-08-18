
1. Crie uma variável do tipo String de nome qualquer. Tente atribuir a ela um valor alfanumérico (String) e
um valor numérico de tipo primitivo (int, double, float…). O que acontece e por quê?
R:Ele aceita e contatena o valor atribuido a variavel


2. Crie uma variável numérica de tipo primitivo e de nome qualquer. Tente atribuir a ela um valor numérico
do mesmo tipo e outro valor alfanumérico (String). O que acontece e por quê?
R:Erro de compilação,ped pra mudar a variavel pra String

3. Escreva um método responsável por calcular o abastecimento de um veículo. O método deve retornar o
valor total a ser pago a partir do precoLitro e valorPagamento. Utilize wrapper classes do Java para os
tipos usados e valide - utilizando controle de fluxo - caso valores nulos sejam fornecidos para precoLitro e
valorPagamento.


4. Crie duas Strings com o mesmo conteúdo. Compare as variáveis de três formas: utilizando os métodos
nativos equals() e equalsIgnoreCase() e o operador ==. Quais são os resultados? Todas as três formas são
válidas e adequadas para comparar Strings?


5. Descreva, com as suas palavras, a diferença conceitual entre “tipo primitivo” e “wrapper class”.
ESTRUTURAS DE DADOS SIMPLES
R:R: Tipos primitivos são tipos predefinidos em qualquer linguagem e os Wrapper class são usados por um objeto(Wrapper=aceita valores nulos/Primitivos=Não aceitam valores nulos)

6. Crie um programa que leia dez salários e armazene em um vetor de tipo primitivo. Em seguida, exiba os
dados do vetor em ordem crescente e também decrescente - utilizando métodos nativos do Java.

7. Crie um programa que leia dez números inteiros e armazene em uma lista de tipo primitivo. Em seguida,
exiba os dados da lista em ordem crescente e também decrescente - utilizando métodos nativos do Java.

8. Crie um vetor de String com tamanho definido e limitado. Preencha este vetor utilizando algum laço de
repetição (for each, for ou while). Em seguida, exiba no console os dados do vetor (um a um), o tamanho
dele e verifique se está vazio. Além disso, exiba apenas o último elemento acessando-o diretamente.

9. Crie uma lista de String usando a estrutura de dados ArrayList. Preencha esta lista com a mesma
quantidade de elementos utilizados no Exercício 08. Em seguida, exiba no console: os dados da lista (um a
um), o tamanho da lista e verifique se está vazia. Além disso, exiba apenas o último elemento acessando-o
diretamente.

10. Crie um vetor de String (String[]) com os biomas brasileiros: {“Amazônia”, “Mata Atlântica”, “Cerrado”,
“Caatinga”, “Pampa”, “Pantanal”}. Remova o elemento na posição 3 e realoque os demais elementos de
modo que, ao exibir o vetor com elemento removido, o resultado seja: [“Amazônia”, “Mata Atlântica”,
“Cerrado”, “Pampa”, “Pantanal”].

11. Crie uma lista de salário (números reais ℝ) usando um tipo primitivo adequado. Preencha 100 elementos
nesta lista de forma aleatória (valores entre 1000 e 5000) utilizando métodos nativos do Java. Liste o maior
salário, o menor salário e a média dos salários.

12. Crie uma lista de dez nomes (alfanuméricos) usando uma wrapper class. Atualize um dos nomes da lista.

13. Descreva, com as suas palavras, quais as diferenças práticas que você observa no uso String[] e
ArrayList<String>.
R: As principais vantagens do ArrayList é que não precisa declarar um tamanho,tem diversos metodos que tornam o trabalho mais rapido e o codigo mais limpo.

LEITURA (INPUT) E SAÍDA (OUTPUT) DE DADOS
14. Considere um programa a ser feito no console do Eclipse IDE que deve calcular a média final (MF) de
um(a) discente seguindo a fórmula disponível no Plano de Ensino da disciplina de Programação Orientada
a Objetos. Ao final, deve informar:
● Se MF >= 6: Aprovado(a)
● Se MF >= 4 e < 6: Recuperação
● Se MF < 4: Reprovado(a)
Observações: o programa não deve permitir a entrada de dados alfanuméricos ou nulos.
Crie um método exclusivo para realizar o cálculo da média. Pense nos parâmetros que o método deve ter.
Realizar leitura de dados (nomeAluno e notas) pelo teclado via console.
