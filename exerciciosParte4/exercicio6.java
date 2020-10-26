package exerciciosParte4;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		int n;
		System.out.println("Entre com um número N:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=1;i<=n+1;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		
		
		
		sc.close();

	}

}
