package exerciciosLogica;

import java.util.Scanner;

/*K3-)  Desenvolva  um  programa  para  uma  Universidade  realizar  uma  pesquisa  
entre  os  alunos  que ingressam  nesta  Universidade.  Para  isso,  o  programa  
dever�  solicitar  o  sexo  do  entrevistado  e  o c�digo do curso que deseja realizar.
C�digo      Curso
1           Engenharia da Computa��o
2           Administra��o
3           Medicina
4           Psicologia

O programa dever� realizar a pesquisa at� que a entrada de dados seja finalizada atrav�s 
da vari�vel RESP. Ao final o programa dever� apresentar os seguintes resultados:
   -O percentual de homens que pretendem cursar Engenharia da Computa��o;
   -O percentual de mulheres que pretendem cursar Psicologia;
   -O total de pessoas que pretendem cursar Medicina;
   -O total de mulheres que pretendem cursar Administra��o.*/

public class K3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int resp=1, sexoUsu, cod, contEng=0, contPsicologia=0, contMedicina=0, contAdm=0, contHomEng=0, contMulPsi=0, contMulAdm=0;
		float perHomEng, perMulPsi;
		
		do {
			System.out.println("\n\nInforme o sexo do usu�rio: \nDigite 1 para MASCULINO. \nDigite 2 para FEMININO.");
			sexoUsu = leia.nextInt();
			System.out.println("\nInforme o c�digo do curso que o usu�rio deseja cursar: "
					+ "\n1 - Engenharia da Computa��o"
					+ "\n2 - Administra��o"
					+ "\n3 - Medicina"
					+ "\n4 - Psicologia");
			cod = leia.nextInt();
			
			
			switch(cod) {
			
			case 1:// ENGENHARIA DA COMPUTA��O
				contEng++;
				if(sexoUsu == 1) {// ENGENHARIA E HOMEM
					contHomEng++;
				}
				break;
				
			case 2:// ADM
				contAdm++;
				if(sexoUsu == 2) {//ADM E MULHER
					contMulAdm++;
				}
				break;
				
			case 3:// MEDICINA
				contMedicina++;
				break;
				
			case 4://PSICOLOGIA
				contPsicologia++;
				if(sexoUsu == 2) {//MULHER E PSICOLOGIA
					contMulPsi++;
				}
				break;
			}
			
			System.out.println("\n\nDeseja continuar com a pesquisa? \nDigite 1 para SIM. \nDigite qualquer n�mero para N�O.");
			resp = leia.nextInt();
		}while(resp==1);
		
		perHomEng = ((contHomEng*100)/contEng);          //CALCULO DE PERCENTUAL
		perMulPsi = ((contMulPsi*100)/contPsicologia);
		
		System.out.println("\n\nO percentual de homens que pretendem cursar Engenharia da Computa��o: "+perHomEng+"%");
		System.out.println("O percentual de mulheres que pretendem cursar Psicologia: "+perMulPsi+"%");
		System.out.println("O total de pessoas que pretendem cursar Medicina: "+contMedicina);
		System.out.println("O total de mulheres que pretendem cursar Administra��o: "+contMulAdm);

	}

}
