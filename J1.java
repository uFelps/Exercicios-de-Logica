package exerciciosLogica;

/*I1-) Desenvolva um programa para apresentar os números 
 de 1 até 100 em ordem crescente e depois em ordem decrescente.*/

public class J1 {

	public static void main(String[] args) {
		int v=1;
		
		while(v<=100) {
			System.out.println(v);
			v++;
		}
		
		v=100;
		
		while(v>=1) {
			System.out.println(v);
			v--;
			
		}
		

	}

}
