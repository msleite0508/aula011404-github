package entities;

public class BusinessAccount_sec14_heranca extends account_sec14_heranca{
	
	private Double loanLimit;
	
	public BusinessAccount_sec14_heranca() {
		super();
	}

	public BusinessAccount_sec14_heranca(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(Double amount) {
		if(amount <= loanLimit) {
			balance += amount -10;
		}
		
	}
	
	@Override
	public void withDraw(Double amount) {
		super.withDraw(amount);
		balance -= 2.0;
	}
	
	
}
