package exerciciosParte2;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		int qtd,cod;
		double preco = 0;
		
		
		System.out.println("Entre com o c�digo ");
		Scanner sc = new Scanner(System.in);
		cod = sc.nextInt();
		if(cod<0 || cod>5) {
			System.out.println("Entre com um valor v�lido");
		}else { switch(cod) {
		case 1:
			System.out.println("Voc� escolheu cachorro-quente");
			preco = 4.00;
			break;
		case 2:
			System.out.println("Voc� escolheu X-salada");
			preco = 4.50;
			break;
		case 3:
			System.out.println("Voc� escolheu X-bacon");
			preco = 5.00;
			break;
		case 4:
			System.out.println("Voc� escolheu Torrada");
			preco = 2.00;
			break;
		case 5:	
			System.out.println("Voc� escolheu refrigerante");
			preco = 1.50;
			break;
		default :
			System.out.println("Entre com um c�digo cadastrado");
			break;
		}
		System.out.println("Entre com o quantidade ");
		qtd = sc.nextInt();
		if(qtd<0) {
			System.out.println("Valor inexistente");
		}else {
			double total =  qtd*preco;
			System.out.printf("O pre�o total da sua compra ficou: %.2f",total);
			
		}	
		sc.close();
		}
	
	}

}
