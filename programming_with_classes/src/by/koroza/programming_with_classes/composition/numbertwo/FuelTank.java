package by.koroza.programming_with_classes.composition.numbertwo;

import java.text.DecimalFormat;

public class FuelTank {
	private double fuelBalance;
	private static double fuelBalanceMin = 0;
	private static double fuelBalanceMax = 100;
	private final static double FUEL_CONSUMPTION_IN_PERCENT = 0.2;
	private final static String FORMAT = "#.#";
	private final static String REMAINIG_FUEL_IN_CAR = "Remaining fuel in the car: ";

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

	public static double getFuelBalanceMax() {
		return fuelBalanceMax;
	}

	public void fuelConsumption() {
		fuelBalance = fuelBalance - FUEL_CONSUMPTION_IN_PERCENT;
	}

	public void refuel() {
		this.fuelBalance = fuelBalanceMax;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + Double.hashCode(fuelBalance);
		result = result * prime + Double.hashCode(fuelBalanceMin);
		result = result * prime + Double.hashCode(fuelBalanceMax);
		result = result * prime + Double.hashCode(FUEL_CONSUMPTION_IN_PERCENT);
		result = result * prime + (FORMAT != null ? FORMAT.hashCode() : 1);
		result = result * prime + (REMAINIG_FUEL_IN_CAR != null ? REMAINIG_FUEL_IN_CAR.hashCode() : 1);
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
		DecimalFormat format = new DecimalFormat(FORMAT);
		StringBuilder builder = new StringBuilder();
		builder.append(REMAINIG_FUEL_IN_CAR).append(format.format(fuelBalance)).append("%");
		return builder.toString();
	}
}