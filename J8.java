package exerciciosLogica;

import java.util.Scanner;

/*J8-) Desenvolva um programa para  realizar uma  eleição entre  dois candidatos  
ao cargo de  gerente de uma empresa. O programa deverá apresentar o nome dos 
candidatos (Fujiro NaKombi e Takaro Né)  para  a  escolha  dos  eleitores.  
Ao  final  o  programa  deverá  indicar  qual  será  o  novo  gerente  da empresa,  
o  total  de  votose  o  percentual  de  votos  de  cada  candidato.  Se  ocorrer  um  
empate,  o mesmo  deverá  ser  indicado  e  o  programa  deverá  solicitar  um  voto  
de  desempate.  O  programa deverá realizar a  pesquisa enquanto houver a solicitação 
de  uma nova entrada  de  dados  através da variável RESP. */

public class J8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int resp=1, voto, contPessoas=0, contFujiro=0, contTakaro=0;
		double pFujiro, pTakaro;
		
		while(resp == 1){
			contPessoas++;
			System.out.println("\nELEIÇÕES. Escolha o novo Gerente: \nDigite 1 para Fujiro NaKombi. \nDigite 2 para Takaro Né.");
			voto = leia.nextInt();
			
			if(voto == 1) {//Fujiro NaKombi
				contFujiro++;
			
			} else if(voto == 2) {//Takaro Né
				contTakaro++;
			}
			
			System.out.println("Deseja continuar com a pesquisa? \nDigite 1 para SIM. \nDigite qualquer número para NÃO");
			resp = leia.nextInt();
		}
		
		pFujiro = ((contFujiro*100)/contPessoas);
		pTakaro = ((contTakaro*100)/contPessoas);
		
		if(contFujiro > contTakaro) {
			System.out.println("\nO novo gerente é o Fujiro NaKombi!" + 
		"\nVotos para Fujiro NaKombi: "+contFujiro + " Votos.   Percentual: "+pFujiro + "%"+
		"\nVotos para Takaro Né: "+contTakaro + " Votos.   Percentual: "+pTakaro + "%");
		}
		else if(contTakaro > contFujiro) {
			System.out.println("\nO novo gerente é o Takaro Né!" + 
					"\nVotos para Fujiro NaKombi: "+contFujiro + " Votos.   Percentual: "+pFujiro + "%"+
					"\nVotos para Takaro Né: "+contTakaro + " Votos.   Percentual: "+pTakaro + "%");
		}
		
		else if(contTakaro == contFujiro) {//EMPATE----------------------------------------
			System.out.println("\nOcorreu um Empate!");
			int votoDesempate;
			contPessoas++;
			System.out.println("Voto de desempate! \nDigite 1 para Fujiro NaKombi. \nDigite 2 para Takaro Né.");
			votoDesempate = leia.nextInt();
			
			if(votoDesempate == 1) {//Fujiro NaKombi
				contFujiro++;
				pFujiro = ((contFujiro*100)/contPessoas);
				pTakaro = ((contTakaro*100)/contPessoas);
				System.out.println("\nO novo gerente é o Fujiro NaKombi!" + 
						"\nVotos para Fujiro NaKombi: "+contFujiro + " Votos.   Percentual: "+pFujiro + "%"+
						"\nVotos para Takaro Né: "+contTakaro + " Votos.   Percentual: "+pTakaro + "%");		
			}
			else if(votoDesempate == 2){//Takaro Né
				contTakaro++;
				pTakaro = ((contTakaro*100)/contPessoas);
				pFujiro = ((contFujiro*100)/contPessoas);
				System.out.println("\nO novo gerente é o Takaro Né!" + 
						"\nVotos para Fujiro NaKombi: "+contFujiro + " Votos.   Percentual: "+pFujiro + "%"+
						"\nVotos para Takaro Né: "+contTakaro + " Votos.   Percentual: "+pTakaro + "%");
			}
			
			
		}

	}

}
