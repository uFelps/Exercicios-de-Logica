package exerciciosLogica;

import java.util.Scanner;

public class D9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int codigo;
		double salarioAtual, reajuste, novoSalario;
		
		System.out.println("DIGITE O C�DIGO DO SEU DEPARTAMENTO:");
		codigo = leia.nextInt();
		
		System.out.println("DIGITE O VALOR DO SEU S�LARIO:");
		salarioAtual = leia.nextDouble();
		
		if(codigo == 1){
			System.out.println("OPERADOR");
			reajuste = (salarioAtual*0.05);
			novoSalario = (salarioAtual + reajuste);
			
			System.out.println("S�LARIO ATUAL: R$"+salarioAtual);
			System.out.println("COM O REAJUSTE DE 5% O SEU NOVO S�LARIO � R$"+novoSalario);
		
		}if (codigo == 2){
			System.out.println("PROGRAMADOR");
			reajuste = (salarioAtual*0.10);
			novoSalario = (salarioAtual + reajuste);
			
			System.out.println("S�LARIO ATUAL: R$"+salarioAtual);
			System.out.println("COM O REAJUSTE DE 10% O SEU NOVO S�LARIO � R$"+novoSalario);
		
		} if (codigo == 3){
			System.out.println("ANALISTA");
			reajuste = (salarioAtual*0.15);
			novoSalario = (salarioAtual + reajuste);
			
			System.out.println("S�LARIO ATUAL: R$"+salarioAtual);
			System.out.println("COM O REAJUSTE DE 15% O SEU NOVO S�LARIO � R$"+novoSalario);
		
		}

	}

}
