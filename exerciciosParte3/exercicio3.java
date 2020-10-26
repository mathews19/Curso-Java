package exerciciosParte3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		int cod,qa = 0,qg= 0 ,qd= 0;
		
		System.out.println("Entre com o código do produto");
		Scanner sc = new Scanner(System.in);
		cod = sc.nextInt();
		
		while(cod!= 4) {
				
				if(cod>4 || cod<0) {
					System.out.println("código inválido");
				}
				switch(cod) {
				case 1:
					qa +=1;
					break;
				case 2:
					qg +=1;
					break;
				case 3:
					qd +=1;
					break;
				}
				System.out.println("Entre com outro código (Se você digitar 4 o programa se encerrará)");
				cod = sc.nextInt();
			
			
		}
		System.out.println("Muito Obrigado!!");
		System.out.printf("Alcool: %d\n", qa);
		System.out.printf("Gasolina: %d\n", qg);
		System.out.printf("Diesel: %d\n", qd);
		sc.close();
	}

}
