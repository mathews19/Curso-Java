package exerciciosParte3;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		int senha;
		System.out.println("Por favor entre com sua senha: ");
		Scanner sc = new Scanner(System.in);
		senha = sc.nextInt();
		while(senha!= 2002) {
			System.out.println("Senha inválida");
			senha = sc.nextInt();
		}
		System.out.println("Acesso permitido");
		sc.close();
	}

}
