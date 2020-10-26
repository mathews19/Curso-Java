package exerciciosParte1;

import java.util.Scanner;

public class exercicio4 {
public static void main(String args[]) {
	int num;
	double horaTrabalho, salarioHora,salarioTotal;
	
	System.out.println("Digite o número do fúncionário");
	Scanner ler = new Scanner(System.in);
	num = ler.nextInt();
	System.out.println("Digite o número de horas de trabalho e o salário por hora");
	horaTrabalho = ler.nextDouble();
	salarioHora = ler.nextDouble();
	
	salarioTotal = salarioHora*horaTrabalho;
	System.out.printf("O seu salário é de: %.2f",salarioTotal);
	
	ler.close();
}
}
