package exerciciosLogica;

import java.util.Scanner;

public class F6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int codigo;
		double salarioAtual, reajuste, novoSalario;
		
		System.out.println("Digite o c�digo do seu departamento:");
		codigo = leia.nextInt();
		
		System.out.println("Digite o seu sal�rio atual:");
		salarioAtual = leia.nextDouble();
		
		if (codigo == 1){ //OPERADOR - 5%
			reajuste = (salarioAtual*0.05);
			novoSalario = (salarioAtual + reajuste);
			
			System.out.println("\nFun��o: OPERADOR");
			System.out.println("Sal�rio antigo: R$"+salarioAtual);
			System.out.println("Valor do reajuste de 5%: R$"+reajuste);
			System.out.println("Novo Sal�rio: R$"+novoSalario);
		
		} else if (codigo == 2){ //PROGRAMADOR - 10%
			reajuste = (salarioAtual*0.10);
			novoSalario = (salarioAtual+reajuste);
			
			System.out.println("\nFun��o: PROGRAMADOR");
			System.out.println("Sal�rio antigo: R$"+salarioAtual);
			System.out.println("Valor do reajuste de 10%: R$"+reajuste);
			System.out.println("Novo Sal�rio: R$"+novoSalario);
		
		} else if (codigo == 3){ //ANALISTA - 15%
			reajuste = (salarioAtual*0.15);
			novoSalario = (salarioAtual+reajuste);
			
			System.out.println("\nFun��o: ANALISTA");
			System.out.println("Sal�rio antigo: R$"+salarioAtual);
			System.out.println("Valor do reajuste de 15%: R$"+reajuste);
			System.out.println("Novo Sal�rio: R$"+novoSalario);
		
		} else if (codigo == 4){ //GERENTE - 25%
			reajuste = (salarioAtual*0.25);
			novoSalario = (salarioAtual + reajuste);
			
			System.out.println("\nFun��o: GERENTE");
			System.out.println("Sal�rio antigo: R$"+salarioAtual);
			System.out.println("Valor do reajuste de 25%: R$"+reajuste);
			System.out.println("Novo Sal�rio: R$"+novoSalario);
		
		} else{
			System.out.println("\nC�DIGO DE DEPARTAMENTO INV�LIDO");
		}
		

	}

}
