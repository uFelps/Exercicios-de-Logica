package exerciciosLogica;

import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int codigo;
		
		System.out.println("DIGITE O C�DIGO DO SEU DEPARTAMENTO:");
		codigo = leia.nextInt();
		
		if(codigo == 10){
			System.out.println("O seu departamento �: Contabilidade");
		
		} else if (codigo == 12){
			System.out.println("O seu departamento �: Almoxarifado");
		
		} else if (codigo == 14){
			System.out.println("O seu departamento �: Inform�tica");
		
		}else {
			System.out.println("C�digo Inv�lido");
		}
		
	}

}
