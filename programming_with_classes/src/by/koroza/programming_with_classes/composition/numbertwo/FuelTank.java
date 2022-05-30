package by.koroza.programming_with_classes.composition.numbertwo;

public class FuelTank {
	private double fuelBalance;
	private static double fuelBalanceMin = 0;
	private static double fuelBalanceMax = 100;

	public FuelTank() {
		this.fuelBalance = fuelBalanceMax;
	}

	public FuelTank(double fuelBalance) {
		this.fuelBalance = fuelBalance;
	}

	public double getFuelBalance() {
		return fuelBalance;
	}

	public void setFuelBalance(double fuelBalance) {
		this.fuelBalance = fuelBalance;
	}
	
	public static double getFuelBalanceMin() {
		return fuelBalanceMin;
	}

	public static void setFuelBalanceMin(double fuelBalanceMin) {
		FuelTank.fuelBalanceMin = fuelBalanceMin;
	}
	
	public static double getFuelBalanceMax() {
		return fuelBalanceMax;
	}

	public static void setFuelBalanceMax(double fuelBalanceMax) {
		FuelTank.fuelBalanceMax = fuelBalanceMax;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + Double.hashCode(fuelBalance);
		result = result * prime + Double.hashCode(fuelBalanceMin);
		result = result * prime + Double.hashCode(fuelBalanceMax);
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
		FuelTank fuelTank = (FuelTank) object;
		if (fuelBalance != fuelTank.fuelBalance) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Remaining fuel in the car: ").append(fuelBalance).append("%");
		return builder.toString();
	}
}