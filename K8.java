package exerciciosLogica;

import java.util.Scanner;

/*K8-)  Desenvolva  um  programa  para  realizar  uma  pesquisa  de  cursos  universit�rios  
para  uma Universidade. Os cursos que estar�o na pesquisa s�o: Medicina, Psicologia e 
Engenharia El�trica. O programa  dever�  receber  o  voto  de  cada  entrevistado  e  
ao  final  dever�  apresentar  a  coloca��o,  o total  de  votos  e  o  percentual  de  
votos  de  cada  curso.  Os  poss�veis  empates  tamb�m  dever�o  ser verificados. 
O programa dever� realizar a pesquisa at� que a entrada de dados seja finalizada atrav�s da vari�vel RESP.*/

public class K8 {

	public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			int resp=1, votoUsu, contMedicina=0, contPsicologia=0, contEng=0, contPessoas=0;
			double pMedicina, pPsicologia, pEng;
			
			System.out.println("PESQUISA DE CURSO UNIVERSIT�RIOS!");
			
			do {
				contPessoas++;
				System.out.println("\n\nESCOLHA O CURSO EM QUE DESEJA VOTAR: \nDigite 1 para MEDICINA. \nDigite 2 para PSICOLOGIA. \nDigite 3 para ENGENHARIA EL�TRICA. \nDigite 4 para ENCERRAR A PESQUISA.");
				votoUsu = leia.nextInt();
				
				
				switch(votoUsu) {//DIRECIONAMENTO DOS VOTOS
				case 1://MEDICINA
					contMedicina++;
					break;
				case 2://PSICOLOGIA
					contPsicologia++;
					break;
				case 3://ENGENHARIA EL�TRICA
					contEng++;
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
			
			pMedicina = ((contMedicina*100)/contPessoas);//CALCULO DE PERCENTUAL
			pPsicologia = ((contPsicologia*100)/contPessoas);
			pEng = ((contEng*100)/contPessoas);
			
			
			//POSSIVEIS COLOCA��ES
			if((contMedicina > contPsicologia)&&(contPsicologia  > contEng)) {
				System.out.println("\n\nFIM DA PESQUISA: \n1� - MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				System.out.println("2� - PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
				System.out.println("3� - ENGENHARIA EL�TRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				
			
			} else if((contMedicina > contEng)&&(contEng > contPsicologia)) {
				System.out.println("\n\nFIM DA PESQUISA: \n1� - MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				System.out.println("2� - ENGENHARIA EL�TRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				System.out.println("3� - PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
			
			}else if((contPsicologia > contMedicina)&&(contMedicina > contEng)) {
				System.out.println("\n\nFIM DA PESQUISA: \n1� - PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
				System.out.println("2� - MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				System.out.println("3� - ENGENHARIA EL�TRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
			
			}else if((contPsicologia > contEng)&&(contEng > contMedicina)) {
				System.out.println("\n\nFIM DA PESQUISA: \n1� - PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
				System.out.println("2� - ENGENHARIA EL�TRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				System.out.println("3� - MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				
			} else if((contEng > contPsicologia)&&(contPsicologia >  contMedicina)) {
				System.out.println("\n\nFIM DA PESQUISA: \n1� - ENGENHARIA EL�TRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				System.out.println("2� - PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
				System.out.println("3� - MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				
			} else if((contEng > contMedicina)&&(contMedicina > contPsicologia)) {
				System.out.println("\n\nFIM DA PESQUISA: \n1� - ENGENHARIA EL�TRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				System.out.println("2� - MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				System.out.println("3� - PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
			}
			
			//POSSIVEIS EMPATES---------------------------------------------------------------------------
			if((contMedicina == contPsicologia)&&(contPsicologia == contEng)){
				System.out.println("\n\nOCORREU UM EMPATE NO 1� LUGAR! \nMEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				System.out.println("PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
				System.out.println("ENGENHARIA EL�TRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
			
			} else if((contMedicina == contPsicologia)&&(contPsicologia > contEng)) {
				System.out.println("\n\nOCORREU UM EMPATE NO 1� LUGAR! \nMEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				System.out.println("PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
				System.out.println("2� - ENGENHARIA EL�TRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
			
			} else if((contMedicina == contEng)&&(contEng > contPsicologia)) {
				System.out.println("\n\nOCORREU UM EMPATE NO 1� LUGAR! \nMEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				System.out.println("ENGENHARIA EL�TRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				System.out.println("2� - PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
			
			} else if((contEng == contPsicologia )&&(contPsicologia > contMedicina)) {
				System.out.println("\n\nOCORREU UM EMPATE NO 1� LUGAR! \nENGENHARIA EL�TRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				System.out.println("PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
				System.out.println("2� - MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
			
			} else if((contEng > contPsicologia)&&(contPsicologia == contMedicina)) {
				System.out.println("\n\n1� - ENGENHARIA EL�TRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				System.out.println("\nOCORREU UM EMPATE NO 2� LUGAR! \nPSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
				System.out.println("MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
			
			} else if((contPsicologia > contEng)&&(contEng == contMedicina)) {
				System.out.println("\n\n1� - PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
				System.out.println("\nOCORREU UM EMPATE NO 2� LUGAR! \nENGENHARIA EL�TRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				System.out.println("MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
			
			} else if((contMedicina > contEng)&&(contEng == contPsicologia)) {
				System.out.println("\n\n1� - MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				System.out.println("\nOCORREU UM EMPATE NO 2� LUGAR! \nENGENHARIA EL�TRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				System.out.println("PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
			}
			

	}

}
