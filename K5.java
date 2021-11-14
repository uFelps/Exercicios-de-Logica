package exerciciosLogica;

import java.util.Scanner;

/*K5-) Desenvolva umprograma para realizar um censo na cidade de São Paulo. 
O programa deverá solicitar a leitura da idade, da região em que reside 
(Centro, Leste, Norte, Oeste ou Sul) e o sexo das pessoas. O programa deverá 
realizar a pesquisa até que a entrada de dados seja finalizada através da variável 
RESP. Ao final o programa deverá apresentar os seguintes resultados:
     -O total de homens que residem nas Zonas Leste e Central;
     -O percentual de mulheres que residem nas Zonas Oeste, Norte e Sul;
     -O  total  de  homens  menores  de idade  (menores  de  18)  que  residem  na  Zona  Norte  da cidade; 
     -O percentual de mulheres maiores de idade (maiores de 18) que residem na Zona Oeste da cidade;
     -O percentual de mulheres que residem na Zona Central da cidade.*/

public class K5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int resp=0, idadeUsu, regiaoUsu, sexoUsu, 
		contMul=0, contParticipantes=0, contPessoasCentro=0, contHomCentro=0, contHomLeste=0, contMulOeste=0, contMulNorte=0, contMulSul=0, 
		contHomMenorZN=0, contMulMaiorZO=0, contMulC=0, totHomZLeC, totMulOesteNorteSul;
		
		float  pMulOesteNorteSul, pMulMaiorZO, pMulC;
		
		System.out.println("PESQUISA DE REGIÕES EM SP!");
		
		do {
			contParticipantes++;
			System.out.print("\n\nInforme a idade do usuário: ");
			idadeUsu = leia.nextInt();
			
			System.out.println("\nInforme o sexo do usuário. \nDigite 1 para MASCULINO. \nDigite 2 para FEMININO.");
			sexoUsu =  leia.nextInt();
			if(sexoUsu  == 2) {
				contMul++;
			}
			
			System.out.println("\nInforme a região em que o usuário mora: \n1 - CENTRO. \n2 - LESTE. \n3 - NORTE. \n4 - OESTE. \n5 - SUL.");
			regiaoUsu  = leia.nextInt();
			
			
			switch(regiaoUsu) {
			case 1://CENTRO-------------------------------------------------
				if(sexoUsu == 1) {//CENTRO E HOMEM
					contHomCentro++;
				}
				else if(sexoUsu == 2) {
					 contMulC++;
				}
				break;//----------------------------------------------------
			
			case 2://LESTE--------------------------------------------------
				if(sexoUsu == 1) {
					contHomLeste++;
				}
				break;//--------------------------------------------------
				
			case 3://NORTE------------------------------------------
				if(sexoUsu == 2) {
					contMulNorte++;
				}
				if(sexoUsu == 1) {
					if(idadeUsu < 18) {
						contHomMenorZN++;
					}
				}
				break;//----------------------------------------------------
			
			case 4://OESTE--------------------------------------------------
				if(sexoUsu == 2) {
					contMulOeste++;
					if(idadeUsu > 18) {
						contMulMaiorZO++;
					}
				}
				break;//-----------------------------------------------------
			
			case 5://SUL-----------------------------------------------------
				if(sexoUsu == 2) {
					contMulSul++;
				}
				break;//-----------------------------------------------------
			default:
				contParticipantes--;
				System.out.println("REGIÃO INVÁLIDA!");
			}
			
			
			System.out.println("\nDeseja continuar com a pesquisa? Digite 1 para SIM. \nDigite qualquer número para NÃO.");
			resp = leia.nextInt();
		}while(resp==1);
		
		//CALCULOS---------------------------------------------------
		totHomZLeC = (contHomLeste + contHomCentro);
		totMulOesteNorteSul = (contMulOeste + contMulNorte + contMulSul);
		pMulOesteNorteSul = ((totMulOesteNorteSul *100)/contMul);
		pMulMaiorZO = ((contMulMaiorZO*100)/contMul);
		pMulC = ((contMulC*100)/contMul);
		//----------------------------------------------------------------------
		
		System.out.println("\n\nO total de homens que residem nas Zonas Leste e Central: "+totHomZLeC);
		System.out.println("O percentual de mulheres que residem nas Zonas Oeste, Norte e Sul: "+pMulOesteNorteSul+"%");
		System.out.println("O  total  de  homens  menores  de idade  (menores  de  18)  que  residem  na  Zona  Norte  da cidade: "+contHomMenorZN);
		System.out.println("O percentual de mulheres maiores de idade (maiores de 18) que residem na Zona Oeste da cidade: "+pMulMaiorZO+"%");
		System.out.println("O percentual de mulheres que residem na Zona Central da cidade: "+pMulC+"%");
	}
}
