package exerciciosParte2;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		int horaInicio, horaFinal,soma,a,b;
		
		System.out.println("Entre com a hora de in�cio do jogo: ");
		Scanner sc = new Scanner(System.in);
		horaInicio = sc.nextInt();
		System.out.println("Entre com a hora de final do jogo: ");
		horaFinal = sc.nextInt();
		
		if(horaInicio < 0 || horaInicio> 24) {
			System.out.println("Hor�rio inv�lido");
		}
		else {
			a = (24 - horaInicio);
			
			if(horaFinal < 0 || horaFinal>24) {
			System.out.println("Hor�rio inv�lido");
			}else {
			b = (horaFinal);
			soma = a+b;
			System.out.printf("O n�mero de horas jogadas � de : %d",soma);
		}
		}
		sc.close();
	}

}
