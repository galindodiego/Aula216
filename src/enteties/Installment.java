package enteties;

import java.util.Date;

public class Installment {

	private Date dueDate;
	private Double amountDouble;
	
	public Installment() {
		
	}

	public Installment(Date dueDate, Double amountDouble) {
		this.dueDate = dueDate;
		this.amountDouble = amountDouble;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmountDouble() {
		return amountDouble;
	}

	public void setAmountDouble(Double amountDouble) {
		this.amountDouble = amountDouble;
	}
	
	
	
}
