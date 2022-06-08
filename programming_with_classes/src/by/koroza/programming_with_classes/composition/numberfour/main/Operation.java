package by.koroza.programming_with_classes.composition.numberfour.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Operation {
	private Date date;
	private double sum;
	private String comment;

	public Operation(double sum, String comment) {
		this.date = new Date();
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

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + (date != null ? date.hashCode() : 1);
		result = result * prime + (Double.hashCode(sum));
		result = result * prime + (comment != null ? comment.hashCode() : 1);
		return result;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null) {
			return false;
		}
		if (!getClass().equals(object.getClass())) {
			return false;
		}
		Operation operation = (Operation) object;
		if (date == null) {
			if (operation.date != null) {
				return false;
			}
		} else if (!date.equals(operation.date)) {
			return false;
		}
		if (sum != operation.sum) {
			return false;
		}
		if (comment == null) {
			if (operation.comment != null) {
				return false;
			}
		} else if (!comment.equals(operation.comment)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		SimpleDateFormat formater = new SimpleDateFormat("d MMMM yyyy", Locale.ENGLISH);
		builder.append("Date: ").append(formater.format(date)).append("\n");
		formater = new SimpleDateFormat("HH mm", Locale.ENGLISH);
		builder.append("Time: ").append(formater.format(date)).append("\n");
		builder.append("Sum operation: ").append(sum).append("\n");
		builder.append("Comment: ").append(comment).append("\n");
		return builder.toString();
	}
}