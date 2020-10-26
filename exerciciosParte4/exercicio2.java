package exerciciosParte4;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int n,x,contin = 0 ,contout= 0;
		
		System.out.println("Entre com um valor N ");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		if(n<0) {
			System.out.println("Valor inválido");
			System.out.println("Entre com um valor N ");
			n= sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println("Entre com os valores para X");
			x = sc.nextInt();
			if(x>=10 && x<=20) {
				contin+=1;
			}else {
				contout+=1;
			}
		}
		System.out.printf("%d in\n",contin);
		System.out.printf("%d out ", contout);
		sc.close();
		}
		}

