package exerciciosLogica;

import java.util.Scanner;

public class D3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int codigoDepartamento = 0;
		
		System.out.println("DIGITE O C�DIGO DO SEU DEPARTAMENTO:");
		codigoDepartamento = leia.nextInt();
		
		if (codigoDepartamento == 1){
			System.out.println("O SEU DEPARTAMENTO �: EXPEDI��O");
		
		} if (codigoDepartamento == 2){
			System.out.println("O SEU DEPARTAMENTO �: RECURSOS HUMANOS");
		
		} if (codigoDepartamento == 3){
			System.out.println("O SEU DEPARTAMENTO �: LOG�STICA");
		
		} if (codigoDepartamento == 4){
			System.out.println("O SEU DEPARTAMENTO �: CONTABILIDADE");
		
		} 

	}

}
