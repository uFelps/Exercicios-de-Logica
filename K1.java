package exerciciosLogica;

/*K1-)  Desenvolva  um  programa  para  apresentar  os  
números  de  1  até  100  em  ordem  crescente e depois em ordem decrescente.*/

public class K1 {

	public static void main(String[] args) {
		int num=1;
		
		do {
			System.out.println(num);
			num++;
		}while(num<=100);
		
		num=100;
		
		do {
			System.out.println(num);
			num--;
		}while(num>=1);

	}

}
