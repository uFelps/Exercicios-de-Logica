package exerciciosLogica;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double pre�oBruto, desconto, pre�oVista;
		
		System.out.println("DIGITE O PRE�O BRUTO DO PRODUTO:");
		pre�oBruto = leia.nextFloat();
		
		desconto = ((pre�oBruto/100)*10);
				
	    pre�oVista = (pre�oBruto-desconto);
	    
	    System.out.println("O PRE�O TOTAL DO PRODUTO � IGUAL A R$"+pre�oBruto+". PAGANDO A VISTA, VOC� TEM 10% DE DESCONTO, "
	    		+ "FICANDO COM O PRE�O IGUAL A R$"+pre�oVista+". TENDO UMA ECONOMIA DE R$"+desconto+".");

	}

}
