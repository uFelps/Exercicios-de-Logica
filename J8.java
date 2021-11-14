package exerciciosLogica;

import java.util.Scanner;

/*J8-) Desenvolva um programa para  realizar uma  elei��o entre  dois candidatos  
ao cargo de  gerente de uma empresa. O programa dever� apresentar o nome dos 
candidatos (Fujiro NaKombi e Takaro N�)  para  a  escolha  dos  eleitores.  
Ao  final  o  programa  dever�  indicar  qual  ser�  o  novo  gerente  da empresa,  
o  total  de  votose  o  percentual  de  votos  de  cada  candidato.  Se  ocorrer  um  
empate,  o mesmo  dever�  ser  indicado  e  o  programa  dever�  solicitar  um  voto  
de  desempate.  O  programa dever� realizar a  pesquisa enquanto houver a solicita��o 
de  uma nova entrada  de  dados  atrav�s da vari�vel RESP. */

public class J8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int resp=1, voto, contPessoas=0, contFujiro=0, contTakaro=0;
		double pFujiro, pTakaro;
		
		while(resp == 1){
			contPessoas++;
			System.out.println("\nELEI��ES. Escolha o novo Gerente: \nDigite 1 para Fujiro NaKombi. \nDigite 2 para Takaro N�.");
			voto = leia.nextInt();
			
			if(voto == 1) {//Fujiro NaKombi
				contFujiro++;
			
			} else if(voto == 2) {//Takaro N�
				contTakaro++;
			}
			
			System.out.println("Deseja continuar com a pesquisa? \nDigite 1 para SIM. \nDigite qualquer n�mero para N�O");
			resp = leia.nextInt();
		}
		
		pFujiro = ((contFujiro*100)/contPessoas);
		pTakaro = ((contTakaro*100)/contPessoas);
		
		if(contFujiro > contTakaro) {
			System.out.println("\nO novo gerente � o Fujiro NaKombi!" + 
		"\nVotos para Fujiro NaKombi: "+contFujiro + " Votos.   Percentual: "+pFujiro + "%"+
		"\nVotos para Takaro N�: "+contTakaro + " Votos.   Percentual: "+pTakaro + "%");
		}
		else if(contTakaro > contFujiro) {
			System.out.println("\nO novo gerente � o Takaro N�!" + 
					"\nVotos para Fujiro NaKombi: "+contFujiro + " Votos.   Percentual: "+pFujiro + "%"+
					"\nVotos para Takaro N�: "+contTakaro + " Votos.   Percentual: "+pTakaro + "%");
		}
		
		else if(contTakaro == contFujiro) {//EMPATE----------------------------------------
			System.out.println("\nOcorreu um Empate!");
			int votoDesempate;
			contPessoas++;
			System.out.println("Voto de desempate! \nDigite 1 para Fujiro NaKombi. \nDigite 2 para Takaro N�.");
			votoDesempate = leia.nextInt();
			
			if(votoDesempate == 1) {//Fujiro NaKombi
				contFujiro++;
				pFujiro = ((contFujiro*100)/contPessoas);
				pTakaro = ((contTakaro*100)/contPessoas);
				System.out.println("\nO novo gerente � o Fujiro NaKombi!" + 
						"\nVotos para Fujiro NaKombi: "+contFujiro + " Votos.   Percentual: "+pFujiro + "%"+
						"\nVotos para Takaro N�: "+contTakaro + " Votos.   Percentual: "+pTakaro + "%");		
			}
			else if(votoDesempate == 2){//Takaro N�
				contTakaro++;
				pTakaro = ((contTakaro*100)/contPessoas);
				pFujiro = ((contFujiro*100)/contPessoas);
				System.out.println("\nO novo gerente � o Takaro N�!" + 
						"\nVotos para Fujiro NaKombi: "+contFujiro + " Votos.   Percentual: "+pFujiro + "%"+
						"\nVotos para Takaro N�: "+contTakaro + " Votos.   Percentual: "+pTakaro + "%");
			}
			
			
		}

	}

}
