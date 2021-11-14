package exerciciosLogica;

import java.util.Scanner;

/*K4-)  Desenvolva  um  programa  para  uma  empresa  fazer  um  pesquisa  de  mercado  
 para  saber  se  as pessoas  gostaram  ou  não  de  um  novo  produto  lançado  no  mercado.  
 Para  isso,  oprograma  deverá solicitar o sexo do entrevistado e sua resposta (sim ou não). 
 O programa deverá realizar a pesquisa até  que  a  entrada  de  dados  seja  finalizada  através  
 da  variável  RESP.  Ao  final  o  programa  deverá apresentar os seguintes resultados:
    -O número de pessoas do sexo feminino que responderam sim;
    -O número de pessoas do sexo masculino que responderam não;
    -A porcentagem de pessoas do sexo feminino que responderam não;
    -A porcentagem de pessoas do sexo masculino que responderam sim;    */

public class K4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int sexoUsu, respostaUsu, resp=1, contSim=0, contNao=0, contSimMul=0, contSimHom=0, contNaoMul=0, contNaoHom=0;
		float porMulNao, porHomSim;
		
		do {
			System.out.println("\n\nInforme o sexo do usuário: \nDigite 1 para MASCULINO. \nDigite 2 para FEMININO.");
			sexoUsu = leia.nextInt();
			System.out.println("\nO usuário gostou do produto? \nDigite 1 para SIM. \nDigite 2 para NÃO.");
			respostaUsu = leia.nextInt();
			
			switch(respostaUsu) {
			case 1://GOSTOU
				contSim++;
				if(sexoUsu ==1) {//GOSTOU / HOMEM
					contSimHom++;
					
				} else if(sexoUsu == 2) {//GOSTOU / MULHER
					contSimMul++;
				}
			
			break;
				
			case 2://NÃO GOSTOU
				contNao++;
				if(sexoUsu == 1) {//NÃO GOSTOU / HOMEM
					contNaoHom++;
					
				}else if(sexoUsu == 2) {//NÃO GOSTOU / MULHER
					contNaoMul++;
				}
				break;
			}
			
			System.out.println("\nDeseja continuar a pesquisa? \nDigite 1 para SIM. \nDigite qualquer número para NÃO.");
			resp = leia.nextInt();
		}while(resp==1);
		
		porMulNao = ((contNaoMul*100)/contNao);
		porHomSim = ((contSimHom*100)/contSim);
		
		System.out.println("\n\nO número de pessoas do sexo feminino que responderam sim: "+contSimMul);
		System.out.println("O número de pessoas do sexo masculino que responderam não: "+contNaoHom);
		System.out.println("A porcentagem de pessoas do sexo feminino que responderam não: "+porMulNao+"%");
		System.out.println("A porcentagem de pessoas do sexo masculino que responderam sim: "+porHomSim+"%");
		
		

	}

}
