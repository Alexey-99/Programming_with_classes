package by.koroza.programming_with_classes.composition.numberfour;

import java.util.Date;

public class Operation {
	private Date date;
	private double sum;
	private String comment;
	
	public Operation(double sum, String comment) {
		//this.date;
		this.sum = sum;
		this.comment = comment;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}