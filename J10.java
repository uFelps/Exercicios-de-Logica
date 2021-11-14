package exerciciosLogica;

import java.util.Scanner;

/*J10-)  Desenvolva  um  programa  para  realizar  uma  pesquisa  de  mercado  
sobre  os  autom�veis: CORSA, PALIO e GOL. O programa dever� receber o voto de 
cada entrevistado e ao final dever� apresentar  a  coloca��o,  o  total  de  
votos  e  o  percentual  de  votos  de  cada  autom�vel.  Os  poss�veis empates 
tamb�m dever�o ser verificados. O programa dever� realizar a pesquisa enquanto 
houver a solicita��o de uma nova entrada de dados atrav�s da vari�vel RESP.*/

public class J10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int resp=1, voto, contPessoas=0, contCorsa=0, contPalio=0, contGol=0;
		double pCorsa, pPalio, pGol;
		while(resp == 1) {//INICIO DO LA�O
			contPessoas++;
			System.out.println("\nInforme o carro em que deseja votar: \n1- Corsa \n2-Palio \n3-Gol ");
			voto = leia.nextInt();
			
			switch (voto) {//SWITCH PARA DIRECIONAR O VOTO
			case 1:
				contCorsa++;
			break;
			
			case 2:
				contPalio++;
			break;
			
			case 3:
				contGol++;
			break;
			}
			System.out.println("\nDeseja continuar com a pesquisa? \nDigite 1 para SIM. \nDigite qualquer n�mero para n�o.");
			resp = leia.nextInt();	
		}//FIM DO LA�O
		
		pCorsa = ((contCorsa*100)/contPessoas); //CALCULO DE PERCENTUAL
		pPalio = ((contPalio*100)/contPessoas);
        pGol = ((contGol*100)/contPessoas);
        
        
        if((contCorsa > contPalio)&&(contPalio > contGol)) { //VERIFICAR AS COLOCA��ES
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1� Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        	System.out.println("2� Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        	System.out.println("3� Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        }
        else if((contCorsa > contGol)&&(contGol > contPalio)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1� Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        	System.out.println("2� Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        	System.out.println("3� Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        }
        else if((contPalio > contCorsa)&&(contCorsa > contGol)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1� Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        	System.out.println("2� Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        	System.out.println("3� Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        }
        else if((contPalio > contGol)&&(contGol > contCorsa)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1� Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        	System.out.println("2� Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        	System.out.println("3� Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        }
        else if((contGol > contPalio)&&(contPalio > contCorsa)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1� Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        	System.out.println("2� Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        	System.out.println("3� Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        }
        else if((contGol > contCorsa)&&(contCorsa > contPalio)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1� Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        	System.out.println("2� Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        	System.out.println("3� Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        }
        
      //POSSIBILIDADES DE EMPATES------------------------------------------------------------------------------------------------------
        else if((contCorsa == contPalio)&&(contPalio == contGol)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("HOUVE UM EMPATE NO 1� LUGAR. \nCorsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        	System.out.println("Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        	System.out.println("Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        }
        else if((contCorsa > contPalio)&&(contPalio == contGol)){
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1� Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        	System.out.println("HOUVE UM EMPATE NO 2� LUGAR. \nPalio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        	System.out.println("Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        }
        else if((contPalio > contCorsa)&&(contCorsa == contGol)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1� Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        	System.out.println("HOUVE UM EMPATE NO 2� LUGAR. \nCorsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        	System.out.println("Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        }
        else if((contGol > contPalio)&&(contPalio == contCorsa)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("1� Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        	System.out.println("HOUVE UM EMPATE NO 2� LUGAR. \nPalio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        	System.out.println("Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        }
        else if((contCorsa < contPalio)&&(contPalio == contGol)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("HOUVE UM EMPATE NO 1� LUGAR. \nGol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        	System.out.println("Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        	System.out.println("2� Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        }
        else if((contPalio < contCorsa)&&(contCorsa == contGol)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("HOUVE UM EMPATE NO 1� LUGAR. \nCorsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        	System.out.println("Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        	System.out.println("2� Palio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        }
        else if((contGol < contPalio)&&(contPalio == contCorsa)) {
        	System.out.println("\nRESULTADO DA PESQUISA:");
        	System.out.println("HOUVE UM EMPATE NO 1� LUGAR. \nPalio.  Votos: "+contPalio + ".  Percentual: "+pPalio+"%");
        	System.out.println("Corsa.  Votos: "+contCorsa + ".  Percentual: "+pCorsa+"%");
        	System.out.println("2� Gol.  Votos: "+contGol + ".  Percentual: "+pGol+"%");
        }
	}
}