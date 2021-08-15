import java.util.Scanner;
import java.util.Locale;

public class Cpf{
	public static void main(String[] args) {

		Locale.setDefault(new Locale("en", "US"));

		Scanner sc = new Scanner(System.in);
		
		String[] cpf = new String[4]; 

                //continue a solucao

		cpf = sc.nextLine().split("      ");


			System.out.printf("%s\n",cpf[i]);

		sc.close();
	}
}

/*
Iniciando a programação em Java
2 / 3 - Entrada e Saída CPF

 Básico
 Princípios Básicos
Desafio
Elabore um programa que possuas as características abaixo:

Leia os dados de um CPF no formato XXX.YYY.ZZZ-DD;
Imprima os quatro grupos numéricos, sendo um valor por linha.
Entrada
A entrada consiste vários arquivos de teste e cada um possuindo uma linha com formato XXX.YYY.ZZZ-DD, onde XXX, YYY, ZZZ, DD são números inteiros.

Saída
Para cada arquivo da entrada, tem que ter um arquivo de saída com quatro linhas, e em cada linha um número inteiro de acordo com procedimento 2 descrito no Desafio. Confira o exemplo abaixo:

 
Exemplos de Entrada	
000.000.000-00
Exemplos de Saída
000

000

000

00

Exemplos de Entrada	
320.025.102-01
Exemplos de Saída
320

025

102

01

####

Todas as entradas e saída dos algoritmos são utilizados o STDIN e STDOUT de cada linguagem, abaixo tem algumas dicas de como utilizar cada STDIN e STDOUT de cada linguagem.
JavaScript

Em JavaScript as funções de STDIN e STDOUT respectivamente sãogets e console.log, a função gets é implementada internamente para auxiliar a entrada dos dados.

Exemplo:
let line = gets(); // Retorna a próxima linha de entrada
console.log(line); // Imprime o dado

Java

Em Java existe várias formas de implementar o STDIN e STDOUT recomendamos utilizar BufferedReader para o STDIN e o System.out.println para o STDOUT.

Exemplo:
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine()); // Lê a linha de entrada
int a = Integer.parseInt(st.nextToken());
System.out.println(a); // Imprime o dado

Python

Em Python existe várias formas de implementar o STDIN e STDOUT recomendamos utilizar sys.stdin.readline para o STDIN e o print para o STDOUT.

Exemplo:
import sys
a = int(sys.stdin.readline()) // Lê a linha de entrada
print(a); // Imprime o dado
*/