package Basicos;

import java.util.Scanner;

public class RecebendoDados2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		
		String nomeUsuario;
		
		System.out.println("Por favor, escreva seu nome ");
		nomeUsuario = leitor.next();
		System.out.println("Obrigado por utilizar meu primeiro programa," + nomeUsuario);
		
		
		
		
		leitor.close();
	}

}
