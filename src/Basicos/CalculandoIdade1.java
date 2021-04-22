package Basicos;

import java.util.Scanner;

public class CalculandoIdade1 {
	//Criando um desvio 
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int idade;
		System.out.println("Por favor , digite sua idade");
		idade = leitor.nextInt();
		
		System.out.println("Deixe-me , verifica sua idade");
		if (idade>=12)  {
			
			
		System.out.println("Você pode jogar!");
		int ano;
		System.out.println("Por favor , digite a data do seu nascimento");
		ano = leitor.nextInt();
		System.out.println("Que legal, você nasceu em " + ano);
		idade = 2021 - ano;
		System.out.println("Pelo que eu vi , você nasceu em " + idade);
		idade = leitor.nextInt();
		if (idade>=18) {
			
			
			
			
		
		
		
		leitor.close();
		
		}
		
		}
		
		
	}

}
