package exerciciosParte2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int n ;
		System.out.println("Entre com um n�mero ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n%2==0 ) {
			System.out.println("Esse �mero � par ");
		}else {
			System.out.println("esse n�mero � �mpar ");
		}
		
		
		
		sc.close();
	}

}
