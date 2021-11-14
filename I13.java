package exerciciosLogica;

public class I13 {

	public static void main(String[] args) {
		double soma=0;
		long mult=1;
		
		for(int vc=1; vc<=20; vc++){
			if(vc%2 == 0){//PAR
				mult = (mult * vc);
			
			} else{
				soma = (soma + vc);
			}
		}
		System.out.println("MULTIPLICAÇÃO DE TODOS OS PARES DE 1 A 20: "+mult);
		System.out.println("SOMA DE TODOS OS IMPÁRES DE 1 A 20: "+soma);

	}

}
