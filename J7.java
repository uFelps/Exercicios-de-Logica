package exerciciosLogica;

import java.util.Scanner;

/*J7-)  Desenvolvaum  programa  para  realizar  uma  pesquisa  de  saga  de  filmes.  
O  programa  dever� solicitar  a  op��o  de  melhor  saga  de  filme  para  o  usu�rio.  
As  sagas  concorrentes  s�o:  Matrix  e Senhor dos An�is. Ao final o programa dever� 
indicar qual foi � saga vencedora e o total de votos de  cada  saga.  Se  ocorrer  um  
empate,  o  mesmo  dever�  ser  indicado.  O  programa  dever�  realizar  a pesquisa 
enquanto houver a solicita��o de uma nova entrada de dados atrav�s da vari�vel RESP.   */

public class J7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int resp=1, voto, contMatrix=0, contSenhor=0;
		
		while(resp == 1) {
			System.out.println("\nPesquisa sobre a melhor saga. \nDigite 1 para MATRIX. \nDigite 2 para SENHOR DOS AN�IS.");
			voto = leia.nextInt();
			
			if(voto == 1) {
				contMatrix++;
			
			} else if(voto == 2) {
				contSenhor++;
			}
			
			System.out.println("\nDeseja continuar com a pesquisa? \nDigite 1 para SIM. \nDigite qualquer n�mero para N�O.");
			resp = leia.nextInt();
		}
		if(contMatrix > contSenhor) {
			System.out.println("\nA saga vencedora foi Matrix! \nVotos para Matrix: "+contMatrix + "\nVotos para Senhor dos An�is: "+contSenhor);
		
		} else if(contSenhor > contMatrix) {
			System.out.println("\nA saga vencedora foi Senhor dos An�is! \nVotos para Matrix: "+contMatrix + "\nVotos para Senhor dos An�is: "+contSenhor);
		
		} else if(contSenhor == contMatrix) {
			System.out.println("\nOcorreu um empate! \nVotos para Matrix: "+contMatrix + "\nVotos para Senhor dos An�is: "+contSenhor);
		}

	}

}
