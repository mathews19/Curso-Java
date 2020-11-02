package exerciciosParte5;

import java.util.Scanner;

import exerciciosParte5Entities.Student;

public class NotaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student estudante = new Student();
		System.out.println("Entre como Nome do Aluno:");
		estudante.nome = sc.next();
		System.out.println("Entre com as notas dos três bimestres:");
		estudante.nota1 = sc.nextDouble();
		estudante.nota2 = sc.nextDouble();
		estudante.nota3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL: %s %.2f%n",estudante.nome , estudante.notaFinal());
		if (estudante.notaFinal() < 60.0) {
		System.out.println("REPROVADO");
		System.out.printf("FALTAM %.2f PONTOS%n", estudante.QuantosPontosFaltam());
		}
		else {
		System.out.println("APROVADO");
		}
		sc.close();
		
	}

}
