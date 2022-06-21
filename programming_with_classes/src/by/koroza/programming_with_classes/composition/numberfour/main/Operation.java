package by.koroza.programming_with_classes.composition.numberfour.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Operation {
	private static final String NEXT_LINE = "\n";
	private static final String DATE = "Date: ";
	private static final String DATE_FORMAT = "d MMMM yyyy";
	private static final String TIME = "Time: ";
	private static final String TIME_FORMAT = "HH mm";
	private static final String SUM_OPERATION = "Sum operation: ";
	private static final String COMMENT = "Comment: ";

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
		result = result * prime + (NEXT_LINE != null ? NEXT_LINE.hashCode() : 1);
		result = result * prime + (DATE != null ? DATE.hashCode() : 1);
		result = result * prime + (DATE_FORMAT != null ? DATE_FORMAT.hashCode() : 1);
		result = result * prime + (TIME != null ? TIME.hashCode() : 1);
		result = result * prime + (TIME_FORMAT != null ? TIME_FORMAT.hashCode() : 1);
		result = result * prime + (SUM_OPERATION != null ? SUM_OPERATION.hashCode() : 1);
		result = result * prime + (COMMENT != null ? COMMENT.hashCode() : 1);
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
		SimpleDateFormat formater = new SimpleDateFormat(DATE_FORMAT, Locale.ENGLISH);
		builder.append(DATE).append(formater.format(date)).append(NEXT_LINE);
		formater = new SimpleDateFormat(TIME_FORMAT, Locale.ENGLISH);
		builder.append(TIME).append(formater.format(date)).append(NEXT_LINE);
		builder.append(SUM_OPERATION).append(sum).append(NEXT_LINE);
		builder.append(COMMENT).append(comment).append(NEXT_LINE);
		return builder.toString();
	}
}