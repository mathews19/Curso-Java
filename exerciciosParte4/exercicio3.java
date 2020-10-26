package exerciciosParte4;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
	

		int n;
		
		System.out.println("Entre com um valor N ");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		float x,y,z, media;
		if(n<0) {
			System.out.println("Valor inválido");
			System.out.println("Entre com um valor N ");
			n= sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println("Entre com os valores ");
			x = sc.nextFloat();
			y = sc.nextFloat();
			z = sc.nextFloat();
			
			media = ((x*2)+(y*3)+(z*5))/10;
			System.out.printf("A média %d é %.1f\n",i+1,media);
		}
		;
		sc.close();
		}
		}

