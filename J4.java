package exerciciosLogica;

import java.util.Scanner;

/*J4-)  Desenvolva um programa para uma Universidade realizar uma pesquisa  
entre  os  alunos  que ingressam  nesta  Universidade.  Para  isso,  o  
programa  deverá  solicitar  o  sexo  do  entrevistado  e  o código do curso que deseja realizar.

Código              Curso
1                   Engenharia da Computação
2                   Administração
3                   Medicina
4                   Psicologia

O programa deverá realizar a pesquisa enquanto houver a solicitação de uma nova entrada de dados através da variável RESP. 
Ao final o programa deverá apresentar os seguintes resultados:
      -O total de homens que pretendem cursar Engenharia da Computação;
      -O total de mulheres que pretendem cursar Psicologia;
      -O percentual de pessoas que pretendem cursar Medicina;
      -O percentual de homens que pretendem cursar Administração;
      -O percentual de mulheres que pretendem cursar Medicina.      */

public class J4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int resp=1, sexoUsu, cod, contHom=0, contMul=0, contPessoas=0, contMascComputação=0, contMulPsicologia=0, contPessMedicina=0, contMasADM=0, contMulMedicina=0;
		double pPessMedicina, pHomADM, pMulMedicina;
		while(resp == 1) {
			contPessoas++;
			System.out.println("\nInforme o seu Sexo. \nDigite 1 para MASCULINO. \nDigite 2 para FEMININO");
			sexoUsu = leia.nextInt();
			System.out.println("\nInforme o código do curso que deseja: " 
			        +"\n1 - Engenharia da Computação"
					+ "\n2 - Administração"
					+ "\n3 - Medicina"
					+ "\n4 - Psicologia");
			cod = leia.nextInt();
			
			if(sexoUsu == 1) {//CONTAGEM HOMEM E MULHER
				contHom++;
			} else if(sexoUsu == 2) {
				contMul++;
			}

//-----------------------------------------------------------------------------------------------	
			if(cod == 1) {//Engenharia da Computação
				if(sexoUsu == 1) {//HOMEM
					contMascComputação++;
				}
			}
			else if(cod == 2) {//Administração
				if(sexoUsu == 1) {//HOMEM
					contMasADM++;				
				}
				
			}
			else if(cod == 3) {//Medicina
				contPessMedicina++;
				if(sexoUsu == 2) {//MULHER
					contMulMedicina++;
				}
			}
			else if(cod == 4) {//Psicologia
				if(sexoUsu == 2) {//MULHER
					contMulPsicologia++;
				}
			}
		    
			
			System.out.println("Deseja continuar com a pesquisa? \nDigite 1 para SIM. \nDigite qualquer número para não.");
			resp = leia.nextInt();
			
		}
		
		pPessMedicina = ((contPessMedicina*100)/contPessoas);
		pHomADM = ((contMasADM*100)/contHom);
		pMulMedicina = ((contMulMedicina*100)/contMul);
		
		System.out.println("\nO total de homens que pretendem cursar Engenharia da Computação: "+ contMascComputação);
		System.out.println("O total de mulheres que pretendem cursar Psicologia: "+ contMulPsicologia);
		System.out.println("O percentual de pessoas que pretendem cursar Medicina: " + pPessMedicina + "%");
		System.out.println("O percentual de homens que pretendem cursar Administração: " + pHomADM + "%");
		System.out.println("O percentual de mulheres que pretendem cursar Medicina: " + pMulMedicina + "%");
	}

}
