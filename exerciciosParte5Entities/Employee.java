package exerciciosParte5Entities;

public class Employee {

	
	public String name;
	public double grossSalary;
	public double Tax;
	
	
	public double netSalary() {
		return grossSalary - Tax;
	}
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary*percentage/100 ;
	}
	public String toString() {
		return name +", sal�rio l�quido $ " + String.format("%.2f", netSalary());
	}
}
