package domainClasses;

import java.time.LocalDate;

public class FineRecord {

	private double amount;
	private LocalDate payDate;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getPayDate() {
		return payDate;
	}

	public void setPayDate(LocalDate payDate) {
		this.payDate = payDate;
	}

}
