package exerciciosParte4;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		int num;
		System.out.println("Entre com um número ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int i = 0;i<1000;i++) {
			if(i<num && i%2==1) {
				System.out.println(i);
			}
		}
		
		
		
		sc.close();

	}

}
