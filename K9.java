package exerciciosLogica;

import java.util.Scanner;

/*K9-)  Desenvolva  um  programa  para  realizar  uma  pesquisa  de  mercado  
sobre  os  autom�veis importados:  FERRARI,  PORSH  e  MERCEDES.  O  programa  
dever�  receber  o  voto  de  cada entrevistado  e  ao  final  dever�  apresentar  
a  coloca��o,  o  total  de  votos  e  o  percentual  de  votos  de cada autom�vel. 
Os poss�veis empates tamb�m dever�o ser verificados. O programa dever� realizar a 
pesquisa at� que a entrada de dados seja finalizada atrav�s da vari�vel RESP.*/

public class K9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int resp=1, votoUsu, contFerrari=0, contPorsh=0, contMercedes=0, contPessoas=0;
		double pFerrari, pPorsh, pMercedes;
		
		System.out.println("PESQUISA DE CARROS!");
		
		do {
			contPessoas++;
			System.out.println("\n\nESCOLHA O CARRO EM QUE DESEJA VOTAR: \nDigite 1 para FERRARI. \nDigite 2 para PORSH. \nDigite 3 para MERCEDES. \nDigite 4 para ENCERRAR A PESQUISA.");
			votoUsu = leia.nextInt();
			
			
			switch(votoUsu) {//DIRECIONAMENTO DOS VOTOS
			case 1://FERRARI
				contFerrari++;
				break;
			case 2://PORSH
				contPorsh++;
				break;
			case 3://MERCEDES
				contMercedes++;
				break;
			case 4://SAIR
				resp = 4;
				contPessoas--;
				break;
			default:
				System.out.println("C�DIGO INV�LIDO!");
				contPessoas--;
			}
		}while(resp!=4);
		
		pFerrari = ((contFerrari*100)/contPessoas);//CALCULO DE PERCENTUAL
		pPorsh = ((contPorsh*100)/contPessoas);
		pMercedes = ((contMercedes*100)/contPessoas);
		
		
		//POSSIVEIS COLOCA��ES
		if((contFerrari > contPorsh)&&(contPorsh  > contMercedes)) {
			System.out.println("\n\nFIM DA PESQUISA: \n1� - FERRARI.   TOTAL DE VOTOS: "+contFerrari+"  PERCENTUAL: "+pFerrari+"%");
			System.out.println("2� - PORSH.   TOTAL DE VOTOS: "+contPorsh+"  PERCENTUAL: "+pPorsh+"%");
			System.out.println("3� - MERCEDES.   TOTAL DE VOTOS: "+contMercedes+"  PERCENTUAL: "+pMercedes+"%");
			
		
		} else if((contFerrari > contMercedes)&&(contMercedes > contPorsh)) {
			System.out.println("\n\nFIM DA PESQUISA: \n1� - FERRARI.   TOTAL DE VOTOS: "+contFerrari+"  PERCENTUAL: "+pFerrari+"%");
			System.out.println("2� - MERCEDES.   TOTAL DE VOTOS: "+contMercedes+"  PERCENTUAL: "+pMercedes+"%");
			System.out.println("3� - PORSH.   TOTAL DE VOTOS: "+contPorsh+"  PERCENTUAL: "+pPorsh+"%");
		
		}else if((contPorsh > contFerrari)&&(contFerrari > contMercedes)) {
			System.out.println("\n\nFIM DA PESQUISA: \n1� - PORSH.   TOTAL DE VOTOS: "+contPorsh+"  PERCENTUAL: "+pPorsh+"%");
			System.out.println("2� - FERRARI.   TOTAL DE VOTOS: "+contFerrari+"  PERCENTUAL: "+pFerrari+"%");
			System.out.println("3� - MERCEDES.   TOTAL DE VOTOS: "+contMercedes+"  PERCENTUAL: "+pMercedes+"%");
		
		}else if((contPorsh > contMercedes)&&(contMercedes > contFerrari)) {
			System.out.println("\n\nFIM DA PESQUISA: \n1� - PORSH.   TOTAL DE VOTOS: "+contPorsh+"  PERCENTUAL: "+pPorsh+"%");
			System.out.println("2� - MERCEDES.   TOTAL DE VOTOS: "+contMercedes+"  PERCENTUAL: "+pMercedes+"%");
			System.out.println("3� - FERRARI.   TOTAL DE VOTOS: "+contFerrari+"  PERCENTUAL: "+pFerrari+"%");
			
		} else if((contMercedes > contPorsh)&&(contPorsh >  contFerrari)) {
			System.out.println("\n\nFIM DA PESQUISA: \n1� - MERCEDES.   TOTAL DE VOTOS: "+contMercedes+"  PERCENTUAL: "+pMercedes+"%");
			System.out.println("2� - PORSH.   TOTAL DE VOTOS: "+contPorsh+"  PERCENTUAL: "+pPorsh+"%");
			System.out.println("3� - FERRARI.   TOTAL DE VOTOS: "+contFerrari+"  PERCENTUAL: "+pFerrari+"%");
			
		} else if((contMercedes > contFerrari)&&(contFerrari > contPorsh)) {
			System.out.println("\n\nFIM DA PESQUISA: \n1� - MERCEDES.   TOTAL DE VOTOS: "+contMercedes+"  PERCENTUAL: "+pMercedes+"%");
			System.out.println("2� - FERRARI.   TOTAL DE VOTOS: "+contFerrari+"  PERCENTUAL: "+pFerrari+"%");
			System.out.println("3� - PORSH.   TOTAL DE VOTOS: "+contPorsh+"  PERCENTUAL: "+pPorsh+"%");
		}
		
		//POSSIVEIS EMPATES---------------------------------------------------------------------------
		if((contFerrari == contPorsh)&&(contPorsh == contMercedes)){
			System.out.println("\n\nOCORREU UM EMPATE NO 1� LUGAR! \nFERRARI.   TOTAL DE VOTOS: "+contFerrari+"  PERCENTUAL: "+pFerrari+"%");
			System.out.println("PORSH.   TOTAL DE VOTOS: "+contPorsh+"  PERCENTUAL: "+pPorsh+"%");
			System.out.println("MERCEDES.   TOTAL DE VOTOS: "+contMercedes+"  PERCENTUAL: "+pMercedes+"%");
		
		} else if((contFerrari == contPorsh)&&(contPorsh > contMercedes)) {
			System.out.println("\n\nOCORREU UM EMPATE NO 1� LUGAR! \nFERRARI.   TOTAL DE VOTOS: "+contFerrari+"  PERCENTUAL: "+pFerrari+"%");
			System.out.println("PORSH.   TOTAL DE VOTOS: "+contPorsh+"  PERCENTUAL: "+pPorsh+"%");
			System.out.println("2� - MERCEDES.   TOTAL DE VOTOS: "+contMercedes+"  PERCENTUAL: "+pMercedes+"%");
		
		} else if((contFerrari == contMercedes)&&(contMercedes > contPorsh)) {
			System.out.println("\n\nOCORREU UM EMPATE NO 1� LUGAR! \nFERRARI.   TOTAL DE VOTOS: "+contFerrari+"  PERCENTUAL: "+pFerrari+"%");
			System.out.println("MERCEDES.   TOTAL DE VOTOS: "+contMercedes+"  PERCENTUAL: "+pMercedes+"%");
			System.out.println("2� - PORSH.   TOTAL DE VOTOS: "+contPorsh+"  PERCENTUAL: "+pPorsh+"%");
		
		} else if((contMercedes == contPorsh )&&(contPorsh > contFerrari)) {
			System.out.println("\n\nOCORREU UM EMPATE NO 1� LUGAR! \nMERCEDES.   TOTAL DE VOTOS: "+contMercedes+"  PERCENTUAL: "+pMercedes+"%");
			System.out.println("PORSH.   TOTAL DE VOTOS: "+contPorsh+"  PERCENTUAL: "+pPorsh+"%");
			System.out.println("2� - FERRARI.   TOTAL DE VOTOS: "+contFerrari+"  PERCENTUAL: "+pFerrari+"%");
		
		} else if((contMercedes > contPorsh)&&(contPorsh == contFerrari)) {
			System.out.println("\n\n1� - MERCEDES.   TOTAL DE VOTOS: "+contMercedes+"  PERCENTUAL: "+pMercedes+"%");
			System.out.println("\nOCORREU UM EMPATE NO 2� LUGAR! \nPORSH.   TOTAL DE VOTOS: "+contPorsh+"  PERCENTUAL: "+pPorsh+"%");
			System.out.println("FERRARI.   TOTAL DE VOTOS: "+contFerrari+"  PERCENTUAL: "+pFerrari+"%");
		
		} else if((contPorsh > contMercedes)&&(contMercedes == contFerrari)) {
			System.out.println("\n\n1� - PORSH.   TOTAL DE VOTOS: "+contPorsh+"  PERCENTUAL: "+pPorsh+"%");
			System.out.println("\nOCORREU UM EMPATE NO 2� LUGAR! \nMERCEDES.   TOTAL DE VOTOS: "+contMercedes+"  PERCENTUAL: "+pMercedes+"%");
			System.out.println("FERRARI.   TOTAL DE VOTOS: "+contFerrari+"  PERCENTUAL: "+pFerrari+"%");
		
		} else if((contFerrari > contMercedes)&&(contMercedes == contPorsh)) {
			System.out.println("\n\n1� - FERRARI.   TOTAL DE VOTOS: "+contFerrari+"  PERCENTUAL: "+pFerrari+"%");
			System.out.println("\nOCORREU UM EMPATE NO 2� LUGAR! \nMERCEDES.   TOTAL DE VOTOS: "+contMercedes+"  PERCENTUAL: "+pMercedes+"%");
			System.out.println("PORSH.   TOTAL DE VOTOS: "+contPorsh+"  PERCENTUAL: "+pPorsh+"%");
		}

	}

}
