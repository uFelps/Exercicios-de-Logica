package exerciciosLogica;

import java.util.Scanner;

public class F6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int codigo;
		double salarioAtual, reajuste, novoSalario;
		
		System.out.println("Digite o código do seu departamento:");
		codigo = leia.nextInt();
		
		System.out.println("Digite o seu salário atual:");
		salarioAtual = leia.nextDouble();
		
		if (codigo == 1){ //OPERADOR - 5%
			reajuste = (salarioAtual*0.05);
			novoSalario = (salarioAtual + reajuste);
			
			System.out.println("\nFunção: OPERADOR");
			System.out.println("Salário antigo: R$"+salarioAtual);
			System.out.println("Valor do reajuste de 5%: R$"+reajuste);
			System.out.println("Novo Salário: R$"+novoSalario);
		
		} else if (codigo == 2){ //PROGRAMADOR - 10%
			reajuste = (salarioAtual*0.10);
			novoSalario = (salarioAtual+reajuste);
			
			System.out.println("\nFunção: PROGRAMADOR");
			System.out.println("Salário antigo: R$"+salarioAtual);
			System.out.println("Valor do reajuste de 10%: R$"+reajuste);
			System.out.println("Novo Salário: R$"+novoSalario);
		
		} else if (codigo == 3){ //ANALISTA - 15%
			reajuste = (salarioAtual*0.15);
			novoSalario = (salarioAtual+reajuste);
			
			System.out.println("\nFunção: ANALISTA");
			System.out.println("Salário antigo: R$"+salarioAtual);
			System.out.println("Valor do reajuste de 15%: R$"+reajuste);
			System.out.println("Novo Salário: R$"+novoSalario);
		
		} else if (codigo == 4){ //GERENTE - 25%
			reajuste = (salarioAtual*0.25);
			novoSalario = (salarioAtual + reajuste);
			
			System.out.println("\nFunção: GERENTE");
			System.out.println("Salário antigo: R$"+salarioAtual);
			System.out.println("Valor do reajuste de 25%: R$"+reajuste);
			System.out.println("Novo Salário: R$"+novoSalario);
		
		} else{
			System.out.println("\nCÓDIGO DE DEPARTAMENTO INVÁLIDO");
		}
		

	}

}
