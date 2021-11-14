package exerciciosLogica;

import java.util.Scanner;

/*K8-)  Desenvolva  um  programa  para  realizar  uma  pesquisa  de  cursos  universitários  
para  uma Universidade. Os cursos que estarão na pesquisa são: Medicina, Psicologia e 
Engenharia Elétrica. O programa  deverá  receber  o  voto  de  cada  entrevistado  e  
ao  final  deverá  apresentar  a  colocação,  o total  de  votos  e  o  percentual  de  
votos  de  cada  curso.  Os  possíveis  empates  também  deverão  ser verificados. 
O programa deverá realizar a pesquisa até que a entrada de dados seja finalizada através da variável RESP.*/

public class K8 {

	public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			int resp=1, votoUsu, contMedicina=0, contPsicologia=0, contEng=0, contPessoas=0;
			double pMedicina, pPsicologia, pEng;
			
			System.out.println("PESQUISA DE CURSO UNIVERSITÁRIOS!");
			
			do {
				contPessoas++;
				System.out.println("\n\nESCOLHA O CURSO EM QUE DESEJA VOTAR: \nDigite 1 para MEDICINA. \nDigite 2 para PSICOLOGIA. \nDigite 3 para ENGENHARIA ELÉTRICA. \nDigite 4 para ENCERRAR A PESQUISA.");
				votoUsu = leia.nextInt();
				
				
				switch(votoUsu) {//DIRECIONAMENTO DOS VOTOS
				case 1://MEDICINA
					contMedicina++;
					break;
				case 2://PSICOLOGIA
					contPsicologia++;
					break;
				case 3://ENGENHARIA ELÉTRICA
					contEng++;
					break;
				case 4://SAIR
					resp = 4;
					contPessoas--;
					break;
				default:
					System.out.println("CÓDIGO INVÁLIDO!");
					contPessoas--;
				}
			}while(resp!=4);
			
			pMedicina = ((contMedicina*100)/contPessoas);//CALCULO DE PERCENTUAL
			pPsicologia = ((contPsicologia*100)/contPessoas);
			pEng = ((contEng*100)/contPessoas);
			
			
			//POSSIVEIS COLOCAÇÕES
			if((contMedicina > contPsicologia)&&(contPsicologia  > contEng)) {
				System.out.println("\n\nFIM DA PESQUISA: \n1º - MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				System.out.println("2º - PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
				System.out.println("3º - ENGENHARIA ELÉTRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				
			
			} else if((contMedicina > contEng)&&(contEng > contPsicologia)) {
				System.out.println("\n\nFIM DA PESQUISA: \n1º - MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				System.out.println("2º - ENGENHARIA ELÉTRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				System.out.println("3º - PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
			
			}else if((contPsicologia > contMedicina)&&(contMedicina > contEng)) {
				System.out.println("\n\nFIM DA PESQUISA: \n1º - PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
				System.out.println("2º - MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				System.out.println("3º - ENGENHARIA ELÉTRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
			
			}else if((contPsicologia > contEng)&&(contEng > contMedicina)) {
				System.out.println("\n\nFIM DA PESQUISA: \n1º - PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
				System.out.println("2º - ENGENHARIA ELÉTRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				System.out.println("3º - MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				
			} else if((contEng > contPsicologia)&&(contPsicologia >  contMedicina)) {
				System.out.println("\n\nFIM DA PESQUISA: \n1º - ENGENHARIA ELÉTRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				System.out.println("2º - PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
				System.out.println("3º - MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				
			} else if((contEng > contMedicina)&&(contMedicina > contPsicologia)) {
				System.out.println("\n\nFIM DA PESQUISA: \n1º - ENGENHARIA ELÉTRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				System.out.println("2º - MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				System.out.println("3º - PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
			}
			
			//POSSIVEIS EMPATES---------------------------------------------------------------------------
			if((contMedicina == contPsicologia)&&(contPsicologia == contEng)){
				System.out.println("\n\nOCORREU UM EMPATE NO 1º LUGAR! \nMEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				System.out.println("PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
				System.out.println("ENGENHARIA ELÉTRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
			
			} else if((contMedicina == contPsicologia)&&(contPsicologia > contEng)) {
				System.out.println("\n\nOCORREU UM EMPATE NO 1º LUGAR! \nMEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				System.out.println("PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
				System.out.println("2º - ENGENHARIA ELÉTRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
			
			} else if((contMedicina == contEng)&&(contEng > contPsicologia)) {
				System.out.println("\n\nOCORREU UM EMPATE NO 1º LUGAR! \nMEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				System.out.println("ENGENHARIA ELÉTRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				System.out.println("2º - PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
			
			} else if((contEng == contPsicologia )&&(contPsicologia > contMedicina)) {
				System.out.println("\n\nOCORREU UM EMPATE NO 1º LUGAR! \nENGENHARIA ELÉTRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				System.out.println("PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
				System.out.println("2º - MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
			
			} else if((contEng > contPsicologia)&&(contPsicologia == contMedicina)) {
				System.out.println("\n\n1º - ENGENHARIA ELÉTRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				System.out.println("\nOCORREU UM EMPATE NO 2º LUGAR! \nPSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
				System.out.println("MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
			
			} else if((contPsicologia > contEng)&&(contEng == contMedicina)) {
				System.out.println("\n\n1º - PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
				System.out.println("\nOCORREU UM EMPATE NO 2º LUGAR! \nENGENHARIA ELÉTRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				System.out.println("MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
			
			} else if((contMedicina > contEng)&&(contEng == contPsicologia)) {
				System.out.println("\n\n1º - MEDICINA.   TOTAL DE VOTOS: "+contMedicina+"  PERCENTUAL: "+pMedicina+"%");
				System.out.println("\nOCORREU UM EMPATE NO 2º LUGAR! \nENGENHARIA ELÉTRICA.   TOTAL DE VOTOS: "+contEng+"  PERCENTUAL: "+pEng+"%");
				System.out.println("PSICOLOGIA.   TOTAL DE VOTOS: "+contPsicologia+"  PERCENTUAL: "+pPsicologia+"%");
			}
			

	}

}
