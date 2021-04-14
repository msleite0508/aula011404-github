package entities;

public class Employee_fix8 {

	public String name;
	public Double grossSalary;
	public Double tax;
	
	public Employee_fix8() {
		
	}

	public Employee_fix8(String name, Double grossSalary, Double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.setTax(tax);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}
	

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	
	public void increasySalary(double percentage) {
		grossSalary += grossSalary * percentage / 100;
	}
	
	public String toString() {
		return name
				+ ", $"
				+String.format("%.2f%n", NetSalary());
	}



}
