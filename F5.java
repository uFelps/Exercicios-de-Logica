package exerciciosLogica;

import java.util.Scanner;

public class F5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int codigo;
		double salarioAtual, reajuste, novoSalario;
		
		
		System.out.println("DIGITE O C�DIGO DO SEU DEPARTAMENTO:");
		codigo = leia.nextInt();
		
		System.out.println("DIGITE O SEU S�LARIO ATUAL:");
		salarioAtual = leia.nextDouble();
		
		if (codigo ==1){
		    reajuste = ((salarioAtual/100)*5);
		    novoSalario = (salarioAtual+reajuste);
		    
		    System.out.println("Sal�rio Antigo: R$"+salarioAtual);
		    System.out.println("Reajuste de 5%: R$"+reajuste);
		    System.out.println("Novo Sal�rio: R$"+novoSalario);
		
		} else if (codigo == 2){
			reajuste = ((salarioAtual/100)*10);
			novoSalario = (salarioAtual+reajuste);
			
			System.out.println("Sal�rio Antigo: R$"+salarioAtual);
		    System.out.println("Reajuste de 10%: R$"+reajuste);
		    System.out.println("Novo Sal�rio: R$"+novoSalario);
		
		} else if (codigo ==3){
			reajuste = ((salarioAtual/100)*15);
			novoSalario = (salarioAtual+reajuste);
			
			System.out.println("Sal�rio Antigo: R$"+salarioAtual);
		    System.out.println("Reajuste de 15%: R$"+reajuste);
		    System.out.println("Novo Sal�rio: R$"+novoSalario);
		
		} else if (codigo == 4){
			reajuste = ((salarioAtual/100)*5);
			novoSalario = (salarioAtual+reajuste);
			
			System.out.println("Sal�rio Antigo: R$"+salarioAtual);
		    System.out.println("Reajuste de 20%: R$"+reajuste);
		    System.out.println("Novo Sal�rio: R$"+novoSalario);
		
		} else if (codigo == 5){
			reajuste = ((salarioAtual/100)*25);
			novoSalario = (salarioAtual+reajuste);
			
			System.out.println("Sal�rio Antigo: R$"+salarioAtual);
		    System.out.println("Reajuste de 25%: R$"+reajuste);
		    System.out.println("Novo Sal�rio: R$"+novoSalario);
		
		} else if (codigo == 6){
			reajuste = ((salarioAtual/100)*30);
			novoSalario = (salarioAtual+reajuste);
			
			System.out.println("Sal�rio Antigo: R$"+salarioAtual);
		    System.out.println("Reajuste de 30%: R$"+reajuste);
		    System.out.println("Novo Sal�rio: R$"+novoSalario);
		
		} else {
			System.out.println("C�DIGO DE DEPARTAMENTO INV�LIDO");
		}
		 
		

	}

}
