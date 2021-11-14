package exerciciosLogica;

import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int codigo;
		
		System.out.println("DIGITE O CÓDIGO DO SEU DEPARTAMENTO:");
		codigo = leia.nextInt();
		
		if(codigo == 10){
			System.out.println("O seu departamento é: Contabilidade");
		
		} else if (codigo == 12){
			System.out.println("O seu departamento é: Almoxarifado");
		
		} else if (codigo == 14){
			System.out.println("O seu departamento é: Informática");
		
		}else {
			System.out.println("Código Inválido");
		}
		
	}

}
