package by.koroza.programming_with_classes.composition.numbertwo;

import java.text.DecimalFormat;

public class Engine {
	private double wear;
	private static double wearMax = 100;
	private static double wearMin = 0;

	public Engine() {
		this.wear = wearMin;
	}

	public Engine(double wear) {
		this.wear = wear;
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
		Engine.wearMax = wearMax;
	}

	public static double getWearMin() {
		return wearMin;
	}

	public static void setWearMin(double wearMin) {
		Engine.wearMin = wearMin;
	}

	public void wearIncrease() {
		wear = wear + 0.001;
	}

	@Override
	public int hashCode() {
		int result = 31;
		int prime = 1;
		result = result * prime + Double.hashCode(wear);
		result = result * prime + Double.hashCode(wearMax);
		result = result * prime + Double.hashCode(wearMin);
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
		Engine engine = (Engine) object;
		if (wear != engine.wear) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#.###");
		StringBuilder builder = new StringBuilder();
		builder.append("Engine wear: ").append(format.format(wear)).append("%");
		return builder.toString();
	}
}