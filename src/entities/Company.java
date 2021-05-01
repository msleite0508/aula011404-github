package entities;

public class Company extends TaxPayer {
	
	private int numberOfEmployee;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double annualIncome, int numberOfEmployee) {
		super(name, annualIncome);
		this.numberOfEmployee = numberOfEmployee;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	public Double tax() {
		if(numberOfEmployee > 10) {
			return getAnnualIncome() * 0.14;
		}
		else {
			return getAnnualIncome() * 0.16;
		}
	}
	
	 

}
