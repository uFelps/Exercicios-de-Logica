package exerciciosLogica;

import java.util.Scanner;

/*J6-) Desenvolva um programa para realizar um censo na cidade de São Paulo. 
O programa deverá solicitar a leitura da idade, da regiãoem que reside 
(Centro, Leste, Norte, Oeste ou Sul) e o sexo das pessoas. O programa deverá 
realizar a pesquisa enquanto houver a solicitação de uma nova entrada de dados 
através da variável RESP. Ao final o programa deverá apresentar os seguintes resultados:

   O total de homens e mulheres que residem em cada região da cidade;
   O percentual de homens e mulheres que residem em cada região da cidade;
   O  total  de  homens  menores  de  idade  (menores  de  18)  que  residem  na  Zona  Leste  da cidade;
   O percentual de mulheres maiores de idade (maiores de 18) que residem na Zona Sul da cidade;
   O percentual de homens que residem na Zona Central da cidade;
   O total de pessoas que residem em São Paulo.                                    */

public class J6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double resp=1, idadeUsu, regiaoUsu, totPart=0, contHom=0, sexoUsu, totC=0, totZL=0, totZN=0, totZO=0, totZS=0, contHomC=0, contMulC=0, contHomZL=0, contMulZL=0, contHomZN=0, contMulZN=0, contHomZO=0, contMulZO=0, contHomZS=0, contMulZS=0, contHomMenoresZL=0, contMulMaioresZS=0;
		double pHomC=0, pMulC=0, pHomZL=0, pMulZL=0, pHomZN=0, pMulZN=0, pHomZO=0, pMulZO=0, pHomZS=0, pMulZS=0, pMulMaioresZS=0, pHomC2=0;
		
		while(resp == 1) {
			
			totPart++;
			System.out.print("\nInforme a idade do usuário:");
			idadeUsu = leia.nextInt();
			System.out.println("\nInforme a região onde reside. \nDigite 1 para Centro. \nDigite 2 para Zona Leste. "
					         + "\nDigite 3 para Zona norte. \nDigite 4 para Zona Oeste. \nDigite 5 para Zona Sul");
			regiaoUsu = leia.nextInt();
			System.out.println("\nInforme o sexo do usuário: \nDigite 1 para HOMEM. \nDigite 2 para MULHER.");
			sexoUsu = leia.nextInt();
			
			
			
			if(regiaoUsu == 1) {//CENTRO
				totC++;
				if(sexoUsu == 1) {//HOMEM
					contHomC++;
					contHom++;
				} 
				else if(sexoUsu == 2) {//MULHER
					contMulC++;
				}	
			}
			else if(regiaoUsu == 2) {//ZONA LESTE
				totZL++;
				if(sexoUsu == 1) {//HOMEM
					contHomZL++;
					contHom++;
					if(idadeUsu < 18) {
						contHomMenoresZL++;
					}
				} 
				else if(sexoUsu == 2) {//MULHER
					contMulZL++;
				}
			}
            else if(regiaoUsu == 3) {//ZONA NORTE
            	totZN++;
            	if(sexoUsu == 1) {//HOMEM
					contHomZN++;
					contHom++;
				} 
				else if(sexoUsu == 2) {//MULHER
					contMulZN++;
				}
			}
            else if(regiaoUsu == 4) {//ZONA OESTE
            	totZO++;
            	if(sexoUsu == 1) {//HOMEM
					contHomZO++;
					contHom++;
				} 
				else if(sexoUsu == 2) {//MULHER
					contMulZO++;
				}
			}
            else if(regiaoUsu == 5) {//ZONA SUL
            	totZS++;
            	if(sexoUsu == 1) {//HOMEM
					contHomZS++;
					contHom++;
				} 
				else if(sexoUsu == 2) {//MULHER
					contMulZS++;
					if(idadeUsu > 18) {
						contMulMaioresZS++;
					}
				}
			}
			
			System.out.println("\nDeseja continuar a pesquisa? \nDigite 1 para SIM. \nDigite qualquer número para NÃO.");
			resp = leia.nextInt();
		}
		
		pHomC = ((contHomC*100)/totC);
		pMulC = ((contMulC*100)/totC);
		pHomZL = ((contHomZL*100)/totZL);
		pMulZL = ((contMulZL*100)/totZL);
		pHomZN = ((contHomZN*100)/totZN);
		pMulZN = ((contMulZN*100)/totZN);
		pHomZO = ((contHomZO*100)/totZO);
		pMulZO = ((contMulZO*100)/totZO);
		pHomZS = ((contHomZS*100)/totZS);
		pMulZS = ((contMulZS*100)/totZS);
		pMulMaioresZS = ((contMulMaioresZS*100)/contMulZS);
		pHomC2 = ((contHomC*100)/contHom);
		
		System.out.println("\nRESULTADO: \nCENTRO: \nTotal de Homens: "+contHomC+ ".  Porcentagem: "+ pHomC  + "%" +
		                                            "\nTotal de Mulheres: " + contMulC + ".  Porcentagem: "+pMulC + "%" );
		
		System.out.println("\nZONA LESTE: \nTotal de Homens: "+contHomZL+ ".  Porcentagem: "+ pHomZL  + "%" +
                "\nTotal de Mulheres: " + contMulZL + ".  Porcentagem: "+pMulZL + "%" );
		
		System.out.println("\nZONA NORTE: \nTotal de Homens: "+contHomZN+ ".  Porcentagem: "+ pHomZN  + "%" +
                "\nTotal de Mulheres: " + contMulZN + ".  Porcentagem: "+pMulZN + "%" );
		
		System.out.println("\nZONA OESTE: \nTotal de Homens: "+contHomZO+ ".  Porcentagem: "+ pHomZO + "%" +
                "\nTotal de Mulheres: " + contMulZO + ".  Porcentagem: "+pMulZO + "%" );
		
		System.out.println("\nZONA SUL: \nTotal de Homens: "+contHomZS+ ".  Porcentagem: "+ pHomZS  + "%" +
                "\nTotal de Mulheres: " + contMulZS + ".  Porcentagem: "+pMulZS + "%" );
		
		System.out.println("\nO  total  de  homens  menores  de  idade  (menores  de  18)  que  residem  na  Zona  Leste  da cidade: "+contHomMenoresZL);
		System.out.println("\nO percentual de mulheres maiores de idade (maiores de 18) que residem na Zona Sul da cidade: "+pMulMaioresZS+"%");
		System.out.println("\nO percentual de homens que residem na Zona Central da cidade: "+pHomC2+"%");
		System.out.println("\nO total de pessoas que residem em São Paulo: "+totPart);
	}

}
