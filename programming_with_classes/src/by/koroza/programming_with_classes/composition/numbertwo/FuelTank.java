package by.koroza.programming_with_classes.composition.numbertwo;

public class FuelTank {
	private double fuelBalance;

	public FuelTank() {

	}

	public double getFuelBalance() {
		return fuelBalance;
	}

	public void setFuelBalance(double fuelBalance) {
		this.fuelBalance = fuelBalance;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + Double.hashCode(fuelBalance);
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