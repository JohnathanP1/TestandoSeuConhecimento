package Basicos;

import java.util.Scanner;

public class Calculadora90 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double primeiroValor;
		double segundoValor;
		double soma , subtracao , multiplicacao , divisao;
		
		System.out.println("Por favor escreva um valor");
		primeiroValor = leitor.nextDouble();
		
		System.out.println("Por favor escreva um segundo valor");
		segundoValor = leitor.nextDouble();
		soma = primeiroValor + segundoValor;
		System.out.println("A soma entre os dois valores � " + soma);
		subtracao = primeiroValor - segundoValor;
		System.out.println("A soma entre os dois valores � " + subtracao);
		multiplicacao = primeiroValor * segundoValor;
		System.out.println("A soma entre os dois valores � " + multiplicacao);
		divisao = primeiroValor / segundoValor;
		System.out.println("A soma entre os dois valores � " + divisao);
		
		
		
		
		
		
		
		leitor.close();
		
	}

}
