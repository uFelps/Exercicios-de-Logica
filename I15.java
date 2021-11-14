package exerciciosLogica;

import java.util.Scanner;

public class I15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int base, expoente, total=1;
		 
		System.out.println("Digite a base:");
		base = leia.nextInt();
		System.out.println("Digite o expoente:");
		expoente = leia.nextInt();
		
		for(int vc=expoente; vc>=1; vc--){
			total = (base*base);
		}
		System.out.println(total);

	}

}
