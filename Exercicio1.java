import java.util.*;
public class Exercicio1 {

	public static void main(String[] args) {
		String product1 = "computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("Computer, wich price is $ %.2f\n", price1);
		System.out.printf("Office desk, wich price is $ %f\n\n", price2);
		System.out.printf("Record: %d years old, code %d and gender: %s\n\n", age,code,gender);
		System.out.printf("Measue with eight decimal places: %.8f\n", measure);
		System.out.printf("Rouded (Three decimal places): %.3f\n", measure);
		
		
		
	
	}

}
