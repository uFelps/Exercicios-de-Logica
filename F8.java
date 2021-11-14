package exerciciosLogica;

import java.util.Scanner;

public class F8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Defina um valor para 'A'");
		a = leia.nextInt();
		System.out.println("Defina um valor para 'B'");
		b = leia.nextInt();
		System.out.println("Defina um valor para 'C'");
		c = leia.nextInt();
		
		if((a>b)&&(b>c)){
			System.out.println("\n"+c+"\n"+b+"\n"+a+"\n");
		
		} else if((a>c)&&(c>b)){
			System.out.println("\n"+b+"\n"+c+"\n"+a+"\n");
		
		} else if((b>a)&&(a>c)){
			System.out.println("\n"+c+"\n"+a+"\n"+b+"\n");
		
		} else if ((b>c)&&(c>a)){
			System.out.println("\n"+a+"\n"+c+"\n"+b+"\n");
		
		} else if((c>a)&&(a>b)){
			System.out.println("\n"+b+"\n"+a+"\n"+c+"\n");
		
		}  else if((c>b)&(b>a)){
			System.out.println("\n"+a+"\n"+b+"\n"+c+"\n");
		
		} 

	}

}
