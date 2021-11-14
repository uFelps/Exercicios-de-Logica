package exerciciosLogica;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double preçoBruto, desconto, preçoVista;
		
		System.out.println("DIGITE O PREÇO BRUTO DO PRODUTO:");
		preçoBruto = leia.nextFloat();
		
		desconto = ((preçoBruto/100)*10);
				
	    preçoVista = (preçoBruto-desconto);
	    
	    System.out.println("O PREÇO TOTAL DO PRODUTO É IGUAL A R$"+preçoBruto+". PAGANDO A VISTA, VOCÊ TEM 10% DE DESCONTO, "
	    		+ "FICANDO COM O PREÇO IGUAL A R$"+preçoVista+". TENDO UMA ECONOMIA DE R$"+desconto+".");

	}

}
