package exerciciosLogica;

import java.util.Scanner;

/*K7-)  Desenvolvaum  programa  para  realizar  uma  eleição  entre  dois  candidatos  ao  
 cargo  de presidente da CBF (Confederação Brasileira de Futebol). O programa deverá apresentar 
 o nome dos candidatos  (Ricardo  Teixeira  e  Paulo  Falcão)  para  a  escolha  dos  eleitores.  
 Ao  final  o  programa deverá indicar qual será o novo presidente da entidade, o total de votos 
 e o percentual de votos de cada candidato. Se ocorrer um empate, o mesmo deverá ser indicado e o 
 programa deverá solicitar um  voto  de  desempate.  O  programa  deverá  realizar  a  pesquisa  
 até  que  a  entrada  de  dados  seja finalizada através da variável RESP.*/

public class K7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int resp=1, voto, contRicardo=0, contPaulo=0, contPessoas=0;
		float pRicardo, pPaulo;
		
		System.out.println("ELEIÇÕES PARA PRESIDENTE DA CBF!");
		do {
			contPessoas++;
			System.out.println("\nDigite 1 para votar em Ricardo Teixeira. \nDigite 2 para votar em Paulo Falcão. \nDigite 3 para encerrar as votações.");
			voto = leia.nextInt();
			
			switch(voto) {
			case 1://RICARDO
				contRicardo++;
				break;
			case 2://PAULO
				contPaulo++;
				break;
			case 3://SAIR
				resp = 3;
				contPessoas--;
			    break;
			}
			
		}while(resp!=3);
		
		pRicardo = ((contRicardo*100)/contPessoas);
		pPaulo = ((contPaulo*100)/contPessoas);
		
		if(contRicardo > contPaulo) {
			System.out.println("\nO NOVO PRESIDENTE É O RICARDO TEIXEIRA! \nVotos para Ricardo: "+contRicardo+"  PORCENTAGEM: "+pRicardo+"%");
			System.out.println("\nVotos para Paulo: "+contPaulo+"  PORCENTAGEM: "+pPaulo+"%");
		
		}else if(contPaulo > contRicardo) {
			System.out.println("\nO NOVO PRESIDENTE É O PAULO FALCÃO! \nVotos para Ricardo: "+contRicardo+"  PORCENTAGEM: "+pRicardo+"%");
			System.out.println("\nVotos para Paulo: "+contPaulo+"  PORCENTAGEM: "+pPaulo+"%");
		
		
		}else if(contPaulo == contRicardo) {//EMPATE----------------------------------------
			System.out.println("\nOcorreu um Empate!");
			int votoDesempate;
			contPessoas++;
			System.out.println("Voto de desempate! \nDigite 1 para Ricardo Teixeira. \nDigite 2 para Paulo Falcão.");
			votoDesempate = leia.nextInt();
			
			if(votoDesempate == 1) {//RICARDO TEIXEIRA
				contRicardo++;
				pRicardo = ((contRicardo*100)/contPessoas);
				pPaulo = ((contPaulo*100)/contPessoas);
				System.out.println("\nO novo gerente é o Ricardo Teixeira!" + 
						"\nVotos para Ricardo: "+contRicardo + " Votos.   Percentual: "+pRicardo + "%"+
						"\nVotos para Paulo: "+contPaulo + " Votos.   Percentual: "+pPaulo + "%");		
			}
			else if(votoDesempate == 2){//PAULO FALCÃO
				contPaulo++;
				pPaulo = ((contPaulo*100)/contPessoas);
				pRicardo = ((contRicardo*100)/contPessoas);
				System.out.println("\nO novo gerente é o Paulo Falcão!" + 
						"\nVotos para Ricardo: "+contRicardo + " Votos.   Percentual: "+pRicardo + "%"+
						"\nVotos para Paulo: "+contPaulo + " Votos.   Percentual: "+pPaulo + "%");
			}
		}

	}

}
