package exerciciosParte2;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		int qtd,cod;
		double preco = 0;
		
		
		System.out.println("Entre com o código ");
		Scanner sc = new Scanner(System.in);
		cod = sc.nextInt();
		if(cod<0 || cod>5) {
			System.out.println("Entre com um valor válido");
		}else { switch(cod) {
		case 1:
			System.out.println("Você escolheu cachorro-quente");
			preco = 4.00;
			break;
		case 2:
			System.out.println("Você escolheu X-salada");
			preco = 4.50;
			break;
		case 3:
			System.out.println("Você escolheu X-bacon");
			preco = 5.00;
			break;
		case 4:
			System.out.println("Você escolheu Torrada");
			preco = 2.00;
			break;
		case 5:	
			System.out.println("Você escolheu refrigerante");
			preco = 1.50;
			break;
		default :
			System.out.println("Entre com um código cadastrado");
			break;
		}
		System.out.println("Entre com o quantidade ");
		qtd = sc.nextInt();
		if(qtd<0) {
			System.out.println("Valor inexistente");
		}else {
			double total =  qtd*preco;
			System.out.printf("O preço total da sua compra ficou: %.2f",total);
			
		}	
		sc.close();
		}
	
	}

}
