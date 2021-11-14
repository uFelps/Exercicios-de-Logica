package exerciciosLogica;

import java.util.Scanner;

public class D9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int codigo;
		double salarioAtual, reajuste, novoSalario;
		
		System.out.println("DIGITE O CÓDIGO DO SEU DEPARTAMENTO:");
		codigo = leia.nextInt();
		
		System.out.println("DIGITE O VALOR DO SEU SÁLARIO:");
		salarioAtual = leia.nextDouble();
		
		if(codigo == 1){
			System.out.println("OPERADOR");
			reajuste = (salarioAtual*0.05);
			novoSalario = (salarioAtual + reajuste);
			
			System.out.println("SÁLARIO ATUAL: R$"+salarioAtual);
			System.out.println("COM O REAJUSTE DE 5% O SEU NOVO SÁLARIO É R$"+novoSalario);
		
		}if (codigo == 2){
			System.out.println("PROGRAMADOR");
			reajuste = (salarioAtual*0.10);
			novoSalario = (salarioAtual + reajuste);
			
			System.out.println("SÁLARIO ATUAL: R$"+salarioAtual);
			System.out.println("COM O REAJUSTE DE 10% O SEU NOVO SÁLARIO É R$"+novoSalario);
		
		} if (codigo == 3){
			System.out.println("ANALISTA");
			reajuste = (salarioAtual*0.15);
			novoSalario = (salarioAtual + reajuste);
			
			System.out.println("SÁLARIO ATUAL: R$"+salarioAtual);
			System.out.println("COM O REAJUSTE DE 15% O SEU NOVO SÁLARIO É R$"+novoSalario);
		
		}

	}

}
