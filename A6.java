package exerciciosLogica;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double ht, vh, pd, sb, td, sl;
		
		System.out.println("DIGITE AS HORAS TRABALHADAS:");
		ht = leia.nextFloat();
		
		System.out.println("DIGITE O VALOR DAS HORAS:");
		vh = leia.nextFloat();
		
		System.out.println("DIGITE O PERCENTUTAL DE DESCONTO");
		pd = leia.nextFloat();
		
		sb = (ht*vh);
		
		td = ((pd/100)*sb);
		
		sl = (sb-td);
		
		
		System.out.println("SALÁRIO BRUTO: R$"+sb);
		System.out.println("DESCONTO TOTAL: R$"+td);
		System.out.println("SALÁRIO LÍQUIDO: R$"+sl);
		
		
				
	    

	}

}