package exerciciosParte5;

import java.util.Scanner;
import exerciciosParte5Entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Entre com o nome do funcion�rio:");
		emp.name =sc.next();
		System.out.print("Entre com o sal�rio Bruto:");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Entre com a Taxa:");
		emp.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: "+ emp);
		System.out.println();
		System.out.println("Qual a porcentagem do sal�rio vai aumentar?");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Atualiza��o dos dados: "+ emp);
		
		
		sc.close();
	}

}
