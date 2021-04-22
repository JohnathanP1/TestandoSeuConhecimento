package Basicos;

import java.text.DecimalFormat;

public class FormatarDecimal {

	public static void main(String[] args) {
		
		double resultado = 45.12999;
		
		
		DecimalFormat formatador = new DecimalFormat("##.00");
	
	
		System.out.println(formatador.format(resultado));
		
		
		
		
	}

}
