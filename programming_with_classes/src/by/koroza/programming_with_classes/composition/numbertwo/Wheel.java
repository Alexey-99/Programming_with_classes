package by.koroza.programming_with_classes.composition.numbertwo;

import java.text.DecimalFormat;

public class Wheel {
	private static int count = 1;

	private int id;
	private double wear;
	private static double wearMax = 100;
	private static double wearMin = 0;
	private static final String WEAR_FORMAT = "#.###";
	private static final String WHEEL_ID = "Wheel id ";
	private static final String SPACE_WEAR_SPACE = " wear: ";

	public Wheel() {
		this.id = count++;
		this.wear = wearMin;
	}

	public Wheel(double wear) {
		this.wear = wear;
		this.id = count++;
	}

	public double getWear() {
		return wear;
	}

	public void setWear(double wear) {
		this.wear = wear;
	}

	public static double getWearMax() {
		return wearMax;
	}

	public static void setWearMax(double wearMax) {
		Wheel.wearMax = wearMax;
	}

	public static double getWearMin() {
		return wearMin;
	}

	public static void setWearMin(double wearMin) {
		Wheel.wearMin = wearMin;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public void wearIncrease() {
		wear = wear + 0.01;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + Double.hashCode(wear);
		result = result * prime + Double.hashCode(wearMax);
		result = result * prime + Double.hashCode(wearMin);
		result = result * prime + count;
		result = result * prime + id;
		result = result * prime + (WEAR_FORMAT != null ? WEAR_FORMAT.hashCode() : 1);
		result = result * prime + (WHEEL_ID != null ? WHEEL_ID.hashCode() : 1);
		result = result * prime + (SPACE_WEAR_SPACE != null ? SPACE_WEAR_SPACE.hashCode() : 1);
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
		Wheel wheel = (Wheel) object;
		if (wear != wheel.wear) {
			return false;
		}
		if (id != wheel.id) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat(WEAR_FORMAT);
		StringBuilder builder = new StringBuilder();
		builder.append(WHEEL_ID).append(id).append(SPACE_WEAR_SPACE).append(format.format(wear)).append("%");
		return builder.toString();
	}
}