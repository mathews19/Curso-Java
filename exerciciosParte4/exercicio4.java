package exerciciosParte4;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
	

		int n;
		
		System.out.println("Entre com um valor N ");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		double x,y,div;
		if(n<0) {
			System.out.println("Valor inválido");
			System.out.println("Entre com um valor N ");
			n= sc.nextInt();
			}
		for(int i=0;i<n;i++) {
			System.out.println("Entre com os valores ");
			x = sc.nextFloat();
			y = sc.nextFloat();
			if(y==0) {
				System.out.println("Impossível dividir");
			}else {
				div = x/y;
				System.out.printf("A divisão de %.1f por %.1f é de %.1f\n",x,y,div);
			}
			}sc.close();
			}
			}
