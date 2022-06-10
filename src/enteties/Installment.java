package enteties;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	
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

	@Override
	public String toString() {
		return sdf.format(dueDate) + " - "+ String.format("%.2f", amountDouble);
	}
	
	
	
}
