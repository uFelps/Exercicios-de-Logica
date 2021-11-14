package exerciciosLogica;

import java.util.Scanner;

public class I8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int qtdPart, codigo;
		double salarioAtual, reajuste, novoSalario;
		
		System.out.println("Digite o número de participantes:");
		qtdPart = leia.nextInt();
		
		for(int vc=1; vc<=qtdPart; vc++){
		System.out.println("\nREAJUSTE SÁLARIAL.\nDigite o código do seu departamento:");
		codigo = leia.nextInt();
		System.out.println("Digite o seu salário atual:");
		salarioAtual = leia.nextDouble();
		
		if(codigo == 1){ //5%
			reajuste = (salarioAtual * 0.05);
			novoSalario = (salarioAtual + reajuste);
			
			System.out.println("Salário Antigo: R$"+salarioAtual + "\nReajuste de 5%: R$"+reajuste + " \nNovo salário: R$"+novoSalario);
			
		} else if(codigo == 2){//15%
			reajuste = (salarioAtual * 0.15);
			novoSalario = (salarioAtual + reajuste);
			
			System.out.println("Salário Antigo: R$"+salarioAtual + "\nReajuste de 15%: R$"+reajuste + " \nNovo salário: R$"+novoSalario);
		
		} else if(codigo == 3){//25%
			reajuste = (salarioAtual * 0.25);
			novoSalario = (salarioAtual + reajuste);
			
			System.out.println("Salário Antigo: R$"+salarioAtual + "\nReajuste de 25%: R$"+reajuste + " \nNovo salário: R$"+novoSalario);
		
		} else if(codigo == 4){//30%
			reajuste = (salarioAtual * 0.30);
			novoSalario = (salarioAtual + reajuste);
			
			System.out.println("Salário Antigo: R$"+salarioAtual + "\nReajuste de 30%: R$"+reajuste + "\nNovo salário: R$"+novoSalario);
		
		} else{
			System.out.println("Código de departamento inválido!");
		}
		}

	}

}
