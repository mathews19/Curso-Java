package exerciciosParte2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int n ;
		System.out.println("Entre com um número ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n%2==0 ) {
			System.out.println("Esse úmero é par ");
		}else {
			System.out.println("esse número é ímpar ");
		}
		
		
		
		sc.close();
	}

}
